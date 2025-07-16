public class A04_InsertDemo {
    public static void main(String[] args) {
        int [] arr = {3,44,5,6,47,14,36,26,27,2,46,4,19,50,48};

        //1.找到无序排序是从哪个数开始的
        int startIndex = -1;
        for (int i = 0; i < arr.length - 1; i++) {//防止索引越界
            if (arr[i] > arr[i+1]){
                startIndex = i + 1;
                break;
            }
        }

        if (startIndex == -1) return; // 无需排序

        //2.从无序索引开始的位置遍历数插入到前面有序的数中
        for (int i = startIndex ; i < arr.length; i++) {

            //记录要插入数据的索引
            int j = i;

            while (j > 0 && arr[j] < arr[j -1]){
                //交换位置
                int temp = arr[j];
                arr[j] =arr[j - 1];
                arr[j - 1] = temp;
                j--;//与之前完成排序的有序排列进行比较

            }
        }


        //遍历数组查看结果
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}
