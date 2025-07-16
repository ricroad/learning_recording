package arraydemo2;

public class array5 {
    public static void main(String[] args) {

        //1.定义数组存储数据
        int arr [] = {1,2,3,4,5,6,7,8,9,10};


        //2.设置循环获取数
        for (int i = 0; i < arr.length; i++) {
            //根据要求对其进行处理
            if (arr [i] % 2 == 0){
              arr [i] = arr [i] / 2;
            }else {
                arr [i] = arr [i] * 2;

            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
