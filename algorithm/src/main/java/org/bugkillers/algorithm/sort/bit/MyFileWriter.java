package org.bugkillers.algorithm.sort.bit;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MyFileWriter {
	public static void main(String[] args) throws Exception {
		FileWriter fw = new FileWriter(new File("E:/in.txt"));
		PrintWriter bf = new PrintWriter(fw);
		for(long i=100000;i>0;i--){
			bf.println(i+"");
		}
		bf.flush();
		fw.close();
		bf.close();
		
	}
}
