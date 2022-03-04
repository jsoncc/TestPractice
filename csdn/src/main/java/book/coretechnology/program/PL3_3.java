package book.coretechnology.program;

import java.util.Scanner;

/**
 * 程序清单 3-3中的程序将计算需要多长时间才能够存储一定数量的退休金，假定每年存入相同数量的金额，而且利率是固定的。
 * 程序清单 3-3 Retirement/Retirement.java
 */
public class PL3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //你到退休需要多少钱？
        System.out.println("How much money do you need to retire?");
        double goal = sc.nextDouble();
        //你每年存多少？
        System.out.println("How much money will you contribute every year?");
        double payment = sc.nextDouble();
        //每年利率是多少？
        System.out.println("Interest Ration in %:?");
        double interestRate = sc.nextDouble();

        //balance为累计的存款
        double balance = 0;
        int years = 0;
        while (balance < goal) {
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            years++;
        }
        System.out.println("你" + years + "就可以退休了");
    }
}
