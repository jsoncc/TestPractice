package net.csdn.thechany;

/**
 * q7552527
 */
public class Stuff {
    static int x;

    static {
        x += 5;
    }

    public static void main(String[] args) {
        System.out.println(x);
    }

    static {
        x /= 5;
    }
}
