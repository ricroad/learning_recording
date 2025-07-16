package test;

public class test4 {
    public static void main(String[] args) {
        //sum这个变量应该定义在大括号外面
        int sum = 0;
        for (int i = 1; i <= 100; i++){
            //sum需要执行的操作
            sum = sum + i;
            System.out.println(sum);
        }
    }
}
