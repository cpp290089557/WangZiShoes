package Branches;

import DbConnect.OracleConnection;
import Information.FaHuoDanInfo;
import Information.LoginUserInfo;
import Headquarters.DdTest;
import Information.YanShouDanInfo;
import actions.Actions;
import actions.YanShouDanAction;
import drivers.SeleniumDriver;
import findElements.WebElementUtils;
import log4j.LoggerControler;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.FaHuoDanPage;
import pages.MenuPage;
import pages.YanShouDanPage;

import java.sql.SQLException;

import static drivers.SeleniumDriver.driver;

/**
 * Created by Administrator on 2019/3/1.
 */
public class YanShouDanTest {
    final static LoggerControler logger = LoggerControler.getLogger(YanShouDanTest.class);
    OracleConnection oracleConnection;
    String sid = "";

    //    登录
    @BeforeTest
    public void loginTest() throws InterruptedException {
        LoginUserInfo.login(1);
        LoginUserInfo.clickDjTest(MenuPage.ysdMD);

    }
//   编辑
    @Test
    public void updateYaShouDanTest()
    {
        YanShouDanAction.updateYanShouDan();
    }
    @Test
    public void shenHeYaShouDanTest() throws InterruptedException {
        YanShouDanAction.shenHeYanShouDan();
    }
    @AfterTest
    public   void quitTest() throws InterruptedException, SQLException {
        //浏览器关闭
       // SeleniumDriver.closedAll();
    }
}
