package test;

import java.util.Random;

public class test11 {
    public static void main(String[] args) {

        //建一个数组表示奖池
        int [] arr = {2,588,888,1000,10000};

        //建一个新数组来存储抽奖的金额
        int [] newArr = new int[arr.length];

        //构建一个随机数方法来选择数
        Random rc = new Random();

        //抽奖过程
        int i = 0;
        while (i < arr.length) {  // 使用 while 循环替代 for 循环
            //抽取的随机索引
            int randomindex = rc.nextInt(arr.length);
            //获取奖项
            int prize = arr[randomindex];
            //判断当前奖项是否已经存在
            boolean flag = contains(newArr, prize);
            if (!flag) {
                newArr[i] = prize;
                i++;  // 只在成功添加新奖项时递增 i
            }
        }

        //4.遍历newArr
        for (int j = 0; j < arr.length; j++) {
            System.out.println(newArr[j]);
        }



    }

      //创建一个contains方法来判断其中的值是不是在其中
    public static  boolean contains (int[] arr,int prize){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == prize){
                return true;
            }
        }
        return false;
    }

}
