package test;

public class test3 {
    public static void main(String[] args) {
        //1,定义数组
        int arr [] = {11,22,33,44,55};
        getterarr(arr);

    }
    //2，创建方法遍历打印数据
    public static void getterarr (int arr []){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        
    }


}
