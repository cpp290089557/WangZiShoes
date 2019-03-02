package Information;

import DbConnect.OracleConnection;
import actions.Actions;
import drivers.SeleniumDriver;
import logic.LoginLogic;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.HomePage;
import pages.MenuPage;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import static drivers.SeleniumDriver.driver;

/**
 * Created by Administrator on 2019/2/14.
 */
public class LoginUserInfo {
    public static String username="000010";
    public static String password="123456";
    public static String Url="http://192.168.0.113/Login/Index";
    public static String usernameMD="020001";
    public static String passwordMD="123456";
    public static  String UrlMD="http://192.168.0.113:81/Login/Index";  //查沙市门店登录用户   select snum from SYSUSER where smarket='0002'
    public  static  String  loginUserInfo(String username) throws SQLException, IOException, ClassNotFoundException {
        String sid="";
        OracleConnection oracleConnection = new OracleConnection();
        ResultSet rsSid= oracleConnection.querySql("select sid from SYSUSER where SNUM='"+username+"'");
        while (rsSid.next())
        {
            sid = rsSid.getString("sid");
        }
        oracleConnection.close();
        return sid;
    }
// hORb   0:为总店   1为分店
    public  static  void  login(int hORb) throws InterruptedException {
        SeleniumDriver.open("chrome");
        if (hORb == 0) {
            Actions.openUrl(LoginUserInfo.Url);
            LoginLogic.login(LoginUserInfo.username,LoginUserInfo.password);
        }
        else
            {
                Actions.openUrl(LoginUserInfo.UrlMD);
                LoginLogic.login(LoginUserInfo.usernameMD,LoginUserInfo.passwordMD);
        }

        Thread.sleep(3000);
        Assert.assertNotEquals(SeleniumDriver.driver.getTitle(),"王子鞋城-登录","登录失败");
    }
    //    点击单据单据，点击单据管理，点击订单
    public static void clickDjTest(By by) throws InterruptedException {
        Actions.click(HomePage.dj);
        Actions.click(MenuPage.djgl);
        Actions.click(by);
        //窗口最大化
        driver.manage().window().maximize();

    }
}
