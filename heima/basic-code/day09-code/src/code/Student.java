package code;

public class Student {
    //标准javabean类需要哪些东西？
    //1.私有化的成员变量
    //2.空参构造
    //3.带所以参数的构造
    //4.get setter方法


    //1.
    private String name;
    private int age;

    //2.
    public Student(){
    }

    //3.
    public Student (String name,int age){
        this.name =name;
        this.age =age;
    }

    //4.get,setter方法
    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }




}
