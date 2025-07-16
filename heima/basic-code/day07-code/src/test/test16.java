package test;
//定义数据结构
//定义总营业额变量=0
//遍历每个季度：
//    计算当前季度营业额
//    输出当前季度营业额
//    累加到总营业额
//输出总营业额


public class test16 {
    public static void main(String[] args) {
        //一共有四个季度
        //目标，获取每个季度的营业额值还有总营业额

        //1.首先定义二维数组
        int [][] arr ={
                {16,23,34,23},
                {23,23,34,45},
                {3,56,8,6},
                {1,3,4,5}
        };

        //首先定义总营业额
        int zongYingye = 0;
        //2.遍历二维数组，得到一维数组
        for (int i = 0; i < arr.length; i++) {
            //季度营业额
            int jidu [] = arr[i];
            int sum = getsunm(jidu);
            System.out.println("第"+(i)+"季度的总营业额为" + sum);

            //累加到总营业额上
            zongYingye += sum;
        }

        //3.获取全年总营业额
        System.out.println("总营业额为：" + zongYingye);

    }

    public static int getsunm(int [] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;

    }




}
