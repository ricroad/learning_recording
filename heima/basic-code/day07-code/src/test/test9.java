package test;

public class test9 {
    public static void main(String[] args) {
        int number = 12345;

        // 1.先计算位数
        int temp = number;
        int count = 0;
        while (temp != 0){
            temp = temp / 10;  // 这里仍然用/10来计算位数
            count++;
        }

        // 2.创建数组
        int[] arr = new int[count];

        // 3.获取每一位数字并存入数组
        temp = number;
        int index = count - 1;
        while (temp != 0){
            int digit = temp % 10;  // 使用%10获取最后一位数字
            arr[index] = digit;
            temp = temp / 10;  // 去掉已经处理过的最后一位
            index--;
        }

        // 4.打印结果
        for (int i = 0; i < arr.length; i++) {
            System.out.print("数组中的值是" + arr[i] + " ");
        }
    }
}