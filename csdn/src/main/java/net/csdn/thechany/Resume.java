package net.csdn.thechany;

/**
 * q7551385
 *
 */
public class Resume {
    public static void main(String[] args) {
        String str = "姓名：三 出生时间：1999.10.16。个人网站：http://www.zhang.com。身高：185 cm，体重：72 kg";
        if (str.contains("张")) {
            System.out.println("简历中的姓名姓“张”");
        }else{
            System.out.println("简历中的姓名不姓“张”");
        }
        int d1 = str.indexOf("出生时间：");
        int d2 = str.indexOf("。个人网站：");
        int d3 = str.indexOf("。身高：");
        int d4 = str.indexOf(" cm，体重：");
        int d5 = str.indexOf(" kg");
        System.out.println("出生日期：" + str.substring(d1 + 5, d2));
        System.out.println("个人网站：" + str.substring(d2 + 6, d3));
        double len = Double.parseDouble(str.substring(d3 + 4, d4));
        if (len > 180) {
            System.out.println("身高大于180cm");
        } else {
            System.out.println("身高小于180cm");
        }
        double weight = Double.parseDouble(str.substring(d4 + 7, d5));
        if (weight > 75) {
            System.out.println("体重大于75kg");
        } else {
            System.out.println("体重小于75kg");
        }
    }
}
