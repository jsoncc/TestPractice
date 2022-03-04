package book.coretechnology.catalog;

public class Catalog3_6_6 {
    public static void main(String[] args) {
        String greeting = "Hello";

        int n = greeting.length();
        System.out.println(n);

        char first = greeting.charAt(0);
        System.out.println(first);

        int cpCount = greeting.codePointCount(0, greeting.length());
        System.out.println(cpCount);

        int index = greeting.offsetByCodePoints(0,1);
        int cp =greeting.codePointAt(index);
        System.out.println(cp);//输出的是码点，即ASCII码值
    }
}
