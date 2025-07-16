package jum;

import java.util.Scanner;

public class pinfanggen {
    public static void main(String[] args) {
        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int number = sc.nextInt();

        //循环获取
        for (int i = 1; i <= number; i++) {
            if (i * i == number){
                System.out.println( i + "就是这个数的平方跟");
                break;
            } else if (i * i > number) {
                System.out.println((i-1) + "是这个数平凡跟的整数部分");
                break;
            }

        }
    }
}
