package org.bugkillers.algorithm.sort;

import java.util.Arrays;

/**
 * ֱ�Ӳ������� ����˼�룺��Ҫ�����һ�����У�����ǰ��(n-1) [n>=2] �����Ѿ����� ��˳��ģ�����Ҫ�ѵ�n�����嵽ǰ����������У�ʹ����n����
 * Ҳ���ź�˳��ġ���˷���ѭ����ֱ��ȫ���ź�˳��
 * <p/>
 * <p>
 * @author ������
 *
 * <p>
 * @date 2015��2��6�� ����8:42:36
 * <p>
 * @version 0.0.1
 */
public class InsertSort {

	private static void insert(int array[]) {
		
		// �����һλ֮ǰ�Ѿ��ź���һ�δӵڶ�λ�����ж���
		for (int i = 1; i < array.length; i++) {
			int j = i - 1;
			// ����Ҫ���������������Ѱ�Һ��ʵ�λ��
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
