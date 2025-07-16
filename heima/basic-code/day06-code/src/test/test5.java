package test;

public class test5 {
    public static void main(String[] args) {
        //1.定义数组
        int arr [] ={1,22,34,3,4,45,45,312};

        boolean jiegup = panduan(arr,45);
        System.out.println(jiegup);
    }
       //2.定义方法完成查询操作
    public static boolean panduan (int arr[],int number){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==number){
                System.out.println("存在");
                return true;
            }
        }
        return false;

    }



}
