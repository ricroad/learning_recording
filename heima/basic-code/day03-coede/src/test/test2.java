package test;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        //需求：键盘录入两个整数来进行后续判断，>=时就成功
        //键入时髦分数
        Scanner sc =new Scanner(System.in);
        System.out.println("输入你的时髦度");
        int mine = sc.nextInt();

        Scanner sa = new Scanner(System.in);
        System.out.println("输入对象时髦度");
        int girl = sa.nextInt();

        //判断双方分数结果
        boolean result = mine > girl;

        //打印结果
        System.out.println(result);
    }
}
