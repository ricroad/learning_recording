package SwitchDemo;

import com.sun.org.apache.bcel.internal.generic.SWITCH;

public class switchdemo1 {
    public static void main(String[] args) {
        //1.定义变量显示我想吃的面
        String noddles = "兰州拉面";

        //2.Switch语句
        switch (noddles){
            case "兰州拉面":
                System.out.println("吃兰州拉面");
                break;
            case "热干面":
                System.out.println("吃热干面");
                break;
            case "陕西油泼面":
                System.out.println("吃陕西油泼面");
                break;
            case "重庆小面":
                System.out.println("吃重庆小面");
                break;
            default:
                System.out.println("没有");
        }

    }
    }

