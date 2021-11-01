package net.csdn.thechany;

import java.util.Scanner;

public class DuShu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = "";
        while (true) {
            String num = in.next();
            if (num.equals('#')) {
                break;
            } else {
                str += num;
            }
        }
        System.out.println("输入的内容为：" + str);
    }


    public static void main0(String[] args) {
        Scanner in = new Scanner(System.in);
        String num = in.next();
        char[] chars = num.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '#') {
                break;
            } else {
                System.out.print((chars[i] - '0') + " ");
            }
        }
    }


}
