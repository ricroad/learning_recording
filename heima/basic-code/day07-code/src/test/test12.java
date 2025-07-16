package test;

import java.util.Random;

public class test12 {
    public static void main(String[] args) {
        //初始数值
        int[] arr = {1000, 10000, 2, 588, 888};

        //定义新数组来接收抽到的数据
        int[] newarr = new int[arr.length];

        //添加一个随机数方法
        Random r = new Random();

        //通过while循环来抽奖
        int i = 0;
        while (i < arr.length) {
            //抽取随机索引
            int randomindex = r.nextInt(arr.length);
            //获取对应的奖项值
            int price = arr[randomindex];
            //检查是否已经被抽取过
            if (!contains(newarr, price)) {
                newarr[i] = price;
                i++;
            }
        }

        // 输出抽奖结果
        System.out.println("抽奖结果：");
        for (int j = 0; j < newarr.length; j++) {
            System.out.println("第" + (j + 1) + "个奖项：" + newarr[j]);
        }
    }

    public static boolean contains(int[] arr, int price) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == price) {
                return true;
            }
        }
        return false;
    }
}