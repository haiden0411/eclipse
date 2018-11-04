package com.haiden.dataStructure.link;

public class Node
{
	String name;
	Node next;

	public Node()
	{
	}

	public Node(String name)
	{
		this.name = name;
		next = null;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Node getNext()
	{
		return next;
	}

	public void setNext(Node next)
	{
		this.next = next;
	}

	public boolean hasNext()
	{
		if (this.getNext() != null)
		{
			return true;
		}

		return false;
	}
}
