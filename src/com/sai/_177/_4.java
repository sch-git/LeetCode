package com.sai._177;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Title: 日期之间隔几天
 * @Description: 给定的日期是 1971 年到 2100 年之间的有效日期。
 * @Author: chenghao.su
 * @Date: 2020/2/23 10:33
 */
public class _4 {
    public static void main(String[] args) throws ParseException {

    }

    public int daysBetweenDates(String date1, String date2) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        long stime = 0;
        long etime = 0;
        try {
            Date start = format.parse(date1);
            Date end = format.parse(date2);
            stime = start.getTime();
            etime = end.getTime();
        } catch (Exception ex) {

        }
        return (int) (Math.abs(stime - etime) / (1000 * 60 * 60 * 24));
    }
}
