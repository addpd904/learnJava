package com.stage2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Objects;

//default extent Object
//A.toString ,equals ,Objects (tool class), StingBuilder
public class learnApi {
    /*a. toString , equals
    public String toString()默认是返回当前对象在堆内存中的地址信息:类的全限名@内存地址
    public boolean equals(Object o) 默认是比较当前对象与另一个对象的地址是否相同，相同返回true，不同返回false
    * */
    public void testtoString(){
        learnApi lea=new learnApi();
        System.out.println(lea.toString());
    }
    /*
    * b. Objects is a tool class
        public static boolean equals(Object a, Object b)    比较两个对象的，底层会先进行非空判断，从而可以避免空指针异常。再进行equals比较
        * 可用于比较字符串的值是否相等
        public static boolean isNull(Object obj)            判断变量是否为null ,为null返回true
    */
    public void testObjectsTool()
    {
        String str1=new String("hello");
        String str2=new String("hello");
        System.out.println(Objects.equals(str1,str2));
    }
    /*
    * c.StringBuilder: StringBuilder是一个可变的字符串的操作类，我们可以把它看成是一个对象容器。操作字符串的性能比String要更高
     * c.1 method
     * 方法名称                                     说明
public StringBuilder append(任意类型)        添加数据并返回StringBuilder对象本身
public StringBuilder reverse()             将对象的内容反转
public int length()                        返回对象内容长度
public String toString()                   通过toString()就可以实现把StringBuilder转换为String
     *
     * */
    public void testStringBu(){
            StringBuilder strb=new StringBuilder("hello");
            strb.append(" world");
            String str1=strb.toString();
            System.out.println(str1);
    }
//    B. Data , SimpleDataFormat , Calendar ,new api for time from jdk8
    /*
    * a.Data
    * a.1 constructor
    public Date()              创建一个Date对象，代表的是系统当前此刻日期时间。
    public Date(long time)     把时间毫秒值转换成Date日期对象。
    *
    * */
    public void testData(){
        Date time1=new Date();
//        print: Wed Mar 01 10:01:29 CST 2023
        System.out.println(time1);
        Date time2=new Date(30000);
//        print: Thu Jan 01 08:00:30 CST 1970
        System.out.println(time2);
    }
    /*
    *b. SimpleDateFormat
    * b.1 constructor
            public SimpleDateFormat(String pattern)创建简单日期格式化对象，并封装格式化的形式信息
      b.2 method
        public final String format(Date date)   将日期格式化成日期/时间字符串
        public final String format(Object time) 将时间毫秒值式化成日期/时间字符串
        public Date parse(String source)        从给定字符串的开始解析文本以生成日期
    * * */
    public void testSimDatFormat() throws ParseException {
//        Data object to string (format)
        SimpleDateFormat sdf1=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date dat1=new Date();
        final String str_time=sdf1.format(dat1);
//        print 2023年03月01日 10:33:36
        System.out.println(str_time);

//        str_time to Data object (parse)
        String str_time2=("2023年12月3日 22:44:33");
        Date date2=sdf1.parse(str_time2);
        System.out.println(date2);
    }

    /*
    * c.Calendar
    *c.1 get Calendar
    public static Calendar getInstance()获取当前日历对象
     c.2 method
    public int get(int field)               取日期中的某个字段信息。
    public void set(int field,int value)    修改日历的某个字段信息。
    public void add(int field,int amount)   为某个字段增加/减少指定的值
    public final Date getTime()             拿到此刻日期对象。
    public long getTimeInMillis()           拿到此刻时间毫秒值

    * */

/*
* d.new api for time from jdk8
    d.1 content ：new class
    LocalDate：不包含具体时间的日期。
    LocalTime：不含日期的时间。
    LocalDateTime：包含了日期及时间。
    Instant：代表的是时间戳。Instant就是类似JDK8 以前的Date。
    DateTimeFormatter 用于做时间的格式化和解析的
    Duration:用于计算两个“时间”间隔
    Period:用于计算两个“日期”间隔
    d.2 create
     public static Xxxx now();      静态方法，根据当前时间创建对象     LocaDate localDate = LocalDate.now(); LocalTime localTime = LocalTime.now();
     public static Xxxx of(…);      静态方法，指定日期/时间创建对象    LocalDate localDate1 = LocalDate.of(2099 , 11,11); LocalTime localTime1 = LocalTime.of(11, 11, 11);
    d.3 method of LocalDate , LocalTime , LocalDateTime
        *这些方法返回的是一个新的实例引用，因为LocalDateTime 、LocalDate 、LocalTime 都是不可变的。
        plusDays, plusWeeks, plusMonths, plusYears          向当前 LocalDate 对象添加几天、 几周、几个月、几年
        minusDays, minusWeeks, minusMonths, minusYears      从当前 LocalDate 对象减去几天、 几周、几个月、几年
        withDayOfMonth, withDayOfYear, withMonth, withYear  将月份天数、年份天数、月份、年 份 修 改 为 指 定 的 值 并 返 回 新 的 LocalDate 对象
        isBefore, isAfter                                   比较两个 LocalDate

      *
* * */
//      d.4 DateTimeFormat 正反都能调用format方法。
    public void testDateTimeFormat(){
        LocalDateTime ldt=LocalDateTime.now();
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String timestr1=ldt.format(dtf);
        String time_str2=dtf.format(ldt);
    }
//    C.ChronoUnit 类可用于在单个时间单位内测量一段时间，这个工具类是最全的了，可以用于比较所有的时间单位
    public void testChronoUnit(){
        LocalDateTime birth=LocalDateTime.of(2000,3,11,10,54,55);
        LocalDateTime today=LocalDateTime.now();
        System.out.println("相差的年数：" + ChronoUnit.YEARS.between(birth, today));
        System.out.println("相差的月数：" + ChronoUnit.MONTHS.between(birth, today));
    }
    public static void main(String []args) throws ParseException {
        learnApi lea1=new learnApi();
        lea1.testChronoUnit();
    }
}
