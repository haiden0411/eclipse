package com.haiden.java300;

public enum PizzaInfo
{
	SMALL(8, 2.0, "С��"), MIDDLE(10, 1, "�к�"), LARGE(9, 1.7, "���");

	private int size;
	private double price;
	private String desc;

	private PizzaInfo(int size, double price, String desc)
	{
		this.size = size;
		this.price = price;
		this.desc = desc;
	}

	@Override
	public String toString()
	{
		return desc + "�ļ۸�Ϊ��" + size * price + "Ԫ";
	}

	public static void main(String[] args)
	{
		for (PizzaInfo info : PizzaInfo.values())
		{
			System.out.println(info);
		}
	}

}
