public class A03_BubbkleDemo {
    public static void main(String[] args) {
        //冒泡排序
        //核心思想

        //定义数组
        int [] arr = {1,5,4,2,3};

        //2.利用冒泡排序
        for (int i = 0; i < arr.length - 1; i++) {
            for (int i1 = 0; i1 < arr.length - 1 -i; i1++) {
                if (arr[i1] >arr[i1 + 1]){
                    int temp = arr[i1];
                    arr[i1] = arr[i1 + 1];
                    arr[i1 + 1] = temp;
                }
            }

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }

    }
}
