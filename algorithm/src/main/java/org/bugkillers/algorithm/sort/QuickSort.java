package org.bugkillers.algorithm.sort;

/**
 * �������� 
 * ����˼�룺ѡ��һ����׼Ԫ��,ͨ��ѡ���һ��Ԫ�ػ������һ��Ԫ��,ͨ��һ��ɨ�裬���������зֳ�������,һ���ֱȻ�׼Ԫ��С,һ���ִ��ڵ��ڻ�׼Ԫ��,
 * ��ʱ��׼Ԫ�������ź�������ȷλ��,Ȼ������ͬ���ķ����ݹ�����򻮷ֵ������֡�
 * <p/>
 * <p>
 * 
 * @author ������
 *
 *         <p>
 * @date 2015��2��6�� ����3:05:00
 *       <p>
 * @version 0.0.1
 */
public class QuickSort {

	public static int getMiddle(Integer[] array, int low, int high) {
		int tmp = array[low]; // ����ĵ�һ����Ϊ����
		while (low < high) {
			while (low < high && array[high] >= tmp) {
				high--;
			}
			array[low] = array[high]; // ������С�ļ�¼�Ƶ��Ͷ�
			while (low < high && array[low] <= tmp) {
				low++;
			}
			array[high] = array[low]; // �������ļ�¼�Ƶ��߶�
		}
		array[low] = tmp; // �����¼��β
		return low; // ���������λ��
	}

	public static void _quickSort(Integer[] array, int low, int high) {
		if (low < high) {
			int middle = getMiddle(array, low, high); // ��list�������һ��Ϊ��
			_quickSort(array, low, middle - 1); // �Ե��ֱ���еݹ�����
			_quickSort(array, middle + 1, high); // �Ը��ֱ���еݹ�����
		}
	}

	public static void quick(Integer[] array) {
		if (array.length > 0) { // �鿴�����Ƿ�Ϊ��
			_quickSort(array, 0, array.length - 1);
		}
	}

	public static void main(String[] args) {
		Integer array[] = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5,
				4, 62, 99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51 };
		long begin = System.currentTimeMillis();
		quick(array);
		long end = System.currentTimeMillis();
		System.out.println(end - begin);
	}
}
