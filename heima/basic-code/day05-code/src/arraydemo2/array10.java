package arraydemo2;

import java.util.Random;
public class array10 {
    public static void main(String[] args) {
        // 1. 定义原始数组
        int arr[] = {1,2,3,4,5};

        // 2. 创建Random对象用于生成随机数
        Random ra = new Random();

        // 3. 遍历数组实现洗牌算法(Fisher-Yates shuffle)
        for (int i = 0; i < arr.length; i++) {
            // 3.1 生成随机索引(范围从i到数组末尾)
            int randomIndex = ra.nextInt(arr.length - i) + i;

            // 3.2 交换当前位置(i)和随机位置(randomIndex)的元素
            int temp = arr[i];           // 临时存储当前位置的值
            arr[i] = arr[randomIndex];   // 将随机位置的值放到当前位置
            arr[randomIndex] = temp;     // 将临时存储的值放到随机位置
        }

        // 4. 打印打乱后的数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // 每个数字后面加空格，提高可读性
        }
    }
}