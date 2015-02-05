package org.bugkillers.algorithm.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 * <p/>
 * <p>
 * @author 刘新宇
 *
 * <p>
 * @date 2015年2月5日 下午9:56:54
 * <p>
 * @version 0.0.1
 */
public class BubbleSort {

	private static void bubble() {
		Integer array[] = { 97, 9, 15, 87, 109, 90, 99, 100 };
		// 最多只做n-1次循环
		for (int i = 0; i < array.length - 1; i++) {
			// 范围逐步缩小，前面的数已经很小了，不需要再次冒泡
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[i] < array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println(Arrays.asList(array));
	}

	public static void main(String args[]) {
		bubble();
	}
}
