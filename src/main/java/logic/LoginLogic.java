package logic;

import findElements.WebElementUtils;
import log4j.LoggerControler;
import pages.LoginPage;

import java.sql.ResultSet;

/**
 * Created by Administrator on 2018/9/19.
 */
public class LoginLogic {
    final static LoggerControler logger = LoggerControler.getLogger(LoginLogic.class);
    //登录方法
    public static void  login(String email,String password) throws InterruptedException {

        logger.info("login()");
        //定位、输入用户名
        WebElementUtils.findElement(LoginPage.userName).sendKeys(email);
        logger.info("email:"+email);
        //定位、输入密码
        WebElementUtils.findElement(LoginPage.paw).sendKeys(password);
        logger.info("password:"+password);
        //点击登录
        Thread.sleep(6000);
        WebElementUtils.findElement(LoginPage.LoginBottom).click();
    }
}
