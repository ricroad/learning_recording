package arraydemo2;

public class array4 {
    public static void main(String[] args) {
        //1.定义数组
        int arr1 [] ={1,2,3,4,5,6,7,8,10};

        //3.定义一个计数变量
        int count = 0;

        //2.循环获取符合要求需要的值
        for (int i = 0; i < arr1.length; i++) {

            if (arr1 [i] % 3 == 0){
                count ++;

            }
        }
        System.out.println("3倍数数的个数是" + count + "个");
    }
}
