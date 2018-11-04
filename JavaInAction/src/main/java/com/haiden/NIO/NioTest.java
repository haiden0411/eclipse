package com.haiden.NIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioTest
{

	public static void main(String[] args)
	{
		URL url = NioTest.class.getClassLoader().getResource("aa.txt");
		System.out.println(url.getPath());
		File f = new File(url.getPath());
		FileInputStream fis = null;
		FileChannel fc = null;
		try {
			fis = new FileInputStream(f);
			fc = fis.getChannel();
			ByteBuffer bbf = ByteBuffer.allocate(1024);
			fc.read(bbf);
			System.out.println(new String(bbf.array()));
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			if (fis != null) {
				try {
					fis.close();
				}
				catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
