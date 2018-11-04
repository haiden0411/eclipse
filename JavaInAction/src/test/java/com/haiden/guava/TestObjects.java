package com.haiden.guava;

import org.junit.Test;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

public class TestObjects
{
	@Test
	public void test1()
	{
		Book book = new Book();
		book.setId(1);
		book.setOwner("haiden");
		book.setAuthor("jame");
		book.setTitle("java in atcion");

		System.out.println(book);
	}

	@Test
	public void test2()
	{
		Book book1 = null;
		Book book2 = new Book();
		Book book3 = MoreObjects.firstNonNull(book1, book2);
		System.out.println(Objects.equal(book1, book3));

	}
}
