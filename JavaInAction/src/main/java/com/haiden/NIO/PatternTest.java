package com.haiden.NIO;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTest
{

	public static void main(String[] args)
	{
		Pattern p = Pattern.compile("\\d+");
		Matcher m = p.matcher("12554");

		System.out.println("m----" + m.matches());
		System.out.println(Pattern.matches("windows(?:97|2003|98)", "windows97"));
	}

}
