package arraydemo2;

public class array7 {
    public static void main(String[] args) {
        //1.定义数组
        int arr[] = {32, 5, 42, 44, 55};

        //3.直接定义最大的值(取数组中的一个值为最大值）
        int max = arr[0];

        //2.开始循环获取对应的值
        for (int i = 0; i < arr.length; i++) {
            //循环比较
            if (max < arr[i]) {
                max = arr[i];
            }

        }

        System.out.println("最大武力值是" + max);
    }  // main方法的结束括号
}      // class的结束括号