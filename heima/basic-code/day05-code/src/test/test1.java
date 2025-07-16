package test;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数");
        int number = sc.nextInt();

        //直接定义flag是质数
        boolean flag = true;

        //写一个循环从2开始判断直到number-1为止
        for (int i = 2; i <= number-1; i++) {
            if (number % i == 0){
                //上述的逻辑执行了就说明number可以被这个区间内除了1和自身外的其他数整除，不是质数
                //然后在循环内将false赋值给flag，循环结束
                flag = false;
                break;

            }

        }

        if (flag){
            System.out.println("这个数是质数");
        }else {
            System.out.println("这个数不是质数");
        }


    }

}
