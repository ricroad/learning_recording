package guigu_01;

import java.util.Scanner;

/*
1. 题目：判断闰年
编写一个 Java 程序，要求用户输入一个年份，然后判断该年份是否为闰年。
闰年的判断规则：
能被 4 整除，但不能被 100 整除。
或者能被 400 整除。

示例输入与输出：
输入: 2000
输出: 2000是闰年。
输入: 1900
输出: 1900不是闰年。
输入: 2024
输出: 2024是闰年。
输入: 2023
输出: 2023不是闰年。

提示：
使用 Scanner 获取用户输入。
使用 if-else if-else 或嵌套 if 结构来实现判断逻辑。
使用取模运算符 % 来判断整除。
 */
public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 先打印提示信息，再读取用户输入
        System.out.println("请输入一个年份：");
        int years = sc.nextInt();

        // 2. 完善闰年判断逻辑，添加else块处理非闰年情况
        if ((years % 4 == 0 && years % 100 != 0) || (years % 400 == 0)) {
            // 合并闰年的两个条件，用逻辑或 || 连接
            // 这样无论满足哪个条件，都是闰年
            System.out.println(years + "是闰年。");
        } else {
            // 不满足上述任何条件，则不是闰年
            System.out.println(years + "不是闰年。");
        }

        sc.close();
    }
}
