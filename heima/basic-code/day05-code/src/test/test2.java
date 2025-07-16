package test;

import java.util.Random;

public class test2 {
    public static void main(String[] args) {
        //秘诀
        //用来生成任意数到任意数之间的随机数 7 ~15
        //1.让这个范围头尾都减去一个值，让这个范围从0开始  -7  0~8
        //2.尾巴+1             8 + 1 = 9
        //3.最终的结果，再加上第一步减去的值。

        Random ra = new Random();
        int number = ra.nextInt(9)  + 7;

        System.out.println(number);
    }
}