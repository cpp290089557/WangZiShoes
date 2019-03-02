package pages;

import org.openqa.selenium.By;

/**
 * Created by Administrator on 2019/1/16.
 */
public class MenuPage {
//   单据管理
public  static By djgl=By.xpath("html/body/aside/div/dl/dt");
//    订单
public  static By dd=By.xpath("html/body/aside/div/dl/dd/ul/li[1]/a");
//    商品录入单
    public  static By lud=By.xpath("html/body/aside/div/dl/dd/ul/li[2]/a");
//    发货单
    public  static By fhd=By.xpath("html/body/aside/div/dl/dd/ul/li[3]/a");
//    补货单
    public  static By bhd=By.xpath("html/body/aside/div/dl/dd/ul/li[4]/a");
//    退厂单
    public  static By tcd=By.xpath("html/body/aside/div/dl/dd/ul/li[5]/a");
//    订单到货
    public  static By dddh=By.xpath("html/body/aside/div/dl/dd/ul/li[6]/a");
//    订单发货
    public  static By ddfh=By.xpath("html/body/aside/div/dl/dd/ul/li[7]/a");
//    条码打印
    public  static By tmdy=By.xpath("html/body/aside/div/dl/dd/ul/li[8]/a");
//    进价调整单
    public  static By jjtzd=By.xpath("html/body/aside/div/dl/dd/ul/li[9]/a");
//    补货发货单
    public  static By bhfhd=By.xpath("html/body/aside/div/dl/dd/ul/li[10]/a");
//    转代销单
    public  static By zdxd=By.xpath("html/body/aside/div/dl/dd/ul/li[11]/a");
//    验收单（门店）
    public  static By ysd=By.xpath("html/body/aside/div/dl/dd/ul/li[12]/a");
//    商品录入单（代销）
    public  static By splrd=By.xpath("html/body/aside/div/dl/dd/ul/li[13]/a");
//    买手修改单
    public  static By msxgd=By.xpath("html/body/aside/div/dl/dd/ul/li[14]/a");

    //  分店
//   验收单
    public  static By ysdMD  =By.xpath("/html/body/aside/div/dl/dd/ul/li[6]");
}
