package net.csdn.thechany;

import java.util.Scanner;

/**
 * Q7547617
 * 输入长度为10的数组，输出下标为5-8的元素的累加和
 */
public class Plus {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (i > 4 && i < 9) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
}
