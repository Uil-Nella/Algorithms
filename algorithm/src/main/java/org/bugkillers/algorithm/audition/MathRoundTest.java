package org.bugkillers.algorithm.audition;
public class MathRoundTest {  
    /** 
     * Math类中提供了三个与取整有关的方法：ceil,floor,round, 
     * 这些方法的作用于它们的英文名称的含义相对应，例如：ceil的英文意义是天花板，该方法就表示向上取整， 
     * Math.ceil（11.3）的结果为12，Math.ceil(-11.6)的结果为-11；floor的英文是地板， 
     * 该方法就表示向下取整，Math.floor(11.6)的结果是11，Math.floor(-11.4)的结果-12； 
     * 最难掌握的是round方法，他表示“四舍五入”，算法为Math.floor(x+0.5),即将原来的数字加上0.5后再向下取整， 
     * 所以，Math.round(11.5)的结果是12，Math.round(-11.5)的结果为-11.Math.round( )符合这样的规律： 
     * 小数点后大于5全部加，等于5正数加，小于5全不加。 
     */  
    public static void main(String[] args) {     
        System.out.println("小数点后第一位=5");     
        System.out.println("正数：Math.round(11.5)=" + Math.round(11.5));     
        System.out.println("负数：Math.round(-11.5)=" + Math.round(-11.5));     
        System.out.println();     
    
        System.out.println("小数点后第一位<5");     
        System.out.println("正数：Math.round(11.46)=" + Math.round(11.46));     
        System.out.println("负数：Math.round(-11.46)=" + Math.round(-11.46));     
        System.out.println();     
    
        System.out.println("小数点后第一位>5");     
        System.out.println("正数：Math.round(11.68)=" + Math.round(11.68));     
        System.out.println("负数：Math.round(-11.68)=" + Math.round(-11.68));  
        /** 
         * 运行结果： 
            1、小数点后第一位=5 
            2、正数：Math.round(11.5)=12 
            3、负数：Math.round(-11.5)=-11 
            4、 
            5、小数点后第一位<5 
            6、正数：Math.round(11.46)=11 
            7、负数：Math.round(-11.46)=-11 
            8、 
            9、小数点后第一位>5 
            10、正数：Math.round(11.68)=12 
            11、负数：Math.round(-11.68)=-12 
         */  
        /** 
         * 1、参数的小数点后第一位<5，运算结果为参数整数部分。 
           2、参数的小数点后第一位>5，运算结果为参数整数部分绝对值+1，符号（即正负）不变。 
           3、参数的小数点后第一位=5，正数运算结果为整数部分+1，负数运算结果为整数部分。 
         */  
    }     
  
}  
