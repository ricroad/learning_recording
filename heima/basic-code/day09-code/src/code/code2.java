package code;

import java.util.ArrayList;

public class code2 {
    public static void main(String[] args) {
        //1.创建集合
        ArrayList<String> list = new ArrayList<>();

        //2.添加元素
        list.add("点赞了吗");
        list.add("投币了吗");
        list.add("收藏了吗");

        //遍历
        System.out.println("[");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() -1){
                System.out.println(list.get(i));
            }else {
                System.out.println(list.get(i) + ",");
            }
        }
        System.out.println("]");

    }
}
