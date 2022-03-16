package book.coretechnology.catalog;

public class Catalog3_8_6 {

    public static void main(String[] args) {
        // 求1+3+5+7+9
        int sum = 0;// 记录和
        for (int i = 1; i <= 9; i++) {
            if (i % 2 == 0) {//结束当前循环的执行，继续下一次循环的执行
                continue;
            }
            sum = sum + i;
            System.out.println(sum);
        }
        System.out.println("1+3+5+9的和为：" + sum);
    }
}


