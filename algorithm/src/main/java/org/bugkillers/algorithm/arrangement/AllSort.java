package org.bugkillers.algorithm.arrangement;

/**
 * ȫ����--Javaʵ��
 * <p/>
 * <p> @author ������
 *
 * <p> @date 2015��2��9�� ����7:15:51
 * <p> @version 0.0.1
 */
public class AllSort{  
    public static void main(String[] args) {  
        char buf[]={'a','b','c','d','e'}; 

        perm(buf,0,buf.length-1);  
    }  
    public static void perm(char[] buf,int start,int end){  
        if(start==end){//��ֻҪ���������һ����ĸ����ȫ����ʱ��ֻҪ�Ͱ�������������ɣ����������  
            for(int i=0;i<=end;i++){  
                System.out.print(buf[i]);  
            }  
            System.out.println();     
        }  
        else{//�����ĸȫ���У��ձ������ 
            for(int i=start;i<=end;i++){//����ָ��start�ֱ�ָ��ÿһ������ 
                char temp=buf[start];//���������һ��Ԫ���������Ԫ��  
                buf[start]=buf[i];  
                buf[i]=temp;  
                  
                perm(buf,start+1,end);//����Ԫ�صݹ�ȫ����  
                  
                temp=buf[start];//������������黹ԭ  
                buf[start]=buf[i];  
                buf[i]=temp;  
            }  
        }  
    }  
}