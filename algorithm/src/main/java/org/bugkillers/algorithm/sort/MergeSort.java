package org.bugkillers.algorithm.sort;

import java.util.Arrays;

/**
 * �鲢���� �������򣺹鲢��Merge�������ǽ����������������ϣ������ϲ���һ���µ���������Ѵ��������з�Ϊ���ɸ������У�ÿ��������������ġ�
 * Ȼ���ٰ����������кϲ�Ϊ�����������С�
 * <p/>
 * <p>
 * @author ������
 *
 * <p>
 * @date 2015��2��6�� ����3:16:04
 * <p>
 * @version 0.0.1
 */
public class MergeSort {

	public static void sort0(int[] data, int left, int right) {
		// TODO Auto-generated method stub
		if (left < right) {
			// �ҳ��м�����
			int center = (left + right) / 2;
			// �����������еݹ�
			sort0(data, left, center);
			// ���ұ�������еݹ�
			sort0(data, center + 1, right);
			// �ϲ�
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
		// third��¼�м����������
		int third = left;
		int tmp = left;
		while (left <= center && mid <= right) {
			// ������������ȡ����С�ķ����м�����
			if (data[left] <= data[mid]) {
				tmpArr[third++] = data[left++];
			} else {
				tmpArr[third++] = data[mid++];
			}
		}
		// ʣ�ಿ�����η����м�����
		while (mid <= right) {
			tmpArr[third++] = data[mid++];
		}
		while (left <= center) {
			tmpArr[third++] = data[left++];
		}
		// ���м������е����ݸ��ƻ�ԭ����
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
