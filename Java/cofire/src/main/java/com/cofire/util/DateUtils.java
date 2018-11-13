package com.cofire.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public final class DateUtils {

    public DateUtils() {
    }

    public static String dateToString(Date date) {
        if (date == null) {
            return null;
        } else {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            return simpleDateFormat.format(date);
        }
    }

    public static String dateToTime(Date date) {
        if (date == null) {
            return null;
        } else {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HHmmss");
            return simpleDateFormat.format(date);
        }
    }

    public static String dateToNumber(Date date) {
        if (date == null) {
            return null;
        } else {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
            return simpleDateFormat.format(date);
        }
    }

    public static String getDay(Date date) {
        if (date == null)
            return null;
        else
            return dateToNumber(date).substring(6, 8);
    }

    public static String getMonth(Date date) {
        if (date == null)
            return null;
        else
            return dateToNumber(date).substring(4, 6);
    }

    public static String getYear(Date date) {
        if (date == null)
            return null;
        else
            return dateToNumber(date).substring(0, 4);
    }

    public static String dataTimeToString(Date time) {
        if (time == null) {
            return null;
        } else {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            return simpleDateFormat.format(time);
        }
    }

    public static String dataTimeToNumber(Date time) {
        if (time == null) {
            return null;
        } else {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
            return simpleDateFormat.format(time);
        }
    }

    public static String getTimeStampFormat(Date date) {
        if (date == null) {
            return null;
        } else {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HH.mm.ss.SSSSSS");
            return simpleDateFormat.format(date);
        }
    }

    public static Date stringToFullDateTime(String string) throws ParseException {
        if (string == null) {
            return null;
        } else {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            return simpleDateFormat.parse(string);
        }
    }

    public static Date stringToDate(String string) throws ParseException {
        if (string == null)
            return null;
        if (string.trim().length() == 0) {
            return null;
        } else {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            return simpleDateFormat.parse(string);
        }
    }

    public static Date stringToDate(String string, String format) throws ParseException {
        if (string == null)
            return null;
        if (string.trim().length() == 0) {
            return null;
        } else {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
            return simpleDateFormat.parse(string);
        }
    }

    public static Date stringToFullDateTimeWithTimeCompact(String string) throws ParseException {
        if (string == null)
            return null;
        if (string.trim().length() == 0) {
            return null;
        } else {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HHmmss");
            return simpleDateFormat.parse(string);
        }
    }

    public static Date stringToFullDateTimeWithCompact(String string) throws ParseException {
        if (string == null)
            return null;
        if (string.trim().length() == 0) {
            return null;
        } else {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
            return simpleDateFormat.parse(string);
        }
    }

    public static String stringToDateString(String string) {
        if (string == null)
            return null;
        StringBuilder time = new StringBuilder();
        for (int i = 0; i < 14; i++) {
            time.append(string.substring(i, i + 1));
            if (i == 3 || i == 5) {
                time.append("-");
                continue;
            }
            if (i == 7) {
                time.append(" ");
                continue;
            }
            if (i == 9 || i == 11)
                time.append(":");
        }

        return time.toString();
    }

    public static Date numberToDate(String string) throws ParseException {
        if (string == null) {
            return null;
        } else {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
            return simpleDateFormat.parse(string);
        }
    }

    public static String dateStringToNumber(String string) {
        return string.replaceAll("-", "");
    }

    public static String numberToDateString(String string) {
        if (string == null || string.trim().length() != 8)
            return "";
        else
            return (new StringBuilder()).append(string.substring(0, 4)).append("-").append(string.substring(4, 6)).append("-").append(string.substring(6, 8))
                    .toString();
    }

    public static String numberToTimeString(String time) {
        if (time == null || time.trim().length() != 14)
            return "";
        else
            return (new StringBuilder()).append(time.substring(0, 4)).append("-").append(time.substring(4, 6)).append("-").append(time.substring(6, 8))
                    .append(" ").append(time.substring(8, 10)).append(":").append(time.substring(10, 12)).append(":").append(time.substring(12, 14)).toString();
    }

    public static String numberToTimeString2(String time) {
        if (time == null || time.trim().length() != 6)
            return "";
        else
            return (new StringBuilder()).append(time.substring(0, 2)).append(":").append(time.substring(2, 4)).append(":").append(time.substring(4, 6))
                    .toString();
    }

    public static Date numberToTime(String string) throws ParseException {
        if (string == null) {
            return null;
        } else {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
            return simpleDateFormat.parse(string);
        }
    }

    public static String dateStringToNumber6(String date) {
        return date.replaceAll("-", "").substring(0, 6);
    }

    public static long DaysBetween(Date bgdate, Date enddate) {
        long beginTime = bgdate.getTime();
        long endTime = enddate.getTime();
        long days = (long) Math.floor((endTime - beginTime) / 86400000L);
        return days;
    }

    public static int convertDateToDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(6);
    }

    public static Date convertDayToDate(int year, int dayInYear) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, year);
        calendar.set(6, dayInYear);
        return calendar.getTime();
    }

    public static String getSysTimeString() {
        Date time = new Date();
        return dataTimeToNumber(time);
    }

    public static final String DATE_PATTERN_YYYY_MM_DD = "yyyy-MM-dd";
    public static final String DATE_PATTERN_YYYYMMDD = "yyyyMMdd";
    public static final String DATE_PATTERN_YYYYMM = "yyyyMM";
    public static final String DATE_PATTERN_YYYY_MM = "yyyy-MM";
    public static final String TIME_PATTERN_HHMMSS = "HHmmss";
    public static final String TIME_PATTERN_YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";
    public static final String TIME_PATTERN_YYYYMMDDHHMMSS = "yyyyMMddHHmmss";
    public static final String TIME_PATTERN_YYYY_MM_DD_HHMMSS = "yyyy-MM-dd HHmmss";
    public static final String TIME_PATTERN_YYYY_MM_DD_HHMMSSSSSSSS = "yyyy-MM-dd-HH.mm.ss.SSSSSS";
    public static final String TIME_PATTERN_HH_MM_SS = "HH:mm:ss";
    public static final int MILLISECOND_PER_DAY = 86400000;
}