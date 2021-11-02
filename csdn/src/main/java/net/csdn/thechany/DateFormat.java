package net.csdn.thechany;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

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
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(2021, 11, 2, 17, 50, 20);
        Date d = c.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        System.out.println(sdf.format(d));
    }
}
