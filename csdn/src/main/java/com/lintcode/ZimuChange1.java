package com.lintcode;

import java.util.Scanner;

public class ZimuChange1 {
    public static void main(String[] args) {
        System.out.println("请输入任意字符：");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        //定义一个StringBuffer的实例sb
        StringBuffer sb = new StringBuffer();
        if (s != null) {
            for (int i = 0; i < s.length(); i++) {
                //索引指定位置的字符
                char c = s.charAt(i);
                //判断是否为小写字母
                if (Character.isLowerCase(c)) {
                    sb.append(Character.toUpperCase(c));
                } else if (Character.isUpperCase(c)) {
                    sb.append(Character.toLowerCase(c));
                }
            }
        }
        //打印输出
        System.out.println("转换后的字符：" + sb);
    }
}


