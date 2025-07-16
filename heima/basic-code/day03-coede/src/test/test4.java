package test;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一只老虎的体重");
        int weight1 = sc.nextInt();

        System.out.println("请输入第二只老虎的体重");
        int weight2 = sc.nextInt();

        String situation = weight1 == weight2 ? "同" : "不同";


        System.out.println(situation);
    }
}



