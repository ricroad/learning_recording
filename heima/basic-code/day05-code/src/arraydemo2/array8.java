package arraydemo2;

import java.util.Random;

public class array8 {
    public static void main(String[] args) {
        //1.定义一个随机数的生成函数
        Random r = new Random();

        //定义数组
        int arr [] = new int[10];

        //需求1.将随机数放入定义的数组中
        for (int i = 0; i < arr.length; i++) {
            int num = r.nextInt(100) + 1;
            arr[i] = num;
        }

        //需求2.求出所有数据的和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("所有数据的和是：" + sum);

        //需求3.求所有数的平均数
        int avg = 0;
        avg = sum / arr.length;
        System.out.println("所有数的平均值是：" + avg);

        //需求4，统计有多少个数比平均数小
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < avg){
                count++;
            }
        }
        System.out.println("有" + count + "个数比平均数小");




    }
}
