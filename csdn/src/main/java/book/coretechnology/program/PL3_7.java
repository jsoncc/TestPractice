package book.coretechnology.program;

import java.util.Arrays;
import java.util.Scanner;

public class PL3_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("抽奖抽多少个？：");
        int m = sc.nextInt();
        System.out.println("抽奖最大数是？：");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;

        }
        int[] result = new int[m];
        for (int i = 0; i < result.length; i++) {
            int r = (int) (Math.random() * n);
            result[i] = numbers[r];
            numbers[r] = numbers[n - 1];
            n--;

        }
        Arrays.sort(result);
        for (int r:result){
            System.out.println(r);
        }

    }
}
