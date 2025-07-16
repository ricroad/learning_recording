package fnagfa;

public class demo5 {
    public static void main(String[] args) {
//        //1.调用方法1直接调用
//        sum(20,30,40);
//
//        //2。调用方法2赋值调用
//        int getsum = sum(30,40,50);
//        System.out.println(getsum);
//
//        //3.输出调用
//        System.out.println(sum(12,32,42));
        int jidu1 = sum(20,30,40);

        int jidu2 = sum(30,40,50);

        int jidu3 = sum(40,50,60);

        int jisuan = jidu1 + jidu2 + jidu3;
        System.out.println(jisuan);

    }

    public static int sum(int num1,int num2,int num3){
        int result = num1 + num2 + num3;
        return result;
    }

}
