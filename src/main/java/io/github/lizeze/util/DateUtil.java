package io.github.lizeze.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author ：lzz
 * @BelongsProject: io.github.lizeze.util
 * @date ：Created in 2020/10/26 11:52
 * @description ：
 * @modified By：
 */
public class DateUtil {


    /**
     * 获取当日零点
     *
     * @return
     */
    public static Date getDayBeginTime() {
        Calendar todayStart = Calendar.getInstance();
        todayStart.set(Calendar.HOUR_OF_DAY, 0);
        todayStart.set(Calendar.MINUTE, 0);
        todayStart.set(Calendar.SECOND, 0);
        todayStart.set(Calendar.MILLISECOND, 0);
        return todayStart.getTime();
    }

    /**
     * 获取当日最后一刻
     *
     * @return
     */
    public static Date getDayEndTime() {
        Calendar todayStart = Calendar.getInstance();
        todayStart.set(Calendar.HOUR_OF_DAY, 23);
        todayStart.set(Calendar.MINUTE, 59);
        todayStart.set(Calendar.SECOND, 59);
        todayStart.set(Calendar.MILLISECOND, 999);
        return todayStart.getTime();
    }

    /**
     * 当前时间推迟到指定分钟之后
     *
     * @param min
     * @return
     */
    public static String addMinute(int min) {
        Calendar now = Calendar.getInstance();
        now.add(Calendar.MINUTE, min);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr = sdf.format(now.getTimeInMillis());
        return dateStr;
    }

    /**
     * 时间转字符串
     *
     * @param dateTime
     * @param pattern
     * @return
     */
    public static String dateToString(Date dateTime, String pattern) {
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        String str = format.format(dateTime); //2013-01-14
        return str;
    }

    /**
     * 1天以后的时间
     *
     * @return
     */
    public static Date dateAddOne() {
        Calendar calendar = new GregorianCalendar();
        calendar.add(calendar.DATE, 1);
        return calendar.getTime();
    }

    //返回指定年份
    public static int getYear(Date date) {
        String year = new SimpleDateFormat("yyyy").format(date);
        return Integer.parseInt(year);
    }

    //返回指定月份
    public static int getMonth(Date date) {
        String month = new SimpleDateFormat("MM").format(date);
        return Integer.parseInt(month);
    }

    //返回指定日期
    public static int getDay(Date date) {
        String day = new SimpleDateFormat("dd").format(date);
        return Integer.parseInt(day);
    }

    /**
     * 获得当月天数
     *
     * @return
     */
    public static int getCurrentMonthLastDay() {
        Calendar a = Calendar.getInstance();
        a.set(Calendar.DATE, 1);//把日期设置为当月第一天
        a.roll(Calendar.DATE, -1);//日期回滚一天，也就是最后一天
        int maxDate = a.get(Calendar.DATE);
        return maxDate;
    }

    /**
     * 得到指定月的天数
     */
    public static int getMonthLastDay(int year, int month) {
        Calendar a = Calendar.getInstance();
        a.set(Calendar.YEAR, year);
        a.set(Calendar.MONTH, month - 1);
        a.set(Calendar.DATE, 1);//把日期设置为当月第一天
        a.roll(Calendar.DATE, -1);//日期回滚一天，也就是最后一天
        int maxDate = a.get(Calendar.DATE);
        return maxDate;
    }
}
