package book.coretechnology.catalog;

import java.util.Scanner;
/*
* 此类不做参考
* */
public class Catalog3_8_6_2 {
    public static void main0(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int goal = 10;
        while (sum < goal) {
            System.out.print("Enter a number: ");
            int n = in.nextInt();
            if (n < 0) {
                continue;
            }
            sum += n; // not executed if n < 0 }
            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        for (int count = 1; count <= 100; count++) {
            int sum = 0;
            System.out.print("Enter a number, -1 to quit: ");
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            if (n < 0) {
                continue;
            }
            sum += n; // not executed if n < 0 }
        }
    }
}
