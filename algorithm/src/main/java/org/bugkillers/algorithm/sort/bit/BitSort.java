package org.bugkillers.algorithm.sort.bit;

import java.io.*;

public class BitSort {
	/**
	 * λͼ�����㷨
	 * 
	 * @param args
	 */

	private String fileIn;// �������ݵ��ļ�
	private String fileOut;// д�����ݵ��ļ�

	public BitSort(String fileIn, String fileOut) {
		this.fileIn = fileIn;
		this.fileOut = fileOut;
	}

	/**
	 * ��fileIn�ж�ȡ���ݣ��ź���󣬽��ź��������д��fileOut�С�
	 * 
	 * @throws IOException
	 */
	public void sort(Bit bit) throws IOException {
		FileReader fin = new FileReader(this.fileIn);// �����ļ��ַ�������
		BufferedReader bin = new BufferedReader(fin);// �����ַ�����������

		FileWriter fout = new FileWriter(this.fileOut);
		BufferedWriter bout = new BufferedWriter(fout);

		String line = "";
		do {
			line = bin.readLine();
			if (line != null) {
				int pos = Integer.parseInt(line);
				bit.set1(pos);
			}
		} while (line != null);// ��ȡÿһ�����ݣ���������Ӧ��λΪ1��ֱ���ļ�β��

		for (int j = 0; j < bit.getSize(); j++)// ����λ���飬�����Ӧ��λ
		{
			if (bit.get(j)) {
				line = String.valueOf(j);
				bout.write(line);
				bout.newLine();// ����һ�����з�
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
