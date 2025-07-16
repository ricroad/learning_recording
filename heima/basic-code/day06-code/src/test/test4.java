package test;

public class test4 {
    public static void main(String[] args) {
        // 1. 定义一个整型数组
        int arr[] = {1,2,3,4,5,6,7,8};

        // 2. 调用 getmax 方法,将返回值赋给 out 变量
        int out = getmax(arr);

        // 3. 输出 out 的值
        System.out.println(out);
    }

    /**
     * 找出数组中的最大值
     * @param arr 要进行查找的数组
     * @return 数组中的最大值
     */
    public static int getmax(int arr[]) {
        // 1. 将数组的第一个元素赋给 max 变量,作为初始最大值
        int max = arr[0];

        // 2. 遍历数组,找出最大值
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                // 3. 如果当前元素大于 max,则更新 max 的值
                max = arr[i];
            }
        }

        // 4. 返回找到的最大值
        return max;
    }
}