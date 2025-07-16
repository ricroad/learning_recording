package test;

/*某系统的数字密码（大于e）。比如1983，采用加密方式进行传输，
规则如下：
     每位数字加上5
     再对十取余
     最后对所有的数字反转
     得到一串新数
*/


public class test6 {
    public static void main(String[] args) {
        //1.将每个数都加入到一个数组中
        int [] arr = {1,9,8,3};
        //2.加密（加5，对10取余，对最后的数字进行反转）
        //每位都加上5
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 5;
        }

        //对10取余
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] % 10;
        }

        for (int i = 0,j = arr.length-1;i < j; i++,j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        int number = 0;
        for (int i = 0; i < arr.length; i++) {
           number = number * 10 +arr[i];
            System.out.println(number);
        }
    }
}
