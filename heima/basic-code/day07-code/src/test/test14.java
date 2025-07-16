//package test;
//
//import java.util.Random;
//import java.util.Scanner;
//
//public class test14 {
//    public static void main(String[] args) {
//        //1.生成中奖号码
//        int [] arr = creatNumber();
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//
//        //2.用户输入彩票号码（红球+蓝球）
//             int userInputArr [] = recordnumber();
//            for (int i1 = 0; i1 < userInputArr.length; i1++) {
//                System.out.println();
//            }
//
//
//
//
//        }
//
//    }
//
//    //创建方法来记录用户输入的中奖号码
//    public static int [] recordnumber(){
//        Scanner sc = new Scanner(System.in);
//        //1.创建一个数组来记录用户购买的号码
//        int arr [] = new int[7];
//        //首先让用户输入6个红球号码
//        for (int i = 0; i < 6; i++) {
//            System.out.println("请输入您购买的第" + (i + 1 )+ "个红球号码");
//            //用户的输入需要判断是否重复
//            boolean redNumber = contains(arr,redNumber);
//
//
//            //用户的输入红球需要判断是否合法
//            int redNumber =sc.nextInt();
//            if (redNumber >= 1 && redNumber <= 33){
//                boolean flag = contains(arr,redNumber);
//                if (!flag){
//                    //不存在，可以添加到数组中
//                    arr[i] = redNumber;
//                }else{
//                    //已经存在这个数
//                    System.out.println("当前数字已经存在请重新输入");
//                }
//
//
//            }else {
//                System.out.println("输入的红球数超出范围");
//            }
//        }
//
//           //用户输入的蓝球号码是否合适
//        System.out.println("请输入蓝球号码");
//           //1~16
//        while (true) {
//            int blueNumber = sc.nextInt();
//            if (blueNumber >=1 && blueNumber <= 16){
//                arr[arr.length-1] = blueNumber;
//            }else{
//                System.out.println("当前号码不符合要求");
//
//            }
//        }
//
//        return arr;
//
//
//    }
//
//
//
//
//
//    public static int [] creatNumber(){
//        //1.创建数组用于添加中奖号码
//        //6个红球 1个蓝球 数组的长度为7
//        int [] arr = new int[7];
//
//        //添加红球号码
//        Random r = new Random();
//        for (int i = 0; i < 6; i++) {
//            int rednumber = r.nextInt(33) + 1;
//            boolean flag =contains(arr,rednumber);
//            if (!flag){
//                arr[i] = rednumber;
//                i++;
//            }
//        }
//
//        //生成蓝球号码添加到数组中
//        int blueNumber = r.nextInt(16) + 1;
//        arr[arr.length - 1] = blueNumber;
//        return arr;
//    }
//
//
//    //因为红球不能重复，所以添加该方法用于判断数字在数组中是否存在
//    public static boolean contains(int [] arr,int number){
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == number){
//                return  true;
//            }
//        }
//        return false;
//    }
//
//
//
//
//
//}
