package org.bugkillers.algorithm.sort;

import java.util.Arrays;

/**
 * 快速排序 
 * 基本思想：选择一个基准元素,通常选择第一个元素或者最后一个元素,通过一趟扫描，将待排序列分成两部分,一部分比基准元素小,一部分大于等于基准元素,
 * 此时基准元素在其排好序后的正确位置,然后再用同样的方法递归地排序划分的两部分。
 * 最坏情况的时间复杂度为O(n2)，最好情况时间复杂度为O(nlog2n)
 * <p/>
 * <p>
 * 
 * @author 刘新宇
 *
 *         <p>
 * @date 2015年2月6日 下午3:05:00
 *       <p>
 * @version 0.0.1
 */
public class QuickSort {

	public static int getMiddle(int[] array, int low, int high) {
		int tmp = array[low]; // 数组的第一个作为中轴
		while (low < high) {
			while (low < high && array[high] >= tmp) {
				high--;
			}
			array[low] = array[high]; // 比中轴小的记录移到低端
			while (low < high && array[low] <= tmp) {
				low++;
			}
			array[high] = array[low]; // 比中轴大的记录移到高端
		}
		array[low] = tmp; // 中轴记录到尾
		return low; // 返回中轴的位置
	}

	public static void _quickSort(int[] array, int low, int high) {
		if (low < high) {
			int middle = getMiddle(array, low, high); // 将list数组进行一分为二
			_quickSort(array, low, middle - 1); // 对低字表进行递归排序
			_quickSort(array, middle + 1, high); // 对高字表进行递归排序
		}
	}

	public static void quick(int[] array) {
		if (array.length > 0) { // 查看数组是否为空
			_quickSort(array, 0, array.length - 1);
		}
		System.out.println(Arrays.toString(array));
	}

	public static void main(String[] args) {
		int array[] = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5,
				4, 62, 99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51 };
		sort(array);
	}
	private static void sort(int array[]){
		long begin = System.currentTimeMillis();
		quick(array);
		long end = System.currentTimeMillis();
		System.out.println(end - begin);
	}
}
