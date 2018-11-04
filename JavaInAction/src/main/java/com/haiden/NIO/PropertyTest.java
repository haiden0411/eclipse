package com.haiden.NIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropertyTest
{

	public static void main(String[] args)
	{
		URL url = PropertyTest.class.getClassLoader().getResource("conf.properties");
		File proFile = new File(url.getFile());
		System.out.println(proFile.getAbsolutePath());
		FileReader fr = null;
		Properties p = new Properties();
		try {
			fr = new FileReader(proFile);
			p.load(fr);
			Set<String> set = p.stringPropertyNames();
			for (Iterator<String> iterator = set.iterator(); iterator.hasNext();) {
				String key = iterator.next();
				String value = p.getProperty(key);
				System.out.println("key=" + key + " value=" + value);

			}

		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			if (fr != null) {
				try {
					fr.close();
				}
				catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
