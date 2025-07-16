package test;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        //需求：输入一个三位数，输出十位，个位，百位数
        //1.键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入整数");
        int number = sc.nextInt();

        //2.获取十位，个位百位
        //公式
        int ge = number % 10 ;
        int shi = number / 10 %10;
        int bai = number / 100 %10;
        System.out.println("geweishi"+ge);
        System.out.println("十位是"+shi);
        System.out.println("百位是"+bai);



    }
}
