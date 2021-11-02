package net.csdn.thechany;

public class CapNum {
    public static void main(String[] args) {
        String s1 = "AbdgabdBgabcdsD";
        int up = 0, low = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (Character.isUpperCase(s1.charAt(i))) {
                up++;
            } else if (Character.isLowerCase(s1.charAt(i))) {
                low++;
            }
        }
        System.out.print("大写字母个数：" + up + ",小写字母个数：" + low);
    }
}
