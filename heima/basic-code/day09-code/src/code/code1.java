package code;

import java.util.ArrayList;

public class code1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        //1.增
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");


        //2.删
        Boolean resu1 = list.remove("aaa");
        System.out.println(resu1);



        //3.改
        list.set(1,"vvv");


        //4.查
        String s = list.get(0);

    }



}
