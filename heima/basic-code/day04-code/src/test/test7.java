package test;

public class test7 {
    public static void main(String[] args) {
        //1.纸张初始厚度定义,山峰高度定义
        double num = 0.1;        //纸张初始厚度0.1毫米
        double height = 8844430; //珠穆朗玛峰高度8844.43米
        int count = 0;          //折叠次数计数器

        //2.判断条件和循环语句
        while (num < height) {
            num = num * 2;  // 每折叠一次，厚度翻倍
            count++;        // 折叠次数加1
        }

        System.out.println(count);
    }
}