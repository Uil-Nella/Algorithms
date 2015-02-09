package org.bugkillers.algorithm.audition;

public class Round {
	public static void main(String[] args) {
//		System.out.println(Math.round(123.623*100 +0.5)/100);
//		java.text.DecimalFormat   df   =new   java.text.DecimalFormat("#.00");
//		df.format("你要格式化的数字");
		//.00 表示两位小数 #.0000四位小数 以此类推…
		System.out.println(new java.text.DecimalFormat("#.000").format(-3.1415926));;

	}
}
