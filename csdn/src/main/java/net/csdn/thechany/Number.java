package net.csdn.thechany;

/**
 * 题目：求 整数 1~100之间的含有 7 或者7的倍数的数一共有多少 分别是什么？
 */
public class Number {
    public static void main(String[] args) {
        int num = 0;
        for (int i = 1; i <= 100; i++) {
            int ge = i % 10;//把个位数算出来
            int shi = i / 10 % 10;//把十位数算出来
            if (ge == 7 || shi == 7) {
                num++;
                System.out.print(" " + i);
            } else if (i % 7 == 0) {
                num++;
                System.out.print(" " + i);
            }
        }
        System.out.println();
        System.out.println("总个数：" + num);
    }
}
