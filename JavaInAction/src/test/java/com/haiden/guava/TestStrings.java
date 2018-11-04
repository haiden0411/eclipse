package com.haiden.guava;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jws.Oneway;

import org.junit.Before;
import org.junit.Test;

import com.google.common.base.Joiner;
import com.google.common.base.Strings;

public class TestStrings
{
	List<String> strList = null;

	@Before
	public void setUp()
	{
		strList = new ArrayList<>();
		strList.add("aa");
		strList.add("bb");
		strList.add("");
		strList.add(null);
		strList.add("dd");
	}

	@Test
	public void testStrings()
	{
		System.out.println(strList.size());
		System.out.println(Joiner.on(",").skipNulls().join(strList));
		System.out.println(Joiner.on(",").useForNull("null").join(strList));

		assertEquals("aa,bb,,dd", Joiner.on(",").skipNulls().join(strList));
		assertEquals("aa,bb,,null,dd", Joiner.on(",").useForNull("null").join(strList));

		Joiner stringJoiner = Joiner.on(",").skipNulls();
		// stringJoiner.useForNull("missing");
		String str = stringJoiner.join("foo", null, "haiden");
		System.out.println(str);

		System.out.println("end of the test");

		StringBuilder stringBuilder = new StringBuilder();
		Joiner joiner = Joiner.on("|").skipNulls();
		joiner.appendTo(stringBuilder, "foo", "bar", "baz");
		System.out.println(stringBuilder.toString());

	}

	@Test
	public void testJoiner() throws IOException
	{
		FileWriter fileWriter = new FileWriter(new File("d:/test/guava.txt"));

		List<Date> dateList = new ArrayList<>();
		dateList.add(new Date());
		dateList.add(new Date());
		dateList.add(new Date());
		dateList.add(new Date());

		Joiner joiner = Joiner.on("#").useForNull(" ");
		joiner.appendTo(fileWriter, dateList);
		fileWriter.close();
	}

	@Test
	public void testBuildId() throws IOException, ParseException
	{
		String buildId = "20180625120456";

		String year = buildId.substring(0, 4);
		String month = buildId.substring(4, 6);
		String date = buildId.substring(6, 8);
		String hour = buildId.substring(8, 10);
		String minutes = buildId.substring(10, 12);
		String second = buildId.substring(12, 14);

		Joiner joiner = Joiner.on("-").skipNulls();

		StringBuilder sb = new StringBuilder();
		sb.append(year).append("-").append(month).append("-").append(date).append(" ").append(hour).append(":")
				.append(minutes).append(":").append(second);
		System.out.println(sb.toString());
		String newDate = joiner.join(year, month, date, hour, minutes, second);
		System.out.println(newDate);
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d = sf.parse(sb.toString());
		
		System.out.println(d);

	}
	
	@Test
	public void test1() {
		String aa = "haidengre";
		String bb = "haidafaafadgre";
		
		String common1 = Strings.commonPrefix(aa, bb);
		String common2 = Strings.commonSuffix(aa, bb);
		System.out.println("common prefix="+common1);
		System.out.println("common sufix="+common2);
		String cc = "";
		String dd = null;
		System.out.println(Strings.emptyToNull(cc));
		System.out.println(Strings.nullToEmpty(dd));
		String ee ="haiden";
		System.out.println(Strings.padEnd(ee, 7, '/'));
		System.out.println(Strings.padStart(ee, 10, '5'));
		System.out.println(Strings.repeat(ee, 2));
	}
}
