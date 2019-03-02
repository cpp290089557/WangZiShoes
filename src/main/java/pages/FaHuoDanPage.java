package pages;

import org.openqa.selenium.By;

/**
 * Created by Administrator on 2019/2/22.
 */
public class FaHuoDanPage {

    //iframe  //*[@id="iframe"]
    public  static By iframe=By.id("iframe");
    // 新增页面iframe   //*[@id="layui-layer-iframe1"]
    public  static By iframeInsert1=By.xpath("/html/body/div[3]/div[1]/iframe");
    ////鞋码页面
    public  static By xmIframe=By.id("layui-layer-iframe2");
   public  static By xmiframe1=By.xpath("/html/body/div[2]/iframe");

//查询框
//    收货门店  //*[@id="SMARKET"]
public  static By sSHMD=By.xpath("//*[@id=\"search\"]/dl[1]/dd/input[2]");
    public  static By sSHMDvalue=By.xpath("//*[@id=\"search\"]/dl[1]/dd/input[1]");

    //    订单编号
public  static By sDDBH=By.id("SBILLNO");
//    状态
public  static By sSFLAG=By.id("SFLAG");
//    经营方式  //*[@id="SWMID"]
public  static By sJYFS=By.id("SWMID");
//    商品编码   //*[@id="SDGDID"]
public  static By sSPBM=By.id("SDGDID");
//    货号   //*[@id="SCCODE"]
public  static By sHH=By.id("SCCODE");
//    品牌
public  static By sPP=By.xpath("//*[@id=\"search\"]/dl[7]/dd/input[2]");
//    供应商
public  static By sGYS=By.xpath("//*[@id=\"search\"]/dl[8]/dd/input[2]");
//    录入时间  //*[@id="startdate"]  //*[@id="enddate"]
public  static By sSartdate=By.id("startdate");
    public  static By sEnddate=By.id("enddate");

//    查询
public  static By selectClick=By.xpath("/html/body/div/div/div[2]/div[1]/ul/li[1]/a/span");
//    修改
public  static By updateClick=By.xpath("/html/body/div/div/div[2]/div[1]/ul/li[2]/a/span");
//    新增
public  static By insertClick=By.xpath("/html/body/div/div/div[2]/div[1]/ul/li[3]/a/span");
//    删除
    public  static By delClick=By.xpath("/html/body/div/div/div[2]/div[1]/ul/li[4]/a/span");
//    审核
    public  static By shenheClick=By.xpath("/html/body/div/div/div[2]/div[1]/ul/li[5]/a/span");

//    编辑发货单
//电脑单号
public  static By dnbh=By.xpath("/html/body/div/div/div[2]/div[1]/div/dl[1]/dd/input");
//    状态
public  static By zt=By.xpath("/html/body/div/div/div[2]/div[1]/div/dl[2]/dd/input");
//    供应商
public  static By gys=By.xpath("/html/body/div/div/div[2]/div[1]/div/dl[3]/dd/input[2]");
    public  static By gysValue=By.xpath("/html/body/div/div/div[2]/div[1]/div/dl[3]/dd/input[1]");
//    经营方式
public  static By jyfs=By.id("SWMID");
//    买手
public  static By ms=By.xpath("/html/body/div/div/div[2]/div[1]/div/dl[5]/dd/input[2]");
    public  static By msValue=By.xpath("/html/body/div/div/div[2]/div[1]/div/dl[5]/dd/input[1]");
//    收货门店
public  static By shmd=By.xpath("/html/body/div/div/div[2]/div[1]/div/dl[6]/dd/input[2]");

    public  static By shmdValue=By.id("SSHMKT");  //*[@id="SSHMKT"]
//    售价合计
public  static By sjhjTotal=By.id("sumprice");
//    进价合计
public  static By jjTotal=By.id("SDTOPURPRICE1");
 //    数量  //*[@id="sumqty"]
 public  static By slTotal=By.id("sumqty");
    //    备注  2071622   宜昌飞美
public  static By bz=By.xpath("/html/body/div/div/div[2]/div[1]/div/dl[7]/dd/input");
//    商品编码
public  static By spbm=By.id("SDGDID1");
//加价
    public  static By jj=By.xpath("/html/body/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[7]/input");
    //售价
    public  static By sj=By.xpath("/html/body/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[8]/input[1]");
//    码号数量
public  static By mhslClick=By.xpath("/html/body/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[10]/a");
//    保存
public  static By saveClick=By.xpath("/html/body/div/div/div[2]/div[4]/a[1]");
    //新增页面关闭
    public  static By  insertClose=By.xpath("html/body/div/span/a");

    //列表第一行
    public  static By liebiao1=By.xpath("//*[@id=\"tabledate\"]/tbody/tr[1]/td[1]");
    //列表第一行选中
    public  static By liebiao1Selected=By.xpath("//*[@id=\"tabledate\"]/tbody/tr[1]/td[2]/input");
    //    列表单据编号
    public  static By lbDJBH=By.xpath("//*[@id=\"tabledate\"]/tbody/tr[1]/td[3]");
    //    审核确定  //*[@id="layui-layer3"]/div[3]/a[1]
    public  static By  shQD=By.xpath("html/body/div/div[3]/a[1]");
    // 列表表名
    public  static By  ddTable=By.id("tabledate");
    // 尾页    它随着页面变化的，所以直接用文本内容定位
    public  static By  wy=By.linkText("尾页");

}
