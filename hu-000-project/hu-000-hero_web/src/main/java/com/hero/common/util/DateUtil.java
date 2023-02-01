package com.hero.common.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class DateUtil {
    public static String formatStr(String dateStr) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date date = simpleDateFormat.parse(dateStr);
            simpleDateFormat = new SimpleDateFormat("yyyyMMddHH");
            return simpleDateFormat.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Date toDayStartHour(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        Date start = calendar.getTime();
        return start;
    }

    public static Date addDateMinutes(Date date, int minutes) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(12, minutes);
        date = calendar.getTime();
        return date;
    }

    public static Date addDateHour(Date date, int hour) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(10, hour);
        date = calendar.getTime();
        return date;
    }

    public static List<Date> getDateMenus() {
        List<Date> dates = new ArrayList<>();
        Date date = toDayStartHour(new Date());
        for (int i = 0; i < 12; i++)
            dates.add(addDateHour(date, i * 2));
        Date now = new Date();
        for (Date cdate : dates) {
            if (cdate.getTime() <= now.getTime() && now.getTime() < addDateHour(cdate, 2).getTime()) {
                now = cdate;
                break;
            }
        }
        List<Date> dateMenus = new ArrayList<>();
        for (int j = 0; j < 5; j++)
            dateMenus.add(addDateHour(now, j * 2));
        return dateMenus;
    }

    public static String date2Str(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHH");
        return simpleDateFormat.format(date);
    }

    public static void main(String[] args) {
        List<Date> dateMenus = getDateMenus();
        for (Date dateMenu : dateMenus) {
            String redisExtName = date2Str(dateMenu);
            System.out.println(redisExtName);
        }
    }
}
