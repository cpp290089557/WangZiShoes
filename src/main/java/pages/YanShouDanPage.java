package pages;

import org.openqa.selenium.By;

/**
 * Created by Administrator on 2019/3/1.
 */
public class YanShouDanPage {
    //iframe  //*[@id="iframe"]
    public  static By iframe=By.id("iframe");
    // 新增页面iframe   //*[@id="layui-layer-iframe1"]
    public  static By iframeInsert1=By.xpath("/html/body/div[3]/div[1]/iframe");
    //    查询
    public  static By selectClick=By.xpath("/html/body/div/div/div[2]/div[1]/ul/li[1]/a/span");
    //    审核
    public  static By shenheClick=By.xpath("/html/body/div/div/div[2]/div[1]/ul/li[4]/a/i");
    //    审核确定
    public  static By  shQD=By.xpath("html/body/div/div[3]/a[1]");
    public  static By  shQX=By.xpath("html/body/div/div[3]/a[2]");
//    编辑
public  static By updateClick=By.xpath("/html/body/div/div/div[2]/div[1]/ul/li[2]/a/span");
    //列表第一行
    public  static By liebiao1=By.xpath("//*[@id=\"tabledate\"]/tbody/tr[1]/td[1]");
    //列表第一行选中
    public  static By liebiao1Selected=By.xpath("//*[@id=\"tabledate\"]/tbody/tr[1]/td[2]/input");


//收货柜组
    public  static By shgz=By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/table/tbody/tr[2]/td[13]/input[2]");
    public  static By shgzValue=By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/table/tbody/tr[2]/td[13]/input[1]");
    //新增页面关闭
    public  static By  insertClose=By.xpath("html/body/div/span/a");
//    保存
public  static By savaClick=By.xpath("/html/body/div[2]/div/div[4]/a[1]");

//  点击按钮后弹出内容提示
public  static By textYZ=By.xpath("/html/body/div[2]/div");
}
