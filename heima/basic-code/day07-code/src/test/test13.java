package test;

import java.util.Random;

public class test13 {
    public static void main(String[] args) {
        //1.将奖池打乱
        int [] arr = {2,588,888,1000,10000};
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int randomindex = r.nextInt(arr.length);
            int temp = arr [i];
            arr[i] = arr [randomindex];
            arr[randomindex] = temp;
        }
        //2.遍历奖池
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
