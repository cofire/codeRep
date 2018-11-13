package com.cofire.util;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.UUID;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;

public class CommonUtils {

    public static final String[] picSuffix = { "bmp", "jpg", "jpeg", "png" };

    /**
     * map转bean
     * 
     * @Title: mapToBean
     * @author ly
     * @Description:
     * @param map
     * @param class1
     * @return
     * @return T 返回类型
     */
    public static <T> T mapToBean(HashMap<String, String> map, Class<T> class1) {
        T bean = null;
        try {
            bean = class1.newInstance();
            BeanUtils.populate(bean, map);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return bean;
    }

    /**
     * 生成uuid
     * 
     * @Title: getUUID
     * @author ly
     * @Description:
     * @return
     * @return String 返回类型
     */
    public static String getUUID() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    /**
     * 获取当日的开始时间和结束时间
     * 
     * @Title: getStartTime、getnowEndTime
     * @author yjb
     * @Description:
     * @return
     * @return String 返回类型
     */
    public static Date getStartTime() {
        Calendar todayStart = Calendar.getInstance();
        todayStart.set(Calendar.HOUR_OF_DAY, 0);
        todayStart.set(Calendar.MINUTE, 0);
        todayStart.set(Calendar.SECOND, 0);
        todayStart.set(Calendar.MILLISECOND, 0);
        return todayStart.getTime();
    }

    public static Date getnowEndTime() {
        Calendar todayEnd = Calendar.getInstance();
        todayEnd.set(Calendar.HOUR_OF_DAY, 23);
        todayEnd.set(Calendar.MINUTE, 59);
        todayEnd.set(Calendar.SECOND, 59);
        todayEnd.set(Calendar.MILLISECOND, 999);
        return todayEnd.getTime();
    }

    /**
     * 获取日期的后一天
     * 
     * @Title: getStartTime、getnowEndTime
     * @author yjb
     * @Description:
     * @return
     * @return String 返回类型
     */
    public static Date getDateAddOne(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(calendar.DATE, 1);// 日期向后+1天，整数往后推，负数向前推
        date = calendar.getTime();// 这个时间就是日期向后推一天的结果
        return date;
    }

    /**
     * 
     * @Title: getPath
     * @author ly
     * @Description: 生成文件的存放路径
     * @param p_baseName 代表 pic文件夹下的哪个子文件夹
     * @return
     * @return String 返回类型
     */
    public static String getPath(String p_baseName) {
        Calendar m_calendar = Calendar.getInstance();
        int m_year = m_calendar.get(Calendar.YEAR);
        int m_month = m_calendar.get(Calendar.MONTH) + 1;
        int m_day = m_calendar.get(Calendar.DAY_OF_MONTH);
        String m_path = p_baseName + "/" + m_year + "/" + m_month + "/" + m_day + "/";
        return m_path;
    }

    /**
     * 
     * @Title: getSuffix
     * @author ly
     * @Description:获取文件的扩展名，且判断文件是否为图片格式
     * @param p_fileName
     * @return
     * @return String 返回类型
     */
    public static String getSuffix(String p_fileName) {
        if (StringUtils.isEmpty(p_fileName)) {
            return null;
        }
        if (-1 == p_fileName.lastIndexOf(".")) {
            return null;
        }
        String m_suffix = p_fileName.substring(p_fileName.lastIndexOf(".") + 1);
        m_suffix = m_suffix.toLowerCase();
        int c_index = Arrays.binarySearch(picSuffix, m_suffix);
        if (c_index == -1) {
            return null;
        }
        return m_suffix;
    }

    public static void main(String[] args) {
        String fString1 = "jpg";
        String fString = "";
        String fsString = "wo.jpg";
        String fString2 = "wo.PNG";
        System.out.println(getSuffix(fString1));
        System.out.println(getSuffix(fString));
        System.out.println(getSuffix(fsString));
        System.out.println(getSuffix(fString2));
        System.out.println(getSuffix(null));
    }

    public static String StringtoMap(String p_str) {
        if (StringUtils.isEmpty(p_str)) {
            return null;
        }
        String m_str = "accessCardId" + "=" + p_str + "&";
        return m_str;
    }
}
