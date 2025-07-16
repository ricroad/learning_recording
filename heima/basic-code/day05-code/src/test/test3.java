package test;

import java.util.Random;
import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Random ra = new Random();
        //生成0——100的随机数字
        int randomNumber = ra.nextInt(100) + 1;

        //创建Scanner对象
        Scanner sc = new Scanner(System.in);


        //使用while循环，让用户可以多次猜测
        while (true) {
            System.out.println("请输入一个1-100的数字：");

            //录入键盘输入数字
            int guessNumber = sc.nextInt();

            //判断大小
            if (guessNumber > randomNumber) {
                System.out.println("大了");
            } else if (guessNumber < randomNumber) {
                System.out.println("小了");
            } else {
                System.out.println("恭喜你，答对了！");
                break;  //猜对了就退出循环
            }
        }

    }
}