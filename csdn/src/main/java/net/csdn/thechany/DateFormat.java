package net.csdn.thechany;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateFormat {
    /*
     * 把当前时间转换为12或者24小时制
     * */
    public static void main0(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        String time = sdf.format(new Date(System.currentTimeMillis()));
        System.out.println("当前时间的24小时制：" + time);
    }

    /*
     * 指定时间转换成12或者24小时制
     *      使用日历
     * */
    public static void main1(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(2021, 11, 2, 17, 50, 20);
        Date d = c.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        System.out.println(sdf.format(d));//17:50
    }

    /*
     * 输入样例：20:09
     * 输出样例：08:09 PM
     * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tx = scanner.nextLine().split(":", 2);
        int hour = Integer.parseInt(tx[0]);
        int minute = Integer.parseInt(tx[1]);
        String flag;
        if (hour > 0 && hour < 12) {
            flag = "AM";
        } else if (hour == 24 || hour == 0) {
            hour = 12;
            flag = "AM";
        } else {
            flag = "PM";
            if (hour != 12) {
                hour %= 12;
            }
        }

        System.out.println(alignItem(hour) + ":" + alignItem(minute) + " " + flag);
    }

    public static String alignItem(int i) {
        return String.format("%02d", i);
    }

}
