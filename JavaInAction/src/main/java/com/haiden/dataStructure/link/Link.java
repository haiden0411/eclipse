package com.haiden.dataStructure.link;

public class Link
{
	Node head;

	public Link()
	{
		head = new Node();
		head.next = null;
	}

	// 新增节点
	public void addNode(String name)
	{
		Node p = head;
		while (p.hasNext())
		{
			p = p.getNext();
		}
		Node node = new Node(name);
		p.setNext(node);

	}

	// 删除节点
	public void delNode(String name)
	{
		Node p = head;
		while (p.hasNext())
		{
			if (p.getNext().getName().equals(name))
			{
				p.setNext(p.getNext().getNext());
				break;
			}
			p = p.getNext();
		}
	}

	// 插入节点
	public void insertNode(String name, String insertName)
	{
		Node p = head;
		while (p.hasNext())
		{
			if (p.getNext().getName().equals(name))
			{
				Node insertNode = new Node(insertName);
				insertNode.setNext(p.getNext());
				p.setNext(insertNode);
				break;
			}
			p = p.getNext();
		}

	}

	// 查找节点
	public int findNode(String name)
	{
		Node p = head;
		int num = -1;
		while (p.hasNext())
		{
			if (p.getNext().getName().equals(name))
			{
				num++;
				break;
			}
			p = p.getNext();
		}

		if (num == -1)
		{
			System.out.println("没有查到");

		}
		return num;
	}

	public int size()
	{
		Node p = head;
		int num = 0;
		while (p.hasNext())
		{
			num++;
			p = p.getNext();
		}
		return num;
	}

	public void display()
	{
		Node p = head;
		while (p.hasNext())
		{
			System.out.println(p.getNext().getName());
			p = p.getNext();
		}
	}

}
