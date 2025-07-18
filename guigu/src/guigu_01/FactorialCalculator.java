package guigu_01;/*
题目：计算阶乘 (Factorial) 并处理输入
编写一个 Java 程序，要求用户输入一个非负整数 n。
如果 n 是负数，程序应打印一条错误消息，例如“输入错误：请输入一个非负整数。”
如果 n 是 0，程序应打印“0的阶乘是 1。”
如果 n 是正整数，程序应计算并打印 n 的阶乘。
请使用 循环结构（for 循环或 while 循环皆可）来实现阶乘的计算。

示例输入与输出：
输入: -5
输出: 输入错误：请输入一个非负整数。

输入: 0
输出: 0的阶乘是 1。

输入: 5
输出: 5的阶乘是 120。

提示：
需要使用 java.util.Scanner 类来获取用户输入。
阶乘公式：n! = n * (n-1) * ... * 2 * 1，且 0! = 1。
 */
import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        //定义scanner方法来获取用户输入的值
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个非负整数:");

        //用户输入的值
        int n = sc.nextInt();

        //开始逻辑判断
        if(n < 0 ){
            System.out.println("输入错误：请输入一个非负整数。");
        } else if (n == 0) {
            System.out.println("0的阶乘是1");
        }else {
            long factorial = 1;
            for (int i = 1; i <=n; i++) {
                factorial *= i;
            }
            System.out.println(n +"的阶乘数是"+ factorial + "。");
        }
        sc.close();
    }
}