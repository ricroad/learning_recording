public class test2 {
    public static void main(String[] args) {
        // 测试不同数据类型的比较
        byte b1 = 10, b2 = 20;
        short s1 = 100, s2 = 200;
        int i1 = 1000, i2 = 2000;
        long l1 = 10000L, l2 = 20000L;

        compare(b1, b2);    // byte类型比较
        compare(s1, s2);    // short类型比较
        compare(i1, i2);    // int类型比较
        compare(l1, l2);    // long类型比较
    }

    // byte类型比较
    public static void compare(byte a, byte b) {
        if (a > b) {
            System.out.println("byte比较：" + a + "大于" + b);
        } else if (a < b) {
            System.out.println("byte比较：" + a + "小于" + b);
        } else {
            System.out.println("byte比较：" + a + "等于" + b);
        }
    }

    // short类型比较
    public static void compare(short a, short b) {
        if (a > b) {
            System.out.println("short比较：" + a + "大于" + b);
        } else if (a < b) {
            System.out.println("short比较：" + a + "小于" + b);
        } else {
            System.out.println("short比较：" + a + "等于" + b);
        }
    }

    // int类型比较
    public static void compare(int a, int b) {
        if (a > b) {
            System.out.println("int比较：" + a + "大于" + b);
        } else if (a < b) {
            System.out.println("int比较：" + a + "小于" + b);
        } else {
            System.out.println("int比较：" + a + "等于" + b);
        }
    }

    // long类型比较
    public static void compare(long a, long b) {
        if (a > b) {
            System.out.println("long比较：" + a + "大于" + b);
        } else if (a < b) {
            System.out.println("long比较：" + a + "小于" + b);
        } else {
            System.out.println("long比较：" + a + "等于" + b);
        }
    }
}