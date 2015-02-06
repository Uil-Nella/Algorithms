package org.bugkillers.algorithm.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 * <p/>
 * 冒泡排序（Bubble Sort）是一种简单的排序算法。它重复地走访过要排序的数列，一次比较两个元素，如果他们的顺序错误就把他们交换过来。走访数列的工作是重复地进行直到没有再需要交换，也就是说该数列已经排序完成。这个算法的名字由来是因为越小的元素会经由交换慢慢“浮”到数列的顶端。
 * 冒泡排序算法的运作如下:
 * 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
 * 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。
 * 针对所有的元素重复以上的步骤，除了最后一个。
 * 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
 * <p>
 * @author 刘新宇
 *
 * <p>
 * @date 2015年2月5日 下午9:56:54
 * <p>
 * @version 0.0.1
 */
public class BubbleSort {

	/**
	 * 时间复杂度是O（n²）
	 */
	private static void bubble(int array[]) {
		// 最多只做n-1次循环
		for (int i = 0; i < array.length - 1; i++) {
			// 范围逐步缩小，两两交换比较
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(array));
	}

	public static void main(String args[]) {
		int array[] = {49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};
		sort(array);
		
	}
	
	private static void sort(int array[]){
		long begin = System.currentTimeMillis();
		bubble(array);
		long end = System.currentTimeMillis();
		System.out.println(end-begin);
	}
}
