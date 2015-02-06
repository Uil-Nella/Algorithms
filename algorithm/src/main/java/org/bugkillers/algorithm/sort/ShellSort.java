package org.bugkillers.algorithm.sort;

import java.util.Arrays;

/**
 * ϣ������ ����˼�룺�㷨�Ƚ�Ҫ�����һ������ĳ������d��n/2,nΪҪ�������ĸ������ֳ������飬ÿ���м�¼���±����d.��ÿ����ȫ��Ԫ�ؽ���ֱ�Ӳ�������
 * Ȼ������һ����С��������d/2���������з��飬��ÿ�����ٽ���ֱ�Ӳ������򡣵���������1ʱ������ֱ�Ӳ��������������ɡ�
 * <p/>
 * <p>
 * @author ������
 *
 * <p>
 * @date 2015��2��6�� ����12:00:51
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
