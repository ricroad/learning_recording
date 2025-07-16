package test;

public class test4 {
    public static void main(String[] args) {
        //需求：将老数组中的内容复制到新数组中
        //1.定义老数组，准备赋值
        int[] arr = {1, 2, 3, 4, 5};
        //2.定义一个长度和老数组一样的新数组，准备将老数组中的值导入新数组中
        int[] newarr = new int[arr.length];
        //3.遍历老数组，看老数组中有哪些元素,将老数组中的值传递给新数组
        for (int i = 0; i < arr.length; i++) {
            newarr[i] = arr[i];
        }

        for (int i = 0; i < newarr.length; i++) {
            System.out.println(newarr[i]);
        }

    }
}
