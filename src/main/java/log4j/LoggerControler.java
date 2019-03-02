package log4j;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.io.*;
import java.util.Properties;

/**
 * Created by Administrator on 2018/9/11.
 */
public class LoggerControler {
    private static org.apache.log4j.Logger logger=null;
    private static LoggerControler loggCon=null;
    public static LoggerControler getLogger(Class<?> T) {
        if(logger==null){
            Properties props=new Properties();   //实例化一个Properties类，处理log4j.Properties文件
            String proPath=System.getProperty("user.dir")+ "/configs/log4j.properties";
            InputStream inputStream= null;
            try {
                inputStream = new FileInputStream(proPath);
                props.load(inputStream);
                //log4j的PropertyConfigurator类的configure方法输入数据流

            } catch (IOException e) {
                e.printStackTrace();
            }
            PropertyConfigurator.configure(props);
            // logger= Logger.getLogger(T);
            logger= Logger.getLogger(T);
            loggCon=new LoggerControler();
        }
        return loggCon;
    }
    //重写logger方法

    public static void info(String msg){
        logger.info(msg);
    }
    public static void debug(String msg) {
        logger.debug(msg);
    }
    public static void warning(String msg) {
        logger.warn(msg);
    }
    public static void fatal(String msg) {
        logger.fatal(msg);
    }
    public static void error(String msg) {
        logger.error(msg);
    }

}
