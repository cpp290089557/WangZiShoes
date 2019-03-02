package actions;

import drivers.SeleniumDriver;
import log4j.LoggerControler;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;
import tools.DateFormat;
import tools.MyFile;
import java.io.File;
import java.io.IOException;


/**
 * Created by lenovo on 2016/11/12.必须要继承SeleniumDrivers , extends SeleniumDrivers
 */
public class ScreenShot extends SeleniumDriver {
    final static LoggerControler log = LoggerControler.getLogger(ScreenShot.class);
    static String path = System.getProperties().getProperty("user.dir") + "/error/";
    /**
     * 错误截图，通过日期命名的截图
     **/
    public static void screenShots() {
        log.info("进入screenShots方法");
        WebDriver augmentedDriver = new Augmenter().augment(driver);
        File file = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE);
        //根据日期创建文件夹，CHECK_LOG_FORMAT = "yyyyMMdd";REPORT_CSV_FORMAT = "yyyyMMdd_HHmmss";
        MyFile myFile=new MyFile();
        log.info("进入screenShots方法file:"+file);
        log.info("进入screenShots方法Path:"+path);
        //String myPath=path+String.valueOf(DateFormat.dateFormat("CHECK_LOG_FORMAT"));
       // DateFormat.dateFormat(DateFormat.ZH_DATE_FORMAT);
       String myPath=path+String.valueOf( DateFormat.dateFormat(DateFormat.CHECK_LOG_FORMAT));
        log.info("进入screenShots方法myPath:"+myPath);
        System.out.print(myPath);
        myFile.creatFile(myPath);
        try {
            //FileUtils.copyFile(file,new File("D:\\testing\\webdriver_demo\\aa.jpg"));
            //FileUtils.copyFile(file,new File("D:\\testing\\webdriver_demo\\"+DateFormat.format(DateFormat.CHECK_LOG_FORMAT)+".jpg"));
            String times= String.valueOf(DateFormat.dateFormat(DateFormat.REPORT_CSV_FORMAT));
            FileUtils.copyFile(file,new File(myPath + "/" +times+".jpg"));
            // FileUtils.copyFile(file,new File(myPath + "/" + DateFormat.format(DateFormat.REPORT_CSV_FORMAT) + ".png"));
            log.info("进入screenShots方法1截图成功");
        } catch (IOException e) {
            log.info("进入screenShots方法1截图失败");
            e.printStackTrace();
        }
    }
    /**
     * 错误截图,通过传入name来给截图命名
     **/
    public static void screenShots1(String name) {
        WebDriver augmentedDriver = new Augmenter().augment(driver);
        File file = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE);
        try {
            MyFile myFile = new MyFile();
            myFile.creatFile(path + DateFormat.dateFormat(DateFormat.CHECK_LOG_FORMAT));
            log.info(DateFormat.dateFormat(DateFormat.ZH_DATE_FORMAT));
            FileUtils.copyFile(file,new File(path + DateFormat.dateFormat(DateFormat.CHECK_LOG_FORMAT) + "/" + name + ".jpg"));
        } catch (IOException e) {
            log.info("截图失败！！");
            e.printStackTrace();
        }
    }

    /**
     * 判断文件夹，没有就新建
     */
/*    public static void fileExists() {
        String fileName = DateUtil.format(DateUtil.CHECK_LOG_FORMAT);
        File file = new File(path + fileName);
        if (!file.exists()) {
            file.mkdirs();
        }
    }*/
}

