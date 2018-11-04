package com.haiden.dataStructure;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.haiden.dataStructure.link.Link;

public class TestLink
{
	private Link link = null;

	@Before
	public void setUp()
	{
		link = new Link();
		link.addNode("aa");
		link.addNode("bb");
		link.addNode("cc");
		link.addNode("dd");
		link.addNode("ee");
		link.addNode("ff");
	}

	@Test
	public void testAdd()
	{
		assertEquals(link.size(), 6);
		System.out.println(link.size());
	}

	@Test
	public void testDel()
	{
		link.delNode("cc");
		link.display();
		link.delNode("aa");
		link.display();
	}

	@Test
	public void testDisplay()
	{
		link.display();
	}

	@Test
	public void testInsert()
	{
		link.insertNode("aa", "haiden");
		link.insertNode("bb", "gree");
		link.insertNode("cc", "myhaiden");
		link.display();
		System.out.println(link.size());
	}

	@Test
	public void testFindNode()
	{
		int i = link.findNode("add");
		System.out.println("元素下标为:" + i);
	}
}
