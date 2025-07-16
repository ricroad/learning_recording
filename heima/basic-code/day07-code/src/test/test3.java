package test;

import java.util.Random;

public class test3 {
    public static void main(String[] arg20s) {

        //1.运用ASCII表来完成随机字母的生成
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            //ASCII表
            if (i <= 25){
                //添加小写字母
                chs[i] = (char)(97 + i);
            }else{
                //添加大写字母
                chs[i] = (char)(65 + i - 26);
            }
        }

        //定义一个字符串变量来记录最终的结果
        String result = "";

        //2.定义一个随机生成方法
        Random rsc = new Random();
        for (int i = 0; i < 4; i++) {
            int randomIndex = rsc.nextInt(chs.length);
            result = result + chs[randomIndex];
        }

        //3.生成随机的数字加到最后
        int random = rsc.nextInt(10);
        result = result + random;

        //打印最终结果
        System.out.println(result);

    }
}
