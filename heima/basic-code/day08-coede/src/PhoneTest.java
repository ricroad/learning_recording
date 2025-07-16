public class PhoneTest {
    public static void main(String[] args) {
        //给手机创建对象
        phone p = new phone();

        //给手机赋值
        p.brand = "华为（apple）";
        p.price = 9.99;

        //获取手机对象中的值
        System.out.println("p.price");
        System.out.println("p.brand");

        //调用方法即可
        p.call();
        p.playgame();

    }
}
