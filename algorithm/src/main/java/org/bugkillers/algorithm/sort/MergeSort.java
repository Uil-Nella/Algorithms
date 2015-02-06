package org.bugkillers.algorithm.sort;

import java.util.Arrays;

/**
 * 归并排序 基本排序：归并（Merge）排序法是将两个（或两个以上）有序表合并成一个新的有序表，即把待排序序列分为若干个子序列，每个子序列是有序的。
 * 然后再把有序子序列合并为整体有序序列。
 * <p/>
 * <p>
 * @author 刘新宇
 *
 * <p>
 * @date 2015年2月6日 下午3:16:04
 * <p>
 * @version 0.0.1
 */
public class MergeSort {

	public static void sort0(int[] data, int left, int right) {
		// TODO Auto-generated method stub
		if (left < right) {
			// 找出中间索引
			int center = (left + right) / 2;
			// 对左边数组进行递归
			sort0(data, left, center);
			// 对右边数组进行递归
			sort0(data, center + 1, right);
			// 合并
			merge(data, left, center, right);

		}
		
	}
	public static void sort(int array[]){
		long begin = System.currentTimeMillis();
		sort0(array, 0, array.length - 1);
		long end = System.currentTimeMillis();
		System.out.println(Arrays.toString(array));
		System.out.println(end - begin);
	}

	public static void merge(int[] data, int left, int center, int right) {
		// TODO Auto-generated method stub
		int[] tmpArr = new int[data.length];
		int mid = center + 1;
		// third记录中间数组的索引
		int third = left;
		int tmp = left;
		while (left <= center && mid <= right) {
			// 从两个数组中取出最小的放入中间数组
			if (data[left] <= data[mid]) {
				tmpArr[third++] = data[left++];
			} else {
				tmpArr[third++] = data[mid++];
			}
		}
		// 剩余部分依次放入中间数组
		while (mid <= right) {
			tmpArr[third++] = data[mid++];
		}
		while (left <= center) {
			tmpArr[third++] = data[left++];
		}
		// 将中间数组中的内容复制回原数组
		while (tmp <= right) {
			data[tmp] = tmpArr[tmp++];
		}
		
	}

	public static void main(String[] args) {
		int array[] = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4,
				62, 99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51 };
		sort(array);
		
	}

}
