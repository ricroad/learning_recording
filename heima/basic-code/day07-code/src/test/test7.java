package test;

public class test7 {
    public static void main(String[] args) {
        // 需求：将整数的每一位数都添加到数组中
        // 1. 获取数字的长度
        int number = 12234;
        int count = 0;
        int temp = number; // 使用临时变量保存原始值
        while (temp != 0) { // 使用临时变量计算长度
            temp = temp / 10;
            count++;
        }

        // 2. 创建数组
        int[] arr = new int[count];

        // 3. 将数字的每一位放入数组（从数组末尾开始存储）
        temp = number; // 重新使用临时变量
        int index = count - 1; // 从数组末尾开始存储
        while (temp != 0) {
            int ge = temp % 10; // 获取个位数
            arr[index] = ge; // 将个位数存储到数组中
            temp = temp / 10; // 更新临时变量，去掉个位数
            index--; // 更新索引
        }

        // 4. 输出数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}