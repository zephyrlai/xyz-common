package com.xyz.utils;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * 时间类型
 *
 * @author nileader / nileader@gmail.com
 * @Date Feb 15, 2012
 */
public enum DateFormat {
    Date("yyyy-MM-dd"), DateTime("yyyy-MM-dd HH:mm:ss");

    private final String format;

    private DateFormat(String format) {
        this.format = format;
    }

    public String getFormat() {
        return this.format;
    }

    /**
     * 缺省日期格式
     */
    public static final String DATE_FORMAT_YYYY = "yyyy";

    /**
     * 缺省日期格式
     */
    public static final String DATE_FORMAT_MM = "MM";

    /**
     * 缺省日期格式
     */
    public static final String DATE_FORMAT_YYYYMMDD = "yyyyMMdd";

    public static final String DATE_FORMAT_YYYY_MM_DD = "yyyy/MM/dd";

    /**
     * 缺省日期格式
     */
    public static final String DEFAULT_DATE_FORMAT = "yyyy-MM-dd";

    /**
     * 缺省日期格式
     */
    public static final String DEFAULT_MONTH_FORMAT = "yyyy-MM";

    /**
     * 缺省时间格式
     */
    public static final String DEFAULT_TIME_FORMAT = "HH:mm:ss";

    /**
     * 缺省月格式
     */
    public static final String DEFAULT_MONTH = "MONTH";

    /**
     * 缺省年格式
     */
    public static final String DEFAULT_YEAR = "YEAR";

    /**
     * 缺省日格式
     */
    public static final String DEFAULT_DATE = "DAY";

    public static final String DEFAULT_HOUR = "HOUR";

    public static final String DEFAULT_MINUTE = "MINUTE";

    public static final String DEFAULT_SECOND = "SECOND";

    /**
     * 缺省长日期格式
     */
    public static final String DEFAULT_DATETIME_FORMAT_HH = "yyyy-MM-dd HH";

    /**
     * 缺省长日期格式
     */

    public static final String DEFAULT_DATETIME_FORMAT = "yyyy-MM-dd HH-mm";

    /**
     * 缺省长日期格式,精确到秒
     */
    public static final String DEFAULT_DATETIME_FORMAT_SEC = "yyyy-MM-dd HH:mm:ss";

    /**
     * 缺省长日期格式,精确到分
     */
    public static final String DEFAULT_DATETIME_FORMAT_MIN = "yyyy-MM-dd HH:mm";

    /**
     * 缺省长日期格式,精确到秒
     */
    public static final String DEFAULT_DATETIME_FORMAT_S = "yyyyMMddHHmmss";

    /**
     * @return返回字符串格式 yyyy-MM-dd
     */
    public static String d2S(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat(DATE_FORMAT_YYYYMMDD);
        return formatter.format(date);
    }

    /**
     * @return返回字符串格式 yyyy
     */
    public static String d2s(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat(DATE_FORMAT_YYYY);
        return formatter.format(date);
    }

    public static String D2M(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat(DEFAULT_MONTH_FORMAT);
        return formatter.format(date);
    }

    /**
     * @return返回字符串格式 MM
     */
    public static String m2s(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat(DATE_FORMAT_MM);
        return formatter.format(date);
    }

    /**
     * @return返回字符串格式 yyyy-MM-dd HH:mm:ss
     */
    public static String DD2S(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat(DEFAULT_DATETIME_FORMAT_SEC);
        return formatter.format(date);
    }

    /**
     * @return返回字符串格式 yyyyMMddHHmmss
     */
    public static String DDd2S(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat(DEFAULT_DATETIME_FORMAT_S);
        return formatter.format(date);
    }

    /**
     * 获取现在时间
     *
     * @return 返回短时间字符串格式yyyy-MM-dd
     */
    public static String D2S(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat(DEFAULT_DATE_FORMAT);
        return formatter.format(date);
    }

    /**
     * 获取现在时间
     *
     * @return 返回短时间字符串格式yyyy/MM/dd
     */
    public static String D22S(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat(DATE_FORMAT_YYYY_MM_DD);
        return formatter.format(date);
    }

    /**
     * 获取时间 小时:分;秒 HH:mm:ss
     *
     * @return
     */
    public static String D2T(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat(DEFAULT_TIME_FORMAT);
        return formatter.format(date);
    }

    /**
     * 将长时间格式字符串转换为时间 yyyy-MM-dd
     *
     * @param strDate
     * @return
     */
    public static Date S2D(String strDate) {
        SimpleDateFormat formatter = new SimpleDateFormat(DEFAULT_DATE_FORMAT);
        ParsePosition pos = new ParsePosition(0);
        Date strtodate = formatter.parse(strDate, pos);
        return strtodate;
    }

    public static Date s2D(String strDate) {
        SimpleDateFormat formatter = new SimpleDateFormat(DATE_FORMAT_YYYYMMDD);
        ParsePosition pos = new ParsePosition(0);
        Date strtodate = formatter.parse(strDate, pos);
        return strtodate;
    }

    /**
     * 将长时间格式字符串转换为时间 yyyy-MM-dd
     *
     * @param strDate
     * @return
     */
    public static Date S22d(String strDate) {
        SimpleDateFormat formatter = new SimpleDateFormat(DATE_FORMAT_YYYY_MM_DD);
        ParsePosition pos = new ParsePosition(0);
        Date strtodate = formatter.parse(strDate, pos);
        return strtodate;
    }

    /**
     * 将长时间格式字符串转换为时间 yyyy-MM-dd HH:mm:ss
     *
     * @param strDate
     * @return
     */
    public static Date S2DD(String strDate) {
        SimpleDateFormat formatter = new SimpleDateFormat(DEFAULT_DATETIME_FORMAT_SEC);
        ParsePosition pos = new ParsePosition(0);
        Date strtodate = formatter.parse(strDate, pos);
        return strtodate;
    }

    public static Date S2dd(String strDate) {
        SimpleDateFormat formatter = new SimpleDateFormat(DEFAULT_DATETIME_FORMAT_HH);
        ParsePosition pos = new ParsePosition(0);
        Date strtodate = formatter.parse(strDate, pos);
        return strtodate;
    }

    /**
     * 将长时间格式字符串转换为时间 yyyy-MM-dd HH:mm:ss
     *
     * @param strDate
     * @return
     */
    public static Date S2DDd(String strDate) {
        SimpleDateFormat formatter = new SimpleDateFormat(DEFAULT_DATETIME_FORMAT_S);
        ParsePosition pos = new ParsePosition(0);
        Date strtodate = formatter.parse(strDate, pos);
        return strtodate;
    }

    /**
     * 将长时间格式字符串转换为时间 yyyy-MM-dd HH-mm
     *
     * @param strDate
     * @return
     */
    public static Date S2Dd(String strDate) {
        SimpleDateFormat formatter = new SimpleDateFormat(DEFAULT_DATETIME_FORMAT);
        ParsePosition pos = new ParsePosition(0);
        Date strtodate = formatter.parse(strDate, pos);
        return strtodate;
    }

    /**
     * 取得相对于当前时间增加天数/月数/年数后的日期 <br>
     * 欲取得当前日期5天前的日期,可做如下调用:<br>
     * getAddDay("DATE", -5).
     *
     * @param field
     *            ,段,如"year","month","date",对大小写不敏感
     *
     * @param amount
     *            ,增加的数量(减少用负数表示),如5,-1
     * @return 格式化后的字符串 如"2000-02-01"
     **/

    /**
     * 功能：对于给定的时间增加天数/月数/年数后的日期,按指定格式输出
     *
     * @param date      String 要改变的日期
     * @param field     int 日期改变的字段，YEAR,MONTH,DAY
     * @param amount    int 改变量
     * @param strFormat 日期返回格式
     * @return
     * @throws ParseException
     * @author
     */
    public static String getAddDay(String date, String field, int amount, String strFormat) throws ParseException {
        // 当前日期和前一天

        SimpleDateFormat formatter = new SimpleDateFormat(strFormat);

        Calendar rightNow = Calendar.getInstance();
        Date tempdate = formatter.parse(date);
        rightNow.setTime(tempdate);

        int intField = 0;
        String tmpField = field.toUpperCase();

        intField = Calendar.DATE;
        if (tmpField.equals(DEFAULT_YEAR))
            intField = Calendar.YEAR;
        if (tmpField.equals(DEFAULT_MONTH))
            intField = Calendar.MONTH;
        if (tmpField.equals(DEFAULT_DATE))
            intField = Calendar.DATE;
        if (tmpField.equals(DEFAULT_HOUR))
            intField = Calendar.HOUR;
        if (tmpField.equals(DEFAULT_MINUTE))
            intField = Calendar.MINUTE;

        rightNow.add(intField, amount);
        String day = formatter.format(rightNow.getTime());
        return day;
    }

    /**
     * 功能：对于给定的时间增加天数/月数/年数后的日期,按指定格式输出
     *
     * @param date      String 要改变的日期
     * @param field     int 日期改变的字段，YEAR,MONTH,DAY
     * @param amount    int 改变量
     * @param strFormat 日期返回格式
     * @return
     * @throws ParseException
     * @author caohongbin
     */
    public static String getAddDay(Date date, String field, int amount, String strFormat) {
        // 当前日期和前一天

        SimpleDateFormat formatter = new SimpleDateFormat(strFormat);

        Calendar rightNow = Calendar.getInstance();
        Date tempdate = date;
        rightNow.setTime(tempdate);

        int intField = 0;
        String tmpField = field.toUpperCase();

        intField = Calendar.DATE;
        if (tmpField.equals(DEFAULT_YEAR))
            intField = Calendar.YEAR;
        if (tmpField.equals(DEFAULT_MONTH))
            intField = Calendar.MONTH;
        if (tmpField.equals(DEFAULT_DATE))
            intField = Calendar.DATE;
        if (tmpField.equals(DEFAULT_HOUR))
            intField = Calendar.HOUR;
        if (tmpField.equals(DEFAULT_MINUTE))
            intField = Calendar.MINUTE;
        if (tmpField.equals(DEFAULT_SECOND))
            intField = Calendar.SECOND;
        rightNow.add(intField, amount);
        String day = formatter.format(rightNow.getTime());
        return day;
    }

    /**
     * 功能：对于给定的时间增加天数/月数/年数后的日期,按指定格式输出
     *
     * @param d1    Date 日期
     * @param d2    Date 日期
     * @param field int 日期改变的字段，YEAR,MONTH,DAY
     * @return
     * @throws ParseException
     * @author caohongbin
     */
    public static long getReduceDay(Date d1, Date d2, String field) {
        // 当前日期和前一天
//		SimpleDateFormat df = new SimpleDateFormat(strFormat);
        long l = d1.getTime() - d2.getTime();
        long day = 0;
        String tmpField = field.toUpperCase();
        if (tmpField.equals(DEFAULT_YEAR))
            day = l / (24 * 60 * 60 * 1000 * 365);
        if (tmpField.equals(DEFAULT_MONTH))
            day = l / (24 * 60 * 60 * 1000 * 30);
        if (tmpField.equals(DEFAULT_DATE))
            day = l / (24 * 60 * 60 * 1000);
        if (tmpField.equals(DEFAULT_HOUR))
            day = l / (60 * 60 * 1000);
        if (tmpField.equals(DEFAULT_MINUTE))
            day = l / (60 * 1000);
        if (tmpField.equals(DEFAULT_SECOND))
            day = l / 1000;
        return day;
    }

    /**
     * Timestamp按照指定格式转为字符串
     *
     * @param ts      源对象
     * @param sFormat ps（如yyyy.mm.dd）
     * @return 如：2003-01-01 或2003-01-01 13:21
     */
    public static String toString(Timestamp ts, String sFormat) {
        if (ts == null) {
            return "";
        }
        java.util.Date d = new Date(ts.getTime());
        return toString(d, sFormat);
    }

    /**
     * Timestamp按照缺省格式转为字符串
     *
     * @param ts 源对象
     * @return 如：2003-01-01
     */
    public static String toString(Timestamp ts) {
        return toString(ts, DEFAULT_DATE_FORMAT);
    }

    /**
     * Timestamp按照缺省格式转为字符串，可指定是否使用长格式
     *
     * @param ts         欲转化之变量Timestamp
     * @param fullFormat 是否使用长格式
     * @return 如：2003-01-01 或2003-01-01 13:21
     */
    public static String toString(Timestamp ts, boolean fullFormat) {
        String s = null;
        if (fullFormat) {
            s = DEFAULT_DATETIME_FORMAT_SEC;
        } else {
            s = DEFAULT_DATE_FORMAT;
        }

        return toString(ts, s);
    }

    /**
     * 将sqldate型按照指定格式转为字符串
     *
     * @param sqldate 源对象
     * @param sFormat ps
     * @return 如：2003-01-01 或2003-01-01 00:00
     */
    public static String toString(java.sql.Date sqldate, String sFormat) {
        if (sqldate == null) {
            return "";
        }
        java.util.Date d = new Date(sqldate.getTime());
        return toString(d, sFormat);
    }

    /**
     * 将sqldate型按照缺省格式转为字符串
     *
     * @param sqldate 源对象
     * @return 如：2003-01-01
     */
    public static String toString(java.sql.Date sqldate) {
        return toString(sqldate, DEFAULT_DATE_FORMAT);
    }

    /**
     * 将java.util.date型按照指定格式转为字符串
     *
     * @param d       源对象
     * @param sFormat ps
     * @return 如：2003-01-01
     */
    public static String toString(java.util.Date d, String sFormat) {
        SimpleDateFormat formatter = new SimpleDateFormat(sFormat);
        String dateString = formatter.format(d);
        return dateString;
    }

    /**
     * 将java.util.date型按照缺省格式转为字符串
     *
     * @param d 源对象
     * @return 如：2003-01-01
     */
    public static String toString(java.util.Date d) {
        return toString(d, DEFAULT_DATE_FORMAT);
    }

    /**
     * 强制类型转换 从串到日期
     *
     * @param sDate   源字符串，采用yyyy-MM-dd格式
     * @param sFormat ps
     * @return 得到的日期对象
     * @throws ParseException
     */
    public static java.util.Date parseDate(String sDate, String sFormat) {
        SimpleDateFormat formatter = null;

        java.util.Date utildate = null;
        try {
            formatter = new SimpleDateFormat(sFormat);
            utildate = formatter.parse(sDate);
        } catch (ParseException e) {
            utildate = new Date();
        }

        return utildate;
    }

    /**
     * 强制类型转换 从串到时间戳
     *
     * @param sDate   源串
     * @param sFormat 遵循格式
     * @return 取得的时间戳对象
     * @throws ParseException
     */
    public static Timestamp parseTimestamp(String sDate, String sFormat) throws ParseException {
        SimpleDateFormat formatter = null;

        java.util.Date utildate = null;
        formatter = new SimpleDateFormat(sFormat);
        utildate = formatter.parse(sDate);
        Timestamp tsdate = new Timestamp(utildate.getTime());
        return tsdate;
    }

    /**
     * getCurDate 取当前日期
     *
     * @return java.util.Date型日期
     **/
    public static java.util.Date getCurDate() {
        return (new Date());
    }

    /**
     * getCurTimestamp 取当前时间戳
     *
     * @return java.sql.Timestamp
     **/
    public static Timestamp getCurTimestamp() {
        java.util.Date today = new Date();
        Timestamp ts = new Timestamp(today.getTime());
        return ts;
    }

    /**
     * getCurTimestamp 取遵循格式的当前时间
     *
     * @param format 遵循格式
     * @return java.sql.Timestamp
     **/
    public static Date getCurDate(String format) throws Exception {
        SimpleDateFormat formatter = new SimpleDateFormat(format);
        String strCurDate = toString(new Date(), format);
        Date date = formatter.parse(strCurDate);
        return date;
    }

    public static String oneYearLater(Date date, int i) throws Exception {
        SimpleDateFormat formatter = new SimpleDateFormat(DEFAULT_DATE_FORMAT);
        long afterTime = (date.getTime() / 1000) + 60 * 60 * 24 * 365 * i;
        date.setTime(afterTime * 1000);
        return formatter.format(date);
    }

    public static String sumDay(Date date, int i, String fmt) throws Exception {
        SimpleDateFormat formatter = new SimpleDateFormat(fmt);
        long afterTime = (date.getTime() / 1000) + 60 * 60 * 24 * i;
        date.setTime(afterTime * 1000);
        return formatter.format(date);
    }

    public static long getDays(Date date, Date now, String s) throws Exception {
        long afterTime = (date.getTime() / 1000);
        long aTime = (now.getTime() / 1000);
        if (DEFAULT_HOUR.equals(s)) {
            return (afterTime - aTime) / (60 * 60);
        } else if (DEFAULT_MINUTE.equals(s)) {
            return (afterTime - aTime) / (60);
        } else if (DEFAULT_DATE.equals(s)) {
            return (afterTime - aTime) / (60 * 60 * 24);
        }
        return afterTime - aTime;
    }

    /**
     * 将UTC日期转为北京时间
     *
     * @param date
     * @return
     */
    public static String parseDateFromUTC(Date date, int num) {
        SimpleDateFormat formatter = new SimpleDateFormat(DEFAULT_DATETIME_FORMAT_HH);
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.HOUR_OF_DAY, num);
        return formatter.format(cal.getTime());
    }

    public static String dd2S(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat(DEFAULT_DATETIME_FORMAT_HH);
        return formatter.format(date);
    }

    /**
     * 判断当前日期是星期几<br>
     * <br>
     *
     * @param pTime 修要判断的时间<br>
     * @return dayForWeek 判断结果<br>
     * @Exception 发生异常<br>
     */
    public static int dayForWeek(String pTime) throws Exception {
        SimpleDateFormat format = new SimpleDateFormat(DEFAULT_DATE_FORMAT);
        Calendar c = Calendar.getInstance();
        c.setTime(format.parse(pTime));
        int dayForWeek = 0;
        if (c.get(Calendar.DAY_OF_WEEK) == 1) {
            dayForWeek = 7;
        } else {
            dayForWeek = c.get(Calendar.DAY_OF_WEEK) - 1;
        }
        return dayForWeek;
    }

    /**
     * @return返回字符串格式 yyyy-MM-dd HH
     */
    public static String Dh2S(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat(DEFAULT_DATETIME_FORMAT_HH);
        return formatter.format(date);
    }

    /**
     * @return返回字符串格式 yyyy-MM-dd HH:mm
     */
    public static String Dhm2S(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat(DEFAULT_DATETIME_FORMAT_MIN);
        return formatter.format(date);
    }

    public static List<Date> getDatesBetweenTwoDate(String start, String end, int i) {
        // String start = "2016-09-09", end = "2016-09-11";
        List<Date> ldate = new ArrayList<Date>();
        Date sdate = DateFormat.S2D(start);
        ldate.add(sdate);// 把开始时间加入集合
        Calendar cal = Calendar.getInstance(); // 使用给定的 Date 设置此 Calendar 的时间
        cal.setTime(sdate);
        Date endDate = DateFormat.S2D(end);
        boolean bContinue = true;
        while (bContinue) { // 根据日历的规则，为给定的日历字段添加或减去指定的时间量
            cal.add(i, 1); // 测试此日期是否在指定日期之后
            if (endDate.after(cal.getTime())) {
                ldate.add(cal.getTime());
            } else {
                break;
            }
        }
        // ldate.add(endDate);// 把结束时间加入集合
        // for(Date d : ldate){
        // System.out.println(DateFormat.DD2S(d));
        // }
        return ldate;
    }

    public static List<Date> getDatesBetweenTwoDate(String start, String end, int i, int space) {
        // String start = "2016-09-09", end = "2016-09-11";
        List<Date> ldate = new ArrayList<Date>();
        Date sdate = DateFormat.S2D(start);
        ldate.add(sdate);// 把开始时间加入集合
        Calendar cal = Calendar.getInstance(); // 使用给定的 Date 设置此 Calendar 的时间
        cal.setTime(sdate);
        Date endDate = DateFormat.S2D(end);
        boolean bContinue = true;
        while (bContinue) { // 根据日历的规则，为给定的日历字段添加或减去指定的时间量
            cal.add(i, space); // 测试此日期是否在指定日期之后
            if (endDate.after(cal.getTime())) {
                ldate.add(cal.getTime());
            } else {
                break;
            }
        }
        // ldate.add(endDate);// 把结束时间加入集合
        // for(Date d : ldate){
        // System.out.println(DateFormat.DD2S(d));
        // }
        return ldate;
    }

    public static List<Date> getDDDatesBetweenTwoDate(String start, String end, int i, int space) {
        // String start = "2016-09-09", end = "2016-09-11";
        List<Date> ldate = new ArrayList<Date>();
        Date sdate = DateFormat.S2DD(start);
        ldate.add(sdate);// 把开始时间加入集合
        Calendar cal = Calendar.getInstance(); // 使用给定的 Date 设置此 Calendar 的时间
        cal.setTime(sdate);
        Date endDate = DateFormat.S2DD(end);
        boolean bContinue = true;
        while (bContinue) { // 根据日历的规则，为给定的日历字段添加或减去指定的时间量
            cal.add(i, space); // 测试此日期是否在指定日期之后
            if (endDate.after(cal.getTime())) {
                ldate.add(cal.getTime());
            } else {
                break;
            }
        }
        // ldate.add(endDate);// 把结束时间加入集合
        // for(Date d : ldate){
        // System.out.println(DateFormat.DD2S(d));
        // }
        return ldate;
    }
}
