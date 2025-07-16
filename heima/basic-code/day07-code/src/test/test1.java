package test;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        /* 机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。
           按照如下规则计算机票价格：旺季（5-10月）头等舱9折，经济舱8.5折；淡季（11月到来年4月）头等舱7折，经济舱6.5折。*/
        //核心就是if嵌套，熟悉if，else if，if else嵌套

        //1.录入机票的各种信息，机票原价，淡旺季，

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票的原价");
        int ticket = sc.nextInt();
        System.out.println("请输入购买机票的月份");
        int month = sc.nextInt();
        System.out.println("请输入您购买机票的种类 0 头等舱 1 公务舱");
        int seat = sc.nextInt();

        //2.根据淡旺季来对票价进行折扣处理
        //2.1先分淡旺季再来处理票价
        //旺季
        if (month >= 5 && month <= 10 ){
            ticket = getprice(ticket,seat,0.9,0.85);
        } else if ((month >= 1 && month <= 4) || (month >= 11 && month <=12)){
            ticket = getprice(ticket,seat,0.7,0.65);
        }

        System.out.println("机票的最终价格为" + ticket);


    }

    public static int getprice(int ticket ,int seat,double v1,double v2){
        if (seat == 0){
            ticket = (int)(ticket * v1);
        } else if (seat == 1) {
            ticket = (int)(ticket * v2);
        }else{
            System.out.println("没有这个舱位哦");
        }
        return ticket;

    }

    }