package com.haiden.dataStructure.sequence;

import java.util.Arrays;

public class Sort
{
	public static void quickSort(int[] arr, int low, int high)
	{
		int i, j, index;

		if (low > high)
		{
			return;
		}
		i = low;
		j = high;
		index = arr[i];
		while (i < j)
		{
			while (i < j && index <= arr[j])
			{
				j--;
			}
			if (i < j)
			{
				arr[i++] = arr[j];
			}
			while (i < j && index > arr[i])
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

	public static void main(String[] args)
	{
		int[] arr = { 3, 2, 1, 0, 454, 578, 47 };
		quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}
}
