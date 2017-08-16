import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import  java.time.LocalDateTime;

public class test {
    /* 静态变量 */
    //public static String staticField = "静态变量";
    /* 变量 */
    public String field = "变量";
    /* 静态初始化块 */
    static {
        //System.out.println( staticField );
        System.out.println( "静态初始化块" );
    }
    public static String staticField = "静态变量";
    /* 初始化块 */
    {
        System.out.println(staticField);
        System.out.println( field );
        System.out.println( "初始化块" );
    }
    /* 构造器 */
    public test()
    {
        System.out.println( "构造器" );
    }


    public static void main(String[] args) {
        String s1 = "Programming";
        String s2 = new String("Programming");
        String s3 = "Program";
        String s4 = "ming";
        String s5 = "Program" + "ming";

        String s6 = s3 + s4;
        System.out.println(s1 == s2);
        System.out.println(s1 == s5);
        System.out.println(s1 == s6);
        System.out.println(Integer.parseInt("5"));
        System.out.println(s1 == s6.intern());
        System.out.println(s2 == s2.intern());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("jiangweiwei");
        stringBuilder.reverse();
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt.getYear());
        System.out.println(dt.getMonthValue());     // 1 - 12
        System.out.println(dt.getDayOfMonth());
        System.out.println(dt.getHour());
        System.out.println(dt.getMinute());
        System.out.println(dt.getSecond());
        System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        s1.compareTo("a");
    }
}