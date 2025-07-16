package arraydemo2;

public class arry3 {
    public static void main(String[] args) {

        //1.定义数组加入变量
        int arr2 [] = {1,2,3,4,5};

        //3.定义变量完成累加操作
        int sum = 0;


        //2.使用循环获取每个数组索引对应的值
        for (int i = 0; i < arr2.length; i++) {
            sum = sum + arr2[i];
        }

        //
        System.out.println(sum);
    }
}
