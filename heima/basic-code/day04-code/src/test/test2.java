package test;

import java.util.Scanner;

//if的嵌套
public class test2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入票号");
        int piaohao = sc.nextInt();

        if (piaohao >=0 && piaohao <=100){
            if (piaohao % 2 == 1){
                System.out.println("坐左边");
            }else {
                System.out.println("坐右边");
            }
        }
    }
}
