package findElements;


import drivers.SeleniumDriver;
import log4j.LoggerControler;
import org.apache.xpath.operations.String;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * Created by Administrator on 2018/9/10.
 */
public class WebElementUtils extends SeleniumDriver {//继承父类，可以直接使用driver
    final static LoggerControler log = LoggerControler.getLogger(WebElementUtils.class);
    public   static  WebElement  findElement (final By by)
    {
        WebElement element=null;
        try {
            WebDriverWait  wait=new WebDriverWait(driver,20);
            //定位元素获取内容
            wait.until(ExpectedConditions.presenceOfElementLocated(by));
        }catch (Exception e)
        {
            //System.out.println("元素"+by+"查找超时");
            log.info("元素"+by+"查找超时");
            e.printStackTrace();
        }


        return driver.findElement(by);
    }
    //处理有规律变化id（只有几个）的定位,不建议使用这个方法，最好用绝对路径定位的方式
    public   static  WebElement  findElementEqual (final By by1,final By by2,final By by3,final By by4)
    {
        By by=null;
        WebElement element=null;

            try {
                WebDriverWait  wait=new WebDriverWait(driver,10);
                //定位元素获取内容
                wait.until(ExpectedConditions.presenceOfElementLocated(by1));
                by=by1;
            }catch (Exception e)
            {
                try {
                    WebDriverWait  wait=new WebDriverWait(driver,10);
                    //定位元素获取内容
                    wait.until(ExpectedConditions.presenceOfElementLocated(by2));
                    by=by2;
                }catch (Exception e1)
                {
                    try {
                        WebDriverWait  wait=new WebDriverWait(driver,10);
                        //定位元素获取内容
                        wait.until(ExpectedConditions.presenceOfElementLocated(by3));
                        by=by3;
                    }catch (Exception e2)
                    {
                        try {
                            WebDriverWait  wait=new WebDriverWait(driver,10);
                            //定位元素获取内容
                            wait.until(ExpectedConditions.presenceOfElementLocated(by4));
                            by=by4;
                        }catch (Exception e3)
                        {
                            //System.out.println("元素"+by+"查找超时");
                            log.info("元素"+by4+"查找超时");
                            e3.printStackTrace();
                        }
                    }
                }
            }



        return driver.findElement(by);
    }
    //处理有规律变化id（只有几个）的定位,返回By，可用于点击方法，不建议使用这个方法，最好用绝对路径定位的方式
    public   static  By  findByEqual (final By by1,final By by2,final By by3)
    {
        By by=null;
        WebElement element=null;

        try {
            WebDriverWait  wait=new WebDriverWait(driver,10);
            //定位元素获取内容
            wait.until(ExpectedConditions.presenceOfElementLocated(by1));
            by=by1;
        }catch (Exception e)
        {
            try {
                WebDriverWait  wait=new WebDriverWait(driver,10);
                //定位元素获取内容
                wait.until(ExpectedConditions.presenceOfElementLocated(by2));
                by=by2;
            }catch (Exception e1)
            {
                try {
                    WebDriverWait  wait=new WebDriverWait(driver,10);
                    //定位元素获取内容
                    wait.until(ExpectedConditions.presenceOfElementLocated(by3));
                    by=by3;
                }catch (Exception e2)
                {
                    //System.out.println("元素"+by+"查找超时");
                    log.info("元素"+by3+"查找超时");
                    e2.printStackTrace();
                }
            }
        }



        return by;
    }
    public   static List<WebElement> findElements (final By by)
    {
        WebElement element=null;
        try {
            WebDriverWait  wait=new WebDriverWait(driver,30);
            //定位元素获取内容
            wait.until(ExpectedConditions.presenceOfElementLocated(by));
        }catch (Exception e)
        {
            System.out.println("元素"+by+"查找超时");
            e.printStackTrace();
        }


        return driver.findElements(by);
    }
}
