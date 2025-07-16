import java.util.Random;

public class Role {
    private String name;
    private int blood;
    private char gender;
    private String face;


    String[] boyfaces = {"风流倜傥","气宇轩昂"};
    String[] girlfaces = {"妩媚多姿","面容姣好"};

    public Role(String name, int blood,char
                gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        setFace(gender);
    }


    public String getFace() {
        return face;
    }

    public void setFace(char gender) {
        //长相是随机的
        Random r = new Random();
        if (gender == '男'){
            int nanxiang = r.nextInt(boyfaces.length);
            //从bodyface里面随机长相
            this.face = boyfaces[nanxiang];
        } else if (gender == '女') {
            //从girlsface里面随机长相
            int nvxiang = r.nextInt(girlfaces.length);
            this.face = girlfaces[nvxiang];
        }
        //从bodyface里面随机长相
        this.face = face;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Role() {
    }



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
     * @return blood
     */
    public int getBlood() {
        return blood;
    }

    /**
     * 设置
     * @param blood
     */
    public void setBlood(int blood) {
        this.blood = blood;
    }

    //定义一个方法来攻击别人
    public void attach(Role role){
        Random h = new Random();
        int hurt = h.nextInt(20) + 1;

        int remainBlood = role.getBlood() - hurt;

        remainBlood = remainBlood < 0 ? 0 : remainBlood;

        role.setBlood(remainBlood);

        System.out.println(this.getName() + "打了"  + role.getName() + "一下，"
                + role.getName() + "损失了" + hurt + "点血量" + role.getName() + "还剩下" + remainBlood + "点血量" );

    }

    //计算造成的伤害1~20

    //造成血量

    //对剩余血量做一下验证

    //修改一下挨揍人的血量

    //判断一下是谁打谁


//    //定义一个方法来攻击别人
//    public void attack(Role role){
//        //计算造成的伤害1~20
//        Random r = new Random() ;
//        int hurt = r.nextInt(20) + 1;
//
//        //造成血量
//        int remainBoold = role.getBlood() - hurt;
//
//        //对剩余血量做一下验证
//        remainBoold = remainBoold < 0 ? 0 : remainBoold;
//        //修改一下挨揍人的血量
//        role.setBlood(remainBoold);
//
//        //判断一下是谁打谁
//        System.out.println(this.getName() + "举起拳头，打了" + role.getName() + "一下，"
//                + "造成了" + hurt + "点伤害" + getName() +"杨过还剩下" + remainBoold + "点血");
//
//
//    }


}
