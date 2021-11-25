package book.coretechnology;

/**
 * @author JsonCC
 * @date 2021/11/10 17:13
 */

/**
 * 3.5.3 强制类型转换
 */
public class PL3_5_3 {
    public static void main(String[] args) {
        double x = 9.997;
        int nx = (int) x;
        System.out.println(nx);         //9
        int nx2 = (int) Math.round(x);
        System.out.println(nx2);        //10
    }
}
