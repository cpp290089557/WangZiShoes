package tools;

import log4j.LoggerControler;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2018/9/12.
 */
public class DateFormat {
    final static LoggerControler log = LoggerControler.getLogger(DateFormat.class);
    public  static  final  String CHECK_LOG_FORMAT="yyyyMMdd";
    public  static  final  String TEN_PAY_DATE_STRING_FORMAT="yyMMdd";
    public  static  final String REPORT_CSV_FORMAT="yyyyMMdd_HHmmss";
    public  static  final String ZH_DATE_FORMAT="yyyy年MM月dd日 HH:mm:ss";
    public  static  final String DEFAULT_DATE_FORMAT="yyyy-MM-dd HH:mm:ss";
    public  static  final String DEFAULT_DATE_FORMAT1="yyyy/MM/dd HH:mm:ss";
    public  static  final String DATE_FORMAT="yyyy-MM-dd HH-mm-ss";
    //引入类处理时间
    public static SimpleDateFormat simpleDateFormat;
    public  static  String dateFormat(String type)
    {log.info("进入dateFormat方法"+type);
        simpleDateFormat=new SimpleDateFormat(type);
        log.info("进入dateFormat方法:"+simpleDateFormat);
        String s=simpleDateFormat.format(new Date());
        log.info("进入dateFormat方法s:"+s);
        log.info(s);
        return  s;
    }
public static long currentTimeMillis()
{
    long t=System.currentTimeMillis();
    log.info("当前时间秒："+String.valueOf(t));
    return  t;
}

}
