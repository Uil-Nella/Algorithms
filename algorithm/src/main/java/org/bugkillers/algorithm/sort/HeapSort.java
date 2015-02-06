package org.bugkillers.algorithm.sort;

import java.util.Arrays;

/**
 * ������ 
 * ����˼�룺��������һ������ѡ�������Ƕ�ֱ��ѡ���������Ч�Ľ���
 * �ѵĶ������£�����n��Ԫ�ص����У�h1,h2,...,hn),���ҽ������㣨hi>=
 * h2i,hi>=2i+1����hi<=h2i,hi<=2i+1��(i=1
 * ,2,...,n/2)ʱ��֮Ϊ�ѡ�������ֻ��������ǰ�������Ķѡ��ɶѵĶ�����Կ�����
 * �Ѷ�Ԫ�أ�����һ��Ԫ�أ���Ϊ�����󶥶ѣ�����ȫ���������Ժ�ֱ�۵ر�ʾ�ѵĽṹ
 * ���Ѷ�Ϊ��������Ϊ������������������ʼʱ��Ҫ������������п�����һ��˳��洢�Ķ�����
 * ���������ǵĴ洢��ʹ֮��Ϊһ���ѣ���ʱ�ѵĸ��ڵ�������Ȼ�󽫸��ڵ���ѵ����һ���ڵ㽻��
 * ��Ȼ���ǰ��(n-1)�������µ���ʹ֮��Ϊ�ѡ��������ƣ�ֱ��ֻ�������ڵ�Ķ�
 * ���������������������õ���n���ڵ���������С����㷨������������������Ҫ��������
 * ��һ�ǽ����ѣ����ǶѶ���ѵ����һ��Ԫ�ؽ���λ�á����Զ�����������������ɡ�һ�ǽ��ѵ���͸���������Ƿ���������͸����ʵ������ĺ�����
 * <p/>
 * <p>
 * @author ������
 *
 * <p>
 * @date 2015��2��6�� ����2:55:24
 * <p>
 * @version 0.0.1
 */
public class HeapSort {

	public static void heap(int[] array) {
		int arrayLength = array.length;
		// ѭ������
		for (int i = 0; i < arrayLength - 1; i++) {
			// ����
			buildMaxHeap(array, arrayLength - 1 - i);
			// �����Ѷ������һ��Ԫ��
			swap(array, 0, arrayLength - 1 - i);
			System.out.println(Arrays.toString(array));
		}
	}

	private static void swap(int[] data, int i, int j) {
		int tmp = data[i];
		data[i] = data[j];
		data[j] = tmp;
	}

	// ��data�����0��lastIndex���󶥶�
	private static void buildMaxHeap(int[] data, int lastIndex) {
		// TODO Auto-generated method stub
		// ��lastIndex���ڵ㣨���һ���ڵ㣩�ĸ��ڵ㿪ʼ
		for (int i = (lastIndex - 1) / 2; i >= 0; i--) {
			// k���������жϵĽڵ�
			int k = i;
			// �����ǰk�ڵ���ӽڵ����
			while (k * 2 + 1 <= lastIndex) {
				// k�ڵ�����ӽڵ������
				int biggerIndex = 2 * k + 1;
				// ���biggerIndexС��lastIndex����biggerIndex+1�����k�ڵ�����ӽڵ����
				if (biggerIndex < lastIndex) {
					// �������ӽڵ��ֵ�ϴ�
					if (data[biggerIndex] < data[biggerIndex + 1]) {
						// biggerIndex���Ǽ�¼�ϴ��ӽڵ������
						biggerIndex++;
					}
				}
				// ���k�ڵ��ֵС����ϴ���ӽڵ��ֵ
				if (data[k] < data[biggerIndex]) {
					// ��������
					swap(data, k, biggerIndex);
					// ��biggerIndex����k����ʼwhileѭ������һ��ѭ�������±�֤k�ڵ��ֵ�����������ӽڵ��ֵ
					k = biggerIndex;
				} else {
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		int array[] = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4,
				62, 99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51 };
		long begin = System.currentTimeMillis();
		heap(array);
		long end = System.currentTimeMillis();
		System.out.println(end - begin);
	}
}
