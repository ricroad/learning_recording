package arraydemo2;

public class array9 {
    public static void main(String[] args) {
        //1.定义数组
        int arr [] ={1,2,3,4,5};

        //开始循环
        for (int i = 0 ,j = arr.length - 1;i<j;i++,j-- ) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
