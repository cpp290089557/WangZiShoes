package pages;

import org.openqa.selenium.By;

/**
 * Created by Administrator on 2019/1/16.
 */
public class DdPage {
 //iframe  名称
 public  static By iframe=By.xpath(".//*[@id='iframe']");
 //新增页面的iframe   layui-layer-iframe1
 public  static By iframeInsert1=By.xpath("/html/body/div[3]/div[1]/iframe");
    public  static By xmIframe=By.xpath("/html/body/div[2]/iframe");
    //导出按钮
    public  static By daochu=By.xpath("/html/body/div/div/div[2]/div[1]/ul/li[6]/a/i");
 //    查询条件
 public  static By selectClick=By.xpath("/html/body/div/div/div[2]/div[1]/ul/li[1]/a/span");
//单据编号
public  static By sSBILLNO=By.id("SBILLNO");
// 审核   //*[@id="SFLAG"]
public  static By sSFLAG=By.id("SFLAG");
// 品牌   //*[@id="search"]/dl[5]/dd/input[2]
public  static By sPP=By.xpath("//*[@id=\"search\"]/dl[5]/dd/input[2]");
//    商品编码 //*[@id="SDGDID"]
public  static By sSDGDID=By.id("SDGDID");
//    货号 //*[@id="SCCODE"]
public  static By sSCCODE=By.id("SCCODE");
//  供应商
public  static By sGYS=By.xpath("//*[@id=\"search\"]/dl[6]/dd/input[2]");
//    录入日期
public  static By sstartdate=By.id("startdate");
    public  static By senddate=By.id("enddate");

//列表第一行
public  static By liebiao1=By.xpath("//*[@id=\"tabledate\"]/tbody/tr[1]/td[1]");
 //列表第一行选中
 public  static By liebiao1Selected=By.xpath("//*[@id=\"tabledate\"]/tbody/tr[1]/td[2]/input");
//列表单据编号
public  static By liebiaoDJBH=By.xpath("//*[@id=\"tabledate\"]/tbody/tr[1]/td[3]");

//主页面 审核
public  static By shHome=By.xpath("/html/body/div/div/div[2]/div[1]/ul/li[4]/a/span");
//  订单编号
public  static By djbhSelect=By.xpath(".//*[@id='SBILLNO']");
//    状态  .//*[@id='SFLAG']
public  static By stateSelect=By.xpath(".//*[@id='SFLAG']");
//商品编码
public  static By spbmSelect=By.xpath(".//*[@id='SDGDID']");
//    货号
public  static By hhSelect=By.xpath(".//*[@id='SCCODE']");
//    品牌
public  static By ppSelect=By.xpath(".//*[@id='search']/dl[5]/dd/input[2]");
//    供应商
public  static By gysSelect=By.xpath(".//*[@id='search']/dl[6]/dd/input[2]");
//    录入时间
public  static By lrtime1Select=By.xpath(".//*[@id='startdate']");
 public  static By lrtime2Select=By.xpath(".//*[@id='enddate']");

// html/body/div[1]/div/div[2]/div[1]/ul/li[3]/a/span
public  static By xzClick=By.xpath("html/body/div[1]/div/div[2]/div[1]/ul/li[3]/a/span");
//    编辑订单页面字段
//    电脑单号
public  static By dndh=By.xpath("html/body/form/div/div/div[2]/div[1]/div/dl[1]/dd/input");
//    状态
public  static By zt=By.xpath("html/body/form/div/div/div[2]/div[1]/div/dl[2]");
//    门店
 public  static By mdValue=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[2]/input[1]");
      public  static By md=By.xpath("html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[2]/input[2]");
//    商品编码
public  static By spbm=By.xpath(".//*[@id='SDGDID1']");
//    供应商
public  static By gys0=By.xpath("html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[4]");
//    经营方式
public  static By jyfs=By.xpath("html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[5]");
//    买手
public  static By ms=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[6]/input[1]");

//    进价
public  static By jj0=By.xpath("html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[7]");
//    售价
public  static By sj=By.xpath("html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[8]");
//    尺码
public  static By cm=By.xpath("html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[9]");
//    码号数量
public  static By mhnum=By.xpath("html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[10]/a");
//    数量合计
public  static By slTotal=By.xpath(".//*[@id='SDTOQTY1']");
//    进价合计
public  static By jjTotal=By.xpath(".//*[@id='SDTOPURPRICE1']");
//    售价合计
public  static By sjTotal=By.xpath(".//*[@id='SDTOPRICE1']");
//    区域
public  static By qy=By.xpath("html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[14]");
//    产地
public  static By cd=By.xpath("html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[15]");
//    季节
public  static By jj=By.xpath("html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[16]");
//    品牌
public  static By pp=By.xpath("html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[17]");
//    公司货号
public  static By sshh=By.xpath("html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[18]");
//    厂商货号
public  static By cshh=By.xpath("html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[19]");
//    颜色
public  static By color=By.xpath("html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[20]");
//    品名
public  static By pm=By.xpath("html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[21]");
//    性别
public  static By sex=By.xpath("html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[22]");
//    系列
public  static By xl=By.xpath("html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[23]");
//    跟型
public  static By gx=By.xpath("html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[24]");
//    跟高
public  static By gg=By.xpath("html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[25]");
//    底型
public  static By dx=By.xpath("html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[26]");
//    鞋口
public  static By xk=By.xpath("html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[27]");
//    帮高
public  static By bg=By.xpath("html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[28]");
//    面料
public  static By ml=By.xpath("html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[29]");
//    内里
public  static By nl=By.xpath("html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[30]");
//    激光
public  static By jg=By.xpath("html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[31]");
//    毛口
public  static By gys=By.xpath("html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[32]");
//    亮钻
public  static By lz=By.xpath("html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[33]");
//    饰扣
public  static By sk=By.xpath("html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[34]");
//    内里材质
public  static By nlcz=By.xpath("html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[35]");
//    垫脚材质
public  static By djcz=By.xpath("html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[36]");
//    拉链
public  static By ll=By.xpath("html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[37]");
//    系带
public  static By jd=By.xpath("html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[38]");
//    操作 删除
public  static By deleteClickList=By.xpath("html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[39]/button");

//    导入
public  static By importfile=By.xpath(".//*[@id='importfile']");
//    添加
public  static By insertClick=By.xpath("html/body/form/div/div/div[2]/div[2]/div/div[2]");
//    删除
public  static By deleteClick=By.xpath("html/body/form/div/div/div[2]/div[2]/div/div[3]/button");
//    保存
public  static By saveClick=By.xpath("html/body/form/div/div/div[2]/div[4]/a[1]");
 ///编辑
 public  static By updateClick=By.xpath("html/body/div/div/div[2]/div[1]/ul/li[2]/a/span");
//    审核
public  static By sh=By.xpath("html/body/form/div/div/div[2]/div[4]/a[2]");
//    数量合计
public  static By numTotal0=By.xpath(".//*[@id='sumqty']");
//    进价合计
public  static By jjTotal0=By.xpath(".//*[@id='sumpurprice']");
//    售价合计
public  static By sjTotal0=By.xpath(".//*[@id='sumprice']");
// 订单页面关闭   //*[@id="layui-layer3"]/span/a
public  static By  ddClose=By.xpath("html/body/div/span/a");
public  static By  ddClose1=By.xpath("//*[@id=\"layui-layer1\"]/span/a");
    public  static By  ddClose2=By.xpath("//*[@id=\"layui-layer2\"]/span/a");
    public  static By  ddClose3=By.xpath("//*[@id=\"layui-layer3\"]/span/a");
//    审核的确定按钮
public  static By  shQD=By.xpath("html/body/div/div[3]/a[1]");
public  static By  shQD3=By.xpath("//*[@id='layui-layer3']/div[3]/a[1]");
public  static By  shQD2=By.xpath("//*[@id='layui-layer2']/div[3]/a[1]");
    public  static By  shQD1=By.xpath("//*[@id='layui-layer1']/div[3]/a[1]");
    public  static By  shQD5=By.xpath("//*[@id='layui-layer5']/div[3]/a[1]");

// 列表表名
public  static By  ddTable=By.id("tabledate");
// 尾页    它随着页面变化的，所以直接用文本内容定位
public  static By  wy=By.linkText("尾页");

    //  点击按钮后弹出内容提示
    public  static By textYZ=By.xpath("/html/body/div[2]/div");

}
