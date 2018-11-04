package com.haiden.guava;

import java.io.IOException;
import java.util.List;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.TitlePaneLayout;

import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.io.LineProcessor;

public class ToLineListProcessor implements LineProcessor<List<String>>
{
	
	public static final Splitter splitter =Splitter.on(",");
	private List<String> bookTitles = Lists.newArrayList();
	private static final int TITLE_INDEX = 1;

	@Override
	public boolean processLine(String line) throws IOException
	{
		bookTitles.add(Iterables.get(splitter.split(line),TITLE_INDEX));
		return true;
	}

	@Override
	public List<String> getResult()
	{
		return bookTitles;
	}

}
