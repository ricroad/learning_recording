package test;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        //1.键盘录入语句
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期数");
        int nummber = sc.nextInt();

        //2.对录入内容进行处理
    switch (nummber){
        case 1 :
        case 2 :
        case 3 :
        case 4 :
        case 5 :
            System.out.println("工作日");
            break;
        case 6 :
        case 7 :
            System.out.println("休息日");
            break;
        default:
            System.out.println("没有这个星期数");
    }


    }
}
