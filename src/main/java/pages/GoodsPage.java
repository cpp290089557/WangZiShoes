package pages;

import org.openqa.selenium.By;

/**
 * Created by Administrator on 2019/2/19.
 */
public class GoodsPage {
    //iframe  //*[@id="iframe"]
    public  static By iframe=By.id("iframe");
// 新增页面iframe   //*[@id="layui-layer-iframe1"]
public  static By iframeInsert=By.id("layui-layer-iframe1");



    //查询框
//    订单编号
    public  static By sSBILLNO=By.id("SBILLNO");
//    状态查询
public  static By sSFLAG=By.id("SFLAG");
//    商品编码
public  static By sSDGDID=By.id("SDGDID");
//    货号
public  static By sSCCODE=By.id("SCCODE");
//    品牌
public  static By sPP=By.xpath("//*[@id=\"search\"]/dl[5]/dd/input[2]");
//    供应商
public  static By sGYS=By.xpath("//*[@id=\"search\"]/dl[6]/dd/input[2]");
//    录入时间  //*[@id="startdate"]  //*[@id="enddate"]
public  static By sStartdate=By.id("startdate");
    public  static By sEnddate=By.id("enddate");


//    列表单据编号
public  static By lbDJBH=By.xpath("//*[@id=\"tabledate\"]/tbody/tr[1]/td[3]");
//  查询
public  static By selectClick=By.xpath("/html/body/div/div/div[2]/div[1]/ul/li[1]/a/span");
    //  编辑
    public  static By updateClick=By.xpath("/html/body/div/div/div[2]/div[1]/ul/li[2]/a/span");
    //  新增
    public  static By insertClick=By.xpath("/html/body/div/div/div[2]/div[1]/ul/li[3]/a/span");
//    审核
public  static By checkClick=By.xpath("/html/body/div/div/div[2]/div[1]/ul/li[4]/a/span");
//    审核确定
    public  static By  shQD=By.xpath("html/body/div/div[3]/a[1]");
//    导出
public  static By importClick=By.xpath("/html/body/div/div/div[2]/div[1]/ul/li[6]/a/span");

    //列表第一行
    public  static By liebiao1=By.xpath("//*[@id=\"tabledate\"]/tbody/tr[1]/td[1]");
    //列表第一行选中
    public  static By liebiao1Selected=By.xpath("//*[@id=\"tabledate\"]/tbody/tr[1]/td[2]/input");

// 商品录入单页面
    //行号
public  static By hh=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[1]/input");
//   商品编码
public  static By spbm=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[2]/input");
// 供应商
public  static By GYSValue=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[3]/input[1]");
public  static By GYS=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[3]/input[2]");
//    经营方式
public  static By jyfs=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[4]/select");
//    鞋码
public  static By xiema=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[5]/select");
//出厂价
public  static By ccj=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[6]/input");
//    包装费
public  static By bzf=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[7]/input");
//    进价
public  static By jj=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[8]/input");
//    批发售价
public  static By pfsj=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[9]/input");
//    区域
public  static By qy=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[10]/select");
//    产地
public  static By cd=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[11]/select");
// 季节
public  static By jjie=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[12]/select");
//    品牌
public  static By pp=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[13]/input[2]");
    public  static By ppValue=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[13]/input[1]");
//    公司货号
public  static By gshh=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[14]/input");
//    厂商货号
public  static By cshh=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[15]/input");
//    颜色
public  static By ys=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[16]/input[2]");
    public  static By ysValue=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[16]/input[1]");
//    品名
public  static By pm=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[17]/input");
//    性别
public  static By xb=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[18]/select");
//    系列
public  static By xl=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[19]/input[2]");
    public  static By xlValue=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[19]/input[1]");
//    鞋口
public  static By xk=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[20]/input[2]");
    public  static By xkValue=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[20]/input[1]");
//    面料
public  static By ml=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[21]/select");
//    跟形
public  static By gx=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[22]/select");
//    跟高
public  static By gg=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[23]/select");
//  底型
public  static By dx=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[24]/select");
//    帮高
public  static By bg=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[25]/select");
//    内里
public  static By nl=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[26]/input[2]");
    public  static By nlValue=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[26]/input[1]");
//    激光
public  static By jg=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[27]/select");
//    毛口
public  static By mk=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[28]/select");
//    亮钻
public  static By lz=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[29]/select");
//    饰扣
public  static By sk=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[30]/select");
//    内里材质
public  static By nlcz=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[31]/select");
//    垫脚材质
public  static By djcz=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[32]/select");
//    拉链
public  static By ll=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[33]/select");
//    系带
public  static By jd=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[34]/select");
//    生命周期
public  static By smzq=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[35]/input");
//    退货周期
public  static By thzq=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[36]/input");
//    年份
public  static By nf=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[37]/input");

//   保存
public  static By savaClick=By.xpath("/html/body/form/div/div/div[2]/div[3]/a[1]");

//新增页面关闭
public  static By  insertClose=By.xpath("html/body/div/span/a");
//    新增页面，电脑单号
public  static By insertDNDH=By.xpath("/html/body/form/div/div/div[2]/div[1]/div/dl[1]/dd/input");


    // 列表表名
    public  static By  ddTable=By.id("tabledate");
    // 尾页    它随着页面变化的，所以直接用文本内容定位
    public  static By  wy=By.linkText("尾页");
//    添加+
public  static By  tianjia0=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/div[1]");


    //  点击按钮后弹出内容提示
    public  static By textYZ=By.xpath("/html/body/div[2]/div");
}
