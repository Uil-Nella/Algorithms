package org.bugkillers.algorithm.audition;

public class Round {
	public static void main(String[] args) {
//		System.out.println(Math.round(123.623*100 +0.5)/100);
//		java.text.DecimalFormat   df   =new   java.text.DecimalFormat("#.00");
//		df.format("��Ҫ��ʽ��������");
		//.00 ��ʾ��λС�� #.0000��λС�� �Դ����ơ�
		System.out.println(new java.text.DecimalFormat("#.000").format(-3.1415926));;

	}
}
