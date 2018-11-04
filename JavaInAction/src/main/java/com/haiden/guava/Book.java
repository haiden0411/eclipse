package com.haiden.guava;

import com.google.common.base.MoreObjects;

public class Book
{
	private int id;
	private String title;
	private String author;
	private String owner;

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public String getAuthor()
	{
		return author;
	}

	public void setAuthor(String author)
	{
		this.author = author;
	}

	public String getOwner()
	{
		return owner;
	}

	public void setOwner(String owner)
	{
		this.owner = owner;
	}

	@Override
	public String toString()
	{
		return MoreObjects.toStringHelper(this).omitNullValues().add("id", id).add("title", title).add("author", author)
				.add("owner", owner).toString();
	}

}
