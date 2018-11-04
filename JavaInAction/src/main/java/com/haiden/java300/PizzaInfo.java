package com.haiden.java300;

public enum PizzaInfo
{
	SMALL(8, 2.0, "小号"), MIDDLE(10, 1, "中号"), LARGE(9, 1.7, "大号");

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
		return desc + "的价格为：" + size * price + "元";
	}

	public static void main(String[] args)
	{
		for (PizzaInfo info : PizzaInfo.values())
		{
			System.out.println(info);
		}
	}

}
