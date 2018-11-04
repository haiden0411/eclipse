package com.haiden.guava;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

import com.google.common.io.ByteSink;
import com.google.common.io.ByteSource;
import com.google.common.io.Files;

public class TestFiles
{
	@Test
	public void test01() throws IOException
	{
		File source = new File("d:/test/line.txt");
		File dest = new File("d:/test/line2.txt");
		ByteSource byteSource = Files.asByteSource(source);
		ByteSink byteSink = Files.asByteSink(dest);
		byteSource.copyTo(byteSink);
	}
	@Test
	public void test02() {
		File f = new File("aa.txt");
		System.out.println(f.getAbsolutePath());
	}
}
