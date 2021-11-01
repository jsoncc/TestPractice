package net.csdn.thechany;


import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        System.out.println("请输入要判断的数:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (isPrime(num)) {
            System.out.println(num + "是素数");
        } else {
            System.out.println(num + "不是素数");
        }
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

