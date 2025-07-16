package test;

public class test5 {
    public static void main(String[] args) {
        //获取100个数
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            //筛选偶数并求和
            if (i % 2 ==0 ){
                sum = sum + i;
            }

            System.out.println(sum);
        //记住：想要什么样的结果，就在对应的位置打印。
            // 如果要最终结果，就在循环外打印；如果要过程，就在循环内打印。
            // 这就像你在购物时，是想知道最后花了多少钱，还是想知道每买一件商品时花了多少钱？
        }
    }
}
