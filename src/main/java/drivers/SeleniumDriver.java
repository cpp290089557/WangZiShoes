package drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.HashMap;

/**
 * Created by Administrator on 2018/9/8.
 */
public class SeleniumDriver {
    public   static WebDriver driver;
    public   static  WebDriver open(String  brower)
    {
  String path=System.getProperty("user.dir");//返回工程路径
    DesiredCapabilities caps = setDownloadsPath();//更改默认下载路
 if(brower.equals("chrome"))
 {
     System.setProperty("webdriver.chrome.driver",path+"/drivers/chromedriver.exe");
     driver=new ChromeDriver(caps);
 }
 else if(brower.equals("ie")){
    System.setProperty("webdriver.ie.driver",path+"/drivers/IEDriverServer.exe");
     driver=new InternetExplorerDriver(caps);
 }else if(brower.equals("firefox"))
 {
     driver=new FirefoxDriver(caps);
 }
 else{
     System.err.println("传入的浏览器名称有误"+brower);
 }

 return  driver;
    }
    public  static  void  closedAll()
    {
        driver.quit();
    }
    public  static  void  closed()
    {
        driver.close();
    }
    //单独重构成一个方法，然后调用
    public static DesiredCapabilities setDownloadsPath() {
        String downloadsPath = "D:\\selenium\\Downloads";
        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        chromePrefs.put("download.default_directory", downloadsPath);
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", chromePrefs);
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(ChromeOptions.CAPABILITY, options);
        return caps;
    }
}
