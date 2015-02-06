package org.bugkillers.algorithm.sort;

import java.util.Arrays;

/**
 * 希尔排序 基本思想：算法先将要排序的一组数按某个增量d（n/2,n为要排序数的个数）分成若干组，每组中记录的下标相差d.对每组中全部元素进行直接插入排序，
 * 然后再用一个较小的增量（d/2）对它进行分组，在每组中再进行直接插入排序。当增量减到1时，进行直接插入排序后，排序完成。
 * <p/>
 * <p>
 * @author 刘新宇
 *
 * <p>
 * @date 2015年2月6日 下午12:00:51
 * <p>
 * @version 0.0.1
 */
public class ShellSort {

	private static void shell() {
		Integer array[] = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5,
				4, 62, 99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51 };
		double d1 = array.length;
		int temp = 0;
		while (true) {
			int d = (int) Math.ceil(d1 / 2);
			for (int x = 0; x < d; x++) {
				for (int i = x + d; i < array.length; i += d) {
					int j = i - d;
					temp = array[i];
					for (; j >= 0 && temp < array[j]; j -= d) {
						array[j + d] = array[j];
					}
					array[j + d] = temp;
				}
			}
			if (d == 1)
				break;
		}
		System.out.println(Arrays.asList(array));
	}

	public static void main(String[] args) {
		long begin = System.currentTimeMillis();
		shell();
		long end = System.currentTimeMillis();
		System.out.println(end - begin);
	}
}
