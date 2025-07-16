package test;

public class test2 {
    public static void main(String[] args) {
        //需求：判断101——200的数是不是素数

        int count = 0;  // 计数器放在外面

        for (int i = 101; i <= 200; i++) {
            // boolean flag 需要在这里，每次外循环时重置
            boolean flag = true;
            // 判断条件应该是 j < i 而不是 i < j
            for (int j = 2; j < i; j++) {
                // 如果能被整除，说明不是素数
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }

            // 如果flag仍为true，说明是素数
            if (flag) {
                System.out.println(i + "是素数");
                count++;
            }
        }

        // 最后统一输出个数
        System.out.println("素数的个数是" + count + "个");
    }
}