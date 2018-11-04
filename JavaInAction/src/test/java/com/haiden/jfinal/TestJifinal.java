package com.haiden.jfinal;

import java.io.File;
import java.sql.SQLException;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.haiden.entity.Blog;
import com.jfinal.kit.Base64Kit;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.IAtom;
import com.jfinal.plugin.activerecord.Page;
import com.jfinal.plugin.activerecord.Record;
import com.jfinal.plugin.activerecord.tx.Tx;
import com.jfinal.plugin.cron4j.Cron4jPlugin;
import com.jfinal.plugin.druid.DruidPlugin;
import com.jfinal.template.source.ClassPathSourceFactory;

public class TestJifinal
{
	@Before
	public void setUp()
	{
		DruidPlugin dp = new DruidPlugin(
				"jdbc:mysql://127.0.0.1:3306/test?characterEncoding=utf8&zeroDateTimeBehavior=convertToNull", "root",
				"haiden");
		ActiveRecordPlugin arp = new ActiveRecordPlugin(dp);
		arp.getEngine().setSourceFactory(new ClassPathSourceFactory());
		arp.addSqlTemplate("all.sql");
		arp.addMapping("blog", Blog.class);
		dp.start();
		arp.start();

	}

	@Test
	public void testMysql()
	{
		List<Blog> lists = Blog.dao.find("select * from blog");
		System.out.println(lists.size());

	}

	@Test
	public void testMysqlInsert()
	{
		for (int i = 0; i < 30; i++)
		{
			new Blog().set("title", "haiden" + i).set("content", "student at " + i).save();
		}
	}

	@Test
	public void testMysqlPageNate()
	{

		Page<Blog> blogPage = Blog.dao.paginate(1, 10, "select * ", "from blog where id >? order by id", 15);
		List<Blog> lists = blogPage.getList();
		for (Blog blog : lists)
		{
			System.out.println("id=" + blog.getInt("id") + ",title=" + blog.getStr("title") + ",content="
					+ blog.getStr("content"));
		}
	}

	@Test
	public void testMysqlDbRecorld()
	{
		Record blog = new Record().set("title", "2018-7-12").set("content", "orcle���ֶζԴ�Сд����");
		System.out.println(Db.save("blog", blog));
	}

	@Test
	public void testMysqlDbTx()
	{
		boolean succed = Db.tx(new IAtom()
		{
			@Override
			public boolean run() throws SQLException
			{
				Record blog = new Record().set("title", "2018-7-12").set("content", "����ѧϰ��jfinal���÷����о���ǿ��");
				Db.save("blog", blog);
				System.out.println(1 / 0);
				Record blog1 = new Record().set("title", "2018-7-12").set("content", "�������������ʦ�ĿΣ�һ������Ҫ��Ч��");
				Db.save("blog", blog1);
				return true;
			}
		});

		System.out.println(succed);
	}

	@Test
	public void testMysqlDbNoTx()
	{
		Record blog = new Record().set("title", "2018-7-12").set("content", "����ѧϰ��jfinal���÷����о���ǿ��");
		Db.save("blog", blog);
		System.out.println(1 / 0);
		Record blog1 = new Record().set("title", "2018-7-12").set("content", "�������������ʦ�ĿΣ�һ������Ҫ��Ч��");
		Db.save("blog", blog1);

	}

	@Test
	public void testMySqlDelete()
	{

		// Record blog = Db.findById("blog", 44);
		// System.out.println(Db.delete("blog", blog));
		// Db.delete("delete from blog where id>12");
		boolean succed = Db.tx(new IAtom()
		{
			@Override
			public boolean run() throws SQLException
			{
				Db.deleteById("blog", 72);
				System.out.println(1 / 0);
				Db.deleteById("blog", 73);
				return true;
			}
		});

		System.out.println(succed);
	}

	@Test
	public void testMySqlSqlTemplate()
	{

		// String sql = Db.getSql("findBlog");
		String sql = Blog.dao.getSql("findBlog");
		List<Record> lists = Db.find(sql, 60);
		System.out.println(lists.size());
		for (Record blog : lists)
		{
			System.out.println("id=" + blog.getInt("id") + ",title=" + blog.getStr("title") + ",content="
					+ blog.getStr("content"));
		}
	}

	@Test
	public void testCron()
	{
		String[] command = { "C:\\tomcat\\bin\\catalina.bat", "start" };
		String[] envs = { "CATALINA_HOME=C:\\tomcat", "JAVA_HOME=C:\\jdks\\jdk5" };
		File directory = new File("C:\\MyDirectory");
		
		ProcessTask task = new ProcessTask(command, envs, directory);
		Cron4jPlugin cp = new Cron4jPlugin();
	}
	@Test
	public void testkit()
	{
		byte[] str = Base64Kit.decode("rpm");
		System.out.println(str.toString());
	}

}
