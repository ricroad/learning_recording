package test;

import java.util.Scanner;

public class suansulianxi {
    public static void main(String[] args) {

        //键盘录入两个整数
        //条件判断，和为六的倍数，有六，其他都为false

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int number = sc.nextInt();
        Scanner uc =new Scanner(System.in);
        System.out.println("请再输入一个整数");
        int num = uc.nextInt();

        boolean result = number == 6 || num == 6 || (num + number) % 6 == 0;



        System.out.println(result);
    }
}
