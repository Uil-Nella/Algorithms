package org.bugkillers.algorithm.sort.bit;

import java.io.*;

public class BitSort {
	/**
	 * 位图排序算法
	 * 
	 * @param args
	 */

	private String fileIn;// 读入数据的文件
	private String fileOut;// 写入数据的文件

	public BitSort(String fileIn, String fileOut) {
		this.fileIn = fileIn;
		this.fileOut = fileOut;
	}

	/**
	 * 从fileIn中读取数据，排好序后，将排好序的数据写入fileOut中。
	 * 
	 * @throws IOException
	 */
	public void sort(Bit bit) throws IOException {
		FileReader fin = new FileReader(this.fileIn);// 建立文件字符输入流
		BufferedReader bin = new BufferedReader(fin);// 建立字符缓冲输入流

		FileWriter fout = new FileWriter(this.fileOut);
		BufferedWriter bout = new BufferedWriter(fout);

		String line = "";
		do {
			line = bin.readLine();
			if (line != null) {
				int pos = Integer.parseInt(line);
				bit.set1(pos);
			}
		} while (line != null);// 读取每一个数据，并且置相应的位为1，直到文件尾。

		for (int j = 0; j < bit.getSize(); j++)// 遍历位数组，输出相应的位
		{
			if (bit.get(j)) {
				line = String.valueOf(j);
				bout.write(line);
				bout.newLine();// 插入一个换行符
			}
		}

		bout.close();
		fout.close();
		bin.close();
		fin.close();
	}

	public static void main(String[] args) throws IOException {
		BitSort bitsort = new BitSort("E:/in.txt", "E:/out.txt");
		Bit bit = new Bit(10000000);
		bitsort.sort(bit);
	}
}
