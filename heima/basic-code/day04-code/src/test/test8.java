package test;

public class test8 {
    public static void main(String[] args) {
        int x = 1234;
        //定义临时变量来确保x的值不被覆盖
        int temp = x;
        //定义num来接收处理后的值
        int num = 0;
        //循环开始
        while (x > 0){
            int ge = x % 10;        // 取最后一位
            x = x / 10;             // 去掉最后一位
            num = num * 10 + ge;    // 构建反转数字
        }

        System.out.println(num);    // 会输出4321
        System.out.println(num == temp);
    }
}