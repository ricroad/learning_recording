package test;

public class test10 {
    public static void main(String[] args) {
        //1.定义数组解密后的结果
        int [] arr = {1,9,8,3};

        //2.反转
        for (int i = 0,j = arr.length -1; i < j; i++,j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        //3.抵消加10取余操作(0-4之间+10，5-9数字不变）
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0 && arr[i] <= 4);
            arr[i] = arr[i] + 10;
        }

        //4.每一位减五
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] - 5;
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "");
        }

    }
}
