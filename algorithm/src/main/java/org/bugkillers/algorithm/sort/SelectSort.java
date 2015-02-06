package org.bugkillers.algorithm.sort;

import java.util.Arrays;


/**
 * ѡ������ ����˼�룺��Ҫ�����һ�����У�ѡ����С��һ�������һ��λ�õ���������
 * Ȼ����ʣ�µ�������������С����ڶ���λ�õ������������ѭ���������ڶ����������һ�����Ƚ�Ϊֹ��
 * <p/>
 * <p>
 * @author ������
 *
 * <p>
 * @date 2015��2��6�� ����2:45:30
 * <p>
 * @version 0.0.1
 */
public class SelectSort {
	private static void select(int array[]) {
		
		// Ĭ��Ѱ����Сֵ��λ��
		int position = 0;
		for (int i = 0; i < array.length; i++) {
			int j = i + 1;
			position = i;
			// ��Ѱ���滻Ŀ��洢
			int temp = array[i];
			for (; j < array.length; j++) {
				// Ѱ����С��Ԫ���滻λ��
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
