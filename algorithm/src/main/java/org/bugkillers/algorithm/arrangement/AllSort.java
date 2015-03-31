package org.bugkillers.algorithm.arrangement;

/**
 * 全排列--Java实现
 * <p/>
 * <p> @author 刘新宇
 *
 * <p> @date 2015年2月9日 下午7:15:51
 * <p> @version 0.0.1
 */
public class AllSort{
    public static void main(String[] args) {
        char buf[]={'a','b','c','d','e'};

        perm(buf,0,buf.length-1);
    }
    public static void perm(char[] buf,int start,int end){
        if(start==end){//当只要求对数组中一个字母进行全排列时，只要就按该数组输出即可（特殊情况）  
            for(int i=0;i<=end;i++){
                System.out.print(buf[i]);
            }
            System.out.println();
        }
        else{//多个字母全排列（普遍情况） 
            for(int i=start;i<=end;i++){//（让指针start分别指向每一个数） 
                char temp=buf[start];//交换数组第一个元素与后续的元素  
                buf[start]=buf[i];
                buf[i]=temp;

                perm(buf,start+1,end);//后续元素递归全排列  

                temp=buf[start];//将交换后的数组还原  
                buf[start]=buf[i];
                buf[i]=temp;
            }
        }
    }
}