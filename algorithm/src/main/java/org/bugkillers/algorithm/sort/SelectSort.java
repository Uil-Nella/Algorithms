package org.bugkillers.algorithm.sort;

import java.util.Arrays;


/**
 * 选择排序 基本思想：在要排序的一组数中，选出最小的一个数与第一个位置的数交换；
 * 然后在剩下的数当中再找最小的与第二个位置的数交换，如此循环到倒数第二个数和最后一个数比较为止。
 * <p/>
 * <p>
 * @author 刘新宇
 *
 * <p>
 * @date 2015年2月6日 下午2:45:30
 * <p>
 * @version 0.0.1
 */
public class SelectSort {
	private static void select(int array[]) {
		
		// 默认寻找最小值的位置
		int position = 0;
		for (int i = 0; i < array.length; i++) {
			int j = i + 1;
			position = i;
			// 将寻找替换目标存储
			int temp = array[i];
			for (; j < array.length; j++) {
				// 寻找最小的元素替换位置
				if (array[j] < temp) {
					temp = array[j];
					position = j;
				}
			}	
			array[position] = array[i];
			array[i] = temp;
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
		select(array);
		long end = System.currentTimeMillis();
		System.out.println(end - begin);
	}
	
}
