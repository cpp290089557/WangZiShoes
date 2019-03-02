package pages;

import findElements.WebElementUtils;
import org.openqa.selenium.By;

/**
 * Created by Administrator on 2018/9/19.
 */
public class LoginPage {
    //王子鞋城登录页面
    public  static By userName=By.id("text_username");
    public static  By paw=By.id("text_pass");
    public static  By LoginBottom=By.xpath(".//*[@id='btn_login']");

}
