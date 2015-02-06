package org.bugkillers.algorithm.sort;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class NodeTest {
	List<Class> classes = new ArrayList<Class>();

	public NodeTest node(Class clazz) {
		classes.add(clazz);
		return this;
	}

	public NodeTest excute() {
		try {
			for (Class clazz : classes) {
				// 访问私有方法
				Method m = clazz.getDeclaredMethod("sort", int[].class);
				m.setAccessible(true);
				m.invoke(clazz.newInstance(), new int[] { 49, 38, 65, 97, 76,
						13, 27, 49, 78, 34, 12, 64, 5, 4, 62, 99, 98, 54, 56,
						17, 18, 23, 34, 15, 35, 25, 53, 51 });

			}
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		return this;
	}

	public static void main(String[] args) {
		new NodeTest().node(BubbleSort.class).node(ShellSort.class)
				.node(HeapSort.class).node(InsertSort.class)
				.node(MergeSort.class).node(QuickSort.class)
				.node(RadixSort.class).node(SelectSort.class)
				.excute();
	}
}
