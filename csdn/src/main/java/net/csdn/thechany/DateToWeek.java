package net.csdn.thechany;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 题目：Q7545125
 *
 */
public class DateToWeek {
    /**
     * 日期转星期
     *
     * @param datetime
     * @return
     */
    public static void dateToWeek(String datetime) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //星期几（7表示星期日）
        String[] weekDays = {"7", "1", "2", "3", "4", "5", "6"};
        Calendar cal = Calendar.getInstance();
        Date date = null;
        try {
            date = sdf.parse(datetime);
            cal.setTime(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        // 指示一个星期中的某天。
        int day = cal.get(Calendar.DAY_OF_WEEK) - 1;
        if (day < 0) {
            day = 0;
        }
        System.out.println("星期：" + weekDays[day]);
        System.out.println("当年的第几天：" + cal.get(Calendar.DAY_OF_YEAR));
    }

    public static void main(String[] args) {
        DateToWeek.dateToWeek("2021-10-26");
    }
}

