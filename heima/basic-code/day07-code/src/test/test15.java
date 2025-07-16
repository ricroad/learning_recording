package test;

public class test15 {
    public static void main(String[] args) {
        //1.二维数组的静态初始化
        int arr [][] = {
                {1,2,3},{4,5,6,7}
        };



        //2.二维数组的遍历
        for (int i = 0; i < arr.length; i++) {
            //i表示二维数组中的每一个索引
            //arr[i]输出二维数组中每个索引代表的值（一维数组）
            for (int i1 = 0; i1 < arr[i].length; i1++) {
                System.out.println(arr[i][i1]);
            }
            System.out.println();
        }
    }
}
