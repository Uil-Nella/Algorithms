package org.bugkillers.algorithm.sort;

import java.util.Arrays;

/**
 * 直接插入排序 基本思想：在要排序的一组数中，假设前面(n-1) [n>=2] 个数已经是排 好顺序的，现在要把第n个数插到前面的有序数中，使得这n个数
 * 也是排好顺序的。如此反复循环，直到全部排好顺序。
 * <p/>
 * <p>
 * @author 刘新宇
 *
 * <p>
 * @date 2015年2月6日 上午8:42:36
 * <p>
 * @version 0.0.1
 */
public class InsertSort {

	private static void insert(int array[]) {
		
		// 假设第一位之前已经排好序，一次从第二位做插判断入
		for (int i = 1; i < array.length; i++) {
			int j = i - 1;
			// 将需要做插入的数存贮，寻找合适的位置
			int temp = array[i];
			for (; j >= 0 && temp < array[j]; j--) {
				array[j + 1] = array[j];
			}
			array[j + 1] = temp;
		}
	}

	public static void main(String[] args) {
		int array[] = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5,
				4, 62, 99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51 };
		long begin = System.currentTimeMillis();
		insert(array);
		long end = System.currentTimeMillis();
		System.out.println(Arrays.toString(array));
		System.out.println(end - begin);
	}
}
