package book.coretechnology.catalog;

import java.util.Scanner;

public class Catalog3_8_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Select an option(1, 2, 3, 4)");
        int choice = in.nextInt();
        switch (choice) {
            case 1:
                System.out.println("您的选择的是1");
                break;
            case 2:
                System.out.println("您的选择的是2");
                break;
            case 3:
                System.out.println("您的选择的是3");
                break;
            case 4:
                System.out.println("您的选择的是4");
                break;
            default:
                System.out.println("您的选择有误");
                // bad input
                break;
        }
    }
}
