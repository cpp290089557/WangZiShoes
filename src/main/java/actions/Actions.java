package actions;

import drivers.SeleniumDriver;
import findElements.WebElementUtils;
import log4j.LoggerControler;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/9/10.
 */
public class Actions  extends SeleniumDriver{
    final static LoggerControler log = LoggerControler.getLogger(Actions.class);
    //打开地址
    public  static  void openUrl(String url)
    {
       driver.get(url);
        log.info("打开网址"+url);
    }
    //点击方法
    public  static  void click(By by)
    {
        WebElementUtils.findElement(by).click();
        log.info("点击按钮"+by);
    }
    //文本输入方法
    public  static  void sendTest(By by,String test)
    {

       WebElement element= WebElementUtils.findElement(by);

        if (element.isDisplayed()) {//若元素disabled=true，则需要去掉此属性，否则会提示无效的元素（org.openqa.selenium.InvalidElementStateException: invalid element state:）
            RemoveAttribute(element, driver, "disabled");
        }
        element.clear();//先清空后输入
        element.sendKeys(test);
    }
    //返回文本
    public  static  String getTest(By by)
    {
        String test= WebElementUtils.findElement(by).getText();
        log.info("返回内容"+test);
       return  test;

    }
    //获取多个文本值
    public  static ArrayList getTests(By by)
    {
        ArrayList  arrayList=new ArrayList();
        List<WebElement> list= WebElementUtils.findElements(by);
        for (int i=0;i<list.size();i++ )
        {
            String  test=list.get(i).getText();
            arrayList.add(test);
        }
        log.info("获取多个文本值"+arrayList);
        return  arrayList;
    }
    //设置页面属性值
    public static void setAttribute(WebElement e, WebDriver driver,String attributeName, String value) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // 执行JavaScriptdiamante修改页面元素属性。arguments[0]-[2]后面会用e,attributeName,value替换并执行
        js.executeScript("arguments[0].setAttribute(arguments[1],arguments[2])", e, attributeName, value);
    }
    //清除页面属性
    public  static void RemoveAttribute(WebElement e, WebDriver d, String attributeName) {
        JavascriptExecutor js = (JavascriptExecutor) d;
        // 执行JavaScriptdiamante修改页面元素属性。arguments[0]-[2]后面会用e,attributeName,value替换并执行
        js.executeScript("arguments[0].removeAttribute(arguments[1])", e, attributeName);

    }

    //双击
    public   static   void  doubleClick(By by)
    {
        org.openqa.selenium.interactions.Actions  actions=new org.openqa.selenium.interactions.Actions(driver);
        WebElement webElement=WebElementUtils.findElement(by);
        actions.doubleClick(webElement).perform();
        log.info("双击按钮"+by);
    }



}
