public class GameTest {
    public static void main(String[] args) {
        //1.创建角色
        Role r1 = new Role("贺煜峰",1000,'男');
        Role r2 =new Role("王军宝",1000,'男');

        //2.开始打架
        while (true){
            //r1开始攻击r2
            r1.attach(r2);
            if (r2.getBlood() == 0){
                System.out.println(r1.getName() + "打败了" + r2.getName());
                break;
            }
            //r2开始攻击r1
            r2.attach(r1);
            if (r1.getBlood() == 0){
                System.out.println(r2.getName() + "打败了" + r1.getName());
                break;
            }


        }




    }
}
