package org.bugkillers.algorithm.audition;
public class MathRoundTest {  
    /** 
     * Math�����ṩ��������ȡ���йصķ�����ceil,floor,round, 
     * ��Щ���������������ǵ�Ӣ�����Ƶĺ������Ӧ�����磺ceil��Ӣ���������컨�壬�÷����ͱ�ʾ����ȡ���� 
     * Math.ceil��11.3���Ľ��Ϊ12��Math.ceil(-11.6)�Ľ��Ϊ-11��floor��Ӣ���ǵذ壬 
     * �÷����ͱ�ʾ����ȡ����Math.floor(11.6)�Ľ����11��Math.floor(-11.4)�Ľ��-12�� 
     * �������յ���round����������ʾ���������롱���㷨ΪMath.floor(x+0.5),����ԭ�������ּ���0.5��������ȡ���� 
     * ���ԣ�Math.round(11.5)�Ľ����12��Math.round(-11.5)�Ľ��Ϊ-11.Math.round( )���������Ĺ��ɣ� 
     * С��������5ȫ���ӣ�����5�����ӣ�С��5ȫ���ӡ� 
     */  
    public static void main(String[] args) {     
        System.out.println("С������һλ=5");     
        System.out.println("������Math.round(11.5)=" + Math.round(11.5));     
        System.out.println("������Math.round(-11.5)=" + Math.round(-11.5));     
        System.out.println();     
    
        System.out.println("С������һλ<5");     
        System.out.println("������Math.round(11.46)=" + Math.round(11.46));     
        System.out.println("������Math.round(-11.46)=" + Math.round(-11.46));     
        System.out.println();     
    
        System.out.println("С������һλ>5");     
        System.out.println("������Math.round(11.68)=" + Math.round(11.68));     
        System.out.println("������Math.round(-11.68)=" + Math.round(-11.68));  
        /** 
         * ���н���� 
            1��С������һλ=5 
            2��������Math.round(11.5)=12 
            3��������Math.round(-11.5)=-11 
            4�� 
            5��С������һλ<5 
            6��������Math.round(11.46)=11 
            7��������Math.round(-11.46)=-11 
            8�� 
            9��С������һλ>5 
            10��������Math.round(11.68)=12 
            11��������Math.round(-11.68)=-12 
         */  
        /** 
         * 1��������С������һλ<5��������Ϊ�����������֡� 
           2��������С������һλ>5��������Ϊ�����������־���ֵ+1�����ţ������������䡣 
           3��������С������һλ=5������������Ϊ��������+1������������Ϊ�������֡� 
         */  
    }     
  
}  
