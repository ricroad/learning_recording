package test;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入携带金额");
        int money = sc.nextInt();

        if (money>600){
            System.out.println("支付成功");
        }else {
            System.out.println("支付失败");
        }

    }
}
