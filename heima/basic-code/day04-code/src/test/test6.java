package test;

import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        //键盘录入数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入范围开始值");
        int start = sc.nextInt();
        System.out.println("请输入范围结束值");
        int end = sc.nextInt();

        //定义一个计数变量
        //统计方法
        int count = 0;

        //获取符合要求的数字
        for (int i = start; i <= end; i++) {
            //对数字进行判断，看符合条件的有哪些
            if (i % 3 == 0  && i % 5 == 0){
               count++;

            }

        }
        System.out.println(count);

    }
}
