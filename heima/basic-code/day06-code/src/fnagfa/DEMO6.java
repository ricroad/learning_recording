package fnagfa;

public class DEMO6 {
    public static void main(String[] args) {
        double area1 = getarea(6.4,5.3);
        double area2 = getarea(4.4,2.1);
         if (area1>area2){
             System.out.println("第一个长方形的面积大");
         }else {
             System.out.println("第二个长方形的面积大");
         }

    }

    //创建方法时应该问自己创建的是不是可复用重复的方法，这样的方法才有定义的价值
    //而且有返回值的方法才用return，方法中定义的计算数据类型也应该和数据的类型一样
    public static double getarea(double width, double length) {
        double area = width * length;
        return area;

    }

}
