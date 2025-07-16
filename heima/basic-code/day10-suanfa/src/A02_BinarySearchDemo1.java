import java.util.Scanner;

public class A02_BinarySearchDemo1 {
    public static void main(String[] args) {
        //二分算法/折办查找
        //核心：
        //每次查找都排除一半的范围

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你选择的number值吧；");
        int number = sc.nextInt();

        int [] arr ={7,23,79,81,103,127,131,147};
        //需求：定义一个方法利用二分查找，查询某个元素在数组中的索引
        //数据：{7，23，79，81，103，127，131，147}
        int index = binarySearch(arr,number);

        if (index != -1){
            System.out.println("找到" + number + "数值" + "索引为" + index);
        }else {
            System.out.println("没有找到数值" + number + "的索引");
        }


    }

    public static int binarySearch(int [] arr,int number){
        //定义两个变量来确定查找的范围
        int min = 0;
        int max = arr.length-1;

        //2.利用循环不断的找需要查找的数据
        while (min <= max){
            //如果没有需要引入mid变量来继续操作
            int mid = (max + min)/2;

            //拿着mid指向的元素跟要查找的元素进行比较
            //number在mid的左边
            //numbe在mid的右边
            //number跟mid指向的元素一样
            if (arr[mid] < number){
                min = mid + 1;
            } else if (arr[mid] > number) {
                max = mid - 1;
            }else {
                //刚好一样
                return mid;
            }
        }
     return -1;
    }


}
