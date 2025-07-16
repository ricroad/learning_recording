package test;

public class test1 {
    public static void main(String[] args) {
        //使用方法
        getlength(6.5,2.3);
    }

    //定义求周长方法
    public static void getlength(double width,double length){
      double result =  (width + length) * 2;
        System.out.println(result);
    }
}
