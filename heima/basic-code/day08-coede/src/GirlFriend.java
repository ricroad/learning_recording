public class GirlFriend {
    //属性
    private  int age ;
    private String name;
    private String gender;


    //作用给成员变量进行赋值
    public void setName(String n){
        name = n;
    }

    //向外提供name的属性
    public String getName(){
        return name;
    }

    public void setGender(String g){
        gender = g;
    }

    public void setAge(int a){
        if (a >= 18 && a <= 50){
            age = a;
        }else {
            System.out.println("输入数值不合规");
        }
    }








}
