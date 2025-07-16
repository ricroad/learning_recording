package code;

import java.util.ArrayList;
import java.util.Scanner;

public class code4 {
    public static void main(String[] args) {
        //1.创建数组
        ArrayList<Student> list =new ArrayList<>();

        System.out.println("您想要录入几个学生信息？");

        //2.键盘录入学生信息
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            Student s =new Student();
            System.out.println("请输入学生名字");
            String na = sc.next();
            System.out.println("请输入学生的年纪");
            int age = sc.nextInt();

            //把name和age的值赋给学生student对象
            s.setAge(age);
            s.setName(na);

            //把学生对象添加到集合中
            list.add(s);
        }

        //3.循环遍历
        for (int i = 0; i < list.size(); i++) {
            //i索引list.get(1)元素学生对象
            Student stu =list.get(i);
            System.out.println(stu.getName()+ "," + stu.getAge() );
        }


    }
}
