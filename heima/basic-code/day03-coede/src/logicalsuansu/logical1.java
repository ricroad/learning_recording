package logicalsuansu;

public class logical1 {
    public static void main(String[] args) {
        //&&短路与
        //两边都为真结果才是真
        System.out.println(true && false);
        System.out.println(true && true);
        System.out.println(false && false);
        System.out.println(true && false);

        //段落或||
        System.out.println(true || false);
        System.out.println(true || true);
        System.out.println(false || false);
        System.out.println(true || false);



    }
}
