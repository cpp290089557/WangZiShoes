package actions;

import DbConnect.OracleConnection;
import Information.FaHuoDanInfo;
import Information.YanShouDanInfo;
import drivers.SeleniumDriver;
import findElements.WebElementUtils;
import log4j.LoggerControler;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.YanShouDanPage;

import static drivers.SeleniumDriver.driver;

/**
 * Created by Administrator on 2019/3/2.
 */
public class YanShouDanAction {
    final static LoggerControler logger = LoggerControler.getLogger(FaHuoDanInfo.class);
    public static  void  updateYanShouDan()
    {
        int insertORupdate=0;
        OracleConnection oracleConnection;
        String sid = "";
        //   将控制权转交给iframe
        WebElement webElement1 = WebElementUtils.findElement(YanShouDanPage.iframe);
        driver.switchTo().frame(webElement1);

        Actions.click(YanShouDanPage.selectClick);
        logger.info("选中：" + WebElementUtils.findElement(YanShouDanPage.liebiao1).getText());
        if (WebElementUtils.findElement(YanShouDanPage.liebiao1).getText().equals("1")) {
            logger.info("选中");
            Actions.click(YanShouDanPage.liebiao1Selected);
        }
        Actions.click(YanShouDanPage.updateClick);
        //控制权转交给弹出页面的iframe
        WebElement webElement2 = WebElementUtils.findElement(YanShouDanPage.iframeInsert1);
        driver.switchTo().frame(webElement2);

        //输入收货柜组
        Actions.sendTest(YanShouDanPage.shgz, YanShouDanInfo.shgz);
        WebElement webElement = WebElementUtils.findElement(YanShouDanPage.shgzValue);
        Actions.setAttribute(webElement, driver, "value", YanShouDanInfo.shgzValue);
        Actions.click(YanShouDanPage.savaClick);

        SeleniumDriver.driver.switchTo().parentFrame();
        Actions.click(YanShouDanPage.insertClose);
        SeleniumDriver.driver.switchTo().defaultContent();
    }
    public  static  void  shenHeYanShouDan() throws InterruptedException {
        OracleConnection oracleConnection;
        String sid = "";
        //   将控制权转交给iframe
        WebElement webElement1 = WebElementUtils.findElement(YanShouDanPage.iframe);
        driver.switchTo().frame(webElement1);

        Actions.click(YanShouDanPage.selectClick);
        logger.info("选中：" + WebElementUtils.findElement(YanShouDanPage.liebiao1).getText());
        if (WebElementUtils.findElement(YanShouDanPage.liebiao1).getText().equals("1")) {
            Thread.sleep(3000);
            logger.info("选中");
            Actions.click(YanShouDanPage.liebiao1Selected);
        }
        Actions.click(YanShouDanPage.shenheClick);
        WebElement webElement = WebElementUtils.findElement(YanShouDanPage.shQD);
        webElement.click();
        String  textYZ= WebElementUtils.findElement(YanShouDanPage.textYZ).getText();
        logger.info(textYZ);
//  Assert.assertEquals(textYZ,"操作成功","门店审核验收单失败!");
        SeleniumDriver.driver.switchTo().defaultContent();
    }
}
