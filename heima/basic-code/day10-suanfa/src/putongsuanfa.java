import java.util.ArrayList;

public class putongsuanfa {
    public static void main(String[] args) {
        //作业1
        //需求：定义一个方法利用基本查找，查询某个元素在数组中的索引
        //要求：不需要考虑数组中的元素是否重复
        int[] arr = {131, 127, 147, 123, 234, 3443};
        ArrayList<Integer> indexes = basicSearch(arr, 123);
        System.out.println("元素123的索引位置是：" + indexes);

        //练习2
        //需求：定义一个方法利用基本查找，查询某个元素在数组中的索引
        //要求：不需要考虑数组中的元素是否有重复的可能性
        //{131，127，147，123，23，43，443}




    }
    public static ArrayList<Integer> basicSearch(int[] arr, int number) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                list.add(i);
            }
        }
        return list;

    }






}
