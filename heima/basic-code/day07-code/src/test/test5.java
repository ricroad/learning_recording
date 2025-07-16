package test;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        //1.获得六位评委的打分
        int score [] = getScores();

    }

    //2.完成第一步的评委打分步骤
    public static int [] getScores(){
       int score [] = new int[6];
       Scanner sc = new Scanner(System.in);
        for (int i = 0; i < score.length; i++) {
            System.out.println("请输入您的评分");
            score[i]  = sc.nextInt();
        }
        return score;
    }

}








//package test;
//
//import java.util.Scanner;
//
//public class test5 {
//    public static void main(String[] args) {
//        //1.定义方法获取评委的评分
//        int [] scores = GetScore();
//
//        //2.计算去掉最高分，去掉最低分之后的平均分
//        int max = scores[0];
//        int min = scores[0];
//        int sum = 0;
//
//        //找出最高分，最低分并计算总和
//        for (int i = 0; i < scores.length; i++) {
//            if (scores[i] > max)max = scores[i];
//            if (scores[i] < min)min = scores[i];
//            sum += scores[i];
//        }
//
//        //计算平均分
//        double average = (sum - max - min)/(scores.length - 2.0);
//        System.out.println("最终的得分是：" + average);
//    }
//
//    public static int [] GetScore(){
//        int [] scores = new int[6];
//        Scanner sc =new Scanner(System.in);
//        for (int i = 0; i < scores.length; i++) {
//            System.out.println("请输入您的评分");
//            int score =sc.nextInt();
//            score = scores[i];
//        }
//        return scores;
//
//
//    }
//
//
//}