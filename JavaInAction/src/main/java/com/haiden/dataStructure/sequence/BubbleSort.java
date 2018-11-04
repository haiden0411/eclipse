package com.haiden.dataStructure.sequence;

import java.util.Random;

public class BubbleSort
{
	// 冒泡排序
	public static void bubbleSort(int[] arr)
	{

		int loop = 0;
		for (int i = 0; i < arr.length - 1; i++)
		{
			for (int j = i + 1; j <= arr.length - 1; j++)
			{
				if (arr[i] > arr[j])
				{
					// 交换两个数字
					arr[i] = arr[i] + arr[j];
					arr[j] = arr[i] - arr[j];
					arr[i] = arr[i] - arr[j];
				}

			}
		}

	}

	// 普通排序
	public static void baseSort(int[] arr)
	{
		long start = System.currentTimeMillis();
		int loop = 0;
		for (int i = 0; i < arr.length - 1; i++)
		{
			for (int j = 0; j < arr.length - 1; j++)
			{
				if (arr[j] > arr[j + 1])
				{
					arr[j] = arr[j] + arr[j + 1];
					arr[j + 1] = arr[j] - arr[j + 1];
					arr[j] = arr[j] - arr[j + 1];
				}
			}

		}

	}

	// 快速排序

	public static void quickSort(int[] arr, int low, int high)
	{
		int i, j, index;
		if (low > high)
		{
			return;
		}
		i = low;
		j = high;
		index = arr[i];// 取基数
		while (i < j)
		{
			while (i < j && arr[j] >= index)
			{
				j--;
			}
			// 当前数据大于基数时
			if (i < j)
			{
				arr[i++] = arr[j];
			}

			while (i < j && arr[i] < index)
			{
				i++;
			}

			if (i < j)
			{
				arr[j--] = arr[i];
			}
		}
		arr[i] = index;
		quickSort(arr, low, i - 1);
		quickSort(arr, i + 1, high);

	}

	// 选择排序

	public static void selectSort(int[] arr)
	{
		int temp = 0;
		int i = 0;
		for (int j = 0; j < arr.length - 1; j++)
		{
			i = getMinValue(arr, j);
			// 交换两个数据
			if (i != j)
			{
				temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}

		}

	}

	// 获取最小值的下标
	public static int getMinValue(int[] arr, int i)
	{
		int index = arr[i];
		int temp = i;
		for (int j = i + 1; j <= arr.length - 1; j++)
		{
			if (index > arr[j])
			{
				index = arr[j];
				temp = j;
			}
		}
		return temp;
	}

	// 插入排序
	public static void insertSort(int[] arr)
	{
		int i, j, k;
		int insertNode;
		for (i = 1; i < arr.length; i++)
		{
			insertNode = arr[i];
			j = i - 1;
			while (j >= 0 && insertNode < arr[j])
			{
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = insertNode;
		}
	}

	public static void main(String[] args)
	{
		int[] arr = new int[100000];
		Random ran = new Random();
		for (int i = 0; i < 100000; i++)
		{
			arr[i] = ran.nextInt(100000);
		}

		// int[] arr = { 1, 44, 1, 25, 85, 2, 11, 31 };
		// int[] arr1 = { 3, 2, 1, 0, -1, 454, 578, 47 };
		long start = System.currentTimeMillis();
		// baseSort(arr);
		// quickSort(arr, 0, arr.length - 1);
		// bubbleSort(arr);
		// selectSort(arr);
		insertSort(arr);
		long end = System.currentTimeMillis();
		System.out.println("排序用时为：" + (end - start));
		// System.out.println(Arrays.toString(arr));

	}

}
