package org.bugkillers.algorithm.sort;

import java.util.Arrays;

/**
 * ð������
 * <p/>
 * <p>
 * @author ������
 *
 * <p>
 * @date 2015��2��5�� ����9:56:54
 * <p>
 * @version 0.0.1
 */
public class BubbleSort {

	private static void bubble() {
		Integer array[] = { 97, 9, 15, 87, 109, 90, 99, 100 };
		// ���ֻ��n-1��ѭ��
		for (int i = 0; i < array.length - 1; i++) {
			// ��Χ����С��ǰ������Ѿ���С�ˣ�����Ҫ�ٴ�ð��
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
