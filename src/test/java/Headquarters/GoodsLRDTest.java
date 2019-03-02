package Headquarters;

import DbConnect.OracleConnection;
import Information.GoodsInfo;
import Information.LoginUserInfo;
import actions.Actions;
import drivers.SeleniumDriver;
import findElements.WebElementUtils;
import log4j.LoggerControler;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.*;
import tools.ExcelUnit;
import tools.RandomNum;

import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.*;

import static drivers.SeleniumDriver.driver;

/**
 * Created by Administrator on 2019/2/16.
 */
public class GoodsLRDTest {
    final static LoggerControler logger = LoggerControler.getLogger(DdTest.class);
    OracleConnection oracleConnection;
    String  sid="";
    //    登录
    @BeforeTest
    public   void  loginTest() throws InterruptedException {
        LoginUserInfo.login(0);
        LoginUserInfo.clickDjTest(MenuPage.lud);

    }
    //  新增
    @Test
    public   void  InsertGoodsTest() throws InterruptedException, SQLException, IOException, ClassNotFoundException {
//   将控制权转交给iframe
        WebElement webElement1 = WebElementUtils.findElement(GoodsPage.iframe);
        driver.switchTo().frame(webElement1);
        Actions.click(GoodsPage.insertClick);
        //控制权转交给弹出页面的iframe
        WebElement webElement2 = WebElementUtils.findElement(GoodsPage.iframeInsert);
        driver.switchTo().frame(webElement2);
       //输入供应商
        Actions.sendTest(GoodsPage.GYS, GoodsInfo.gys);
        WebElement webElement=WebElementUtils.findElement(GoodsPage.GYSValue);
        Actions.setAttribute(webElement, driver, "value", GoodsInfo.gysValue);
    // 经营方式
        Select jyfsSelect=new Select(WebElementUtils.findElement(GoodsPage.jyfs));
        jyfsSelect.selectByVisibleText(GoodsInfo.jyfs);
//        鞋码
        Select xiemaSelect=new Select(WebElementUtils.findElement(GoodsPage.xiema));
        xiemaSelect.selectByVisibleText(GoodsInfo.xiema);
//出厂价
        Actions.sendTest(GoodsPage.ccj,GoodsInfo.ccj);
//        包装费
        Actions.sendTest(GoodsPage.bzf,GoodsInfo.bzf);
//        进价
        Actions.sendTest(GoodsPage.jj,GoodsInfo.jj);
//        批发售价
        Actions.sendTest(GoodsPage.pfsj,GoodsInfo.pfsj);
//        区域
        Select qySelect=new Select(WebElementUtils.findElement(GoodsPage.qy));
        qySelect.selectByVisibleText(GoodsInfo.qy);
//        产地
        Select cdSelect=new Select(WebElementUtils.findElement(GoodsPage.cd));
        cdSelect.selectByVisibleText(GoodsInfo.cd);
//        季节
        Select jjSelect=new Select(WebElementUtils.findElement(GoodsPage.jjie));
        jjSelect.selectByVisibleText(GoodsInfo.jjie);
//         品牌
        Actions.sendTest(GoodsPage.pp, GoodsInfo.pp);
        WebElement pp=WebElementUtils.findElement(GoodsPage.ppValue);
        Actions.setAttribute(pp, driver, "value", GoodsInfo.ppValue);
//公司货号
        Actions.sendTest(GoodsPage.gshh,GoodsInfo.gshh);
//厂商货号
        Actions.sendTest(GoodsPage.cshh,GoodsInfo.cshh);
//        颜色
        Actions.sendTest(GoodsPage.ys, GoodsInfo.ys);
        WebElement ys=WebElementUtils.findElement(GoodsPage.ysValue);
        Actions.setAttribute(ys, driver, "value", GoodsInfo.ysValue);
//        品名
    Actions.sendTest(GoodsPage.pm,GoodsInfo.pm);
//        性别
        Select xbSelect=new Select(WebElementUtils.findElement(GoodsPage.xb));
        xbSelect.selectByVisibleText(GoodsInfo.xb);
//        系列
        Actions.sendTest(GoodsPage.xl, GoodsInfo.xl);
        WebElement xl=WebElementUtils.findElement(GoodsPage.xlValue);
        Actions.setAttribute(xl, driver, "value", GoodsInfo.xlValue);
//        鞋口
        Actions.sendTest(GoodsPage.xk, GoodsInfo.xk);
        WebElement xk=WebElementUtils.findElement(GoodsPage.xkValue);
        Actions.setAttribute(xk, driver, "value", GoodsInfo.xkValue);
//        面料
        Select mlSelect=new Select(WebElementUtils.findElement(GoodsPage.ml));
        mlSelect.selectByVisibleText(GoodsInfo.ml);
//        跟型
        Select gxSelect=new Select(WebElementUtils.findElement(GoodsPage.gx));
        gxSelect.selectByVisibleText(GoodsInfo.gx);
//        跟高
        Select ggSelect=new Select(WebElementUtils.findElement(GoodsPage.gg));
        ggSelect.selectByVisibleText(GoodsInfo.gg);
//        底型
        Select dxSelect=new Select(WebElementUtils.findElement(GoodsPage.dx));
        dxSelect.selectByVisibleText(GoodsInfo.dx);
//        帮高
        Select bgSelect=new Select(WebElementUtils.findElement(GoodsPage.bg));
        bgSelect.selectByVisibleText(GoodsInfo.bg);
//        内里
        Actions.sendTest(GoodsPage.nl, GoodsInfo.nl);
        WebElement nl=WebElementUtils.findElement(GoodsPage.nlValue);
        Actions.setAttribute(nl, driver, "value", GoodsInfo.nlValue);
//        激光
        Select jgSelect=new Select(WebElementUtils.findElement(GoodsPage.jg));
        jgSelect.selectByVisibleText(GoodsInfo.jg);
//        毛口
        Select mkSelect=new Select(WebElementUtils.findElement(GoodsPage.mk));
        mkSelect.selectByVisibleText(GoodsInfo.mk);
//        亮钻
        Select lzSelect=new Select(WebElementUtils.findElement(GoodsPage.lz));
        lzSelect.selectByVisibleText(GoodsInfo.lz);
//        饰扣
        Select xsSelect=new Select(WebElementUtils.findElement(GoodsPage.sk));
        xsSelect.selectByVisibleText(GoodsInfo.sk);
//        内里材质
        Select nlczSelect=new Select(WebElementUtils.findElement(GoodsPage.nlcz));
        nlczSelect.selectByVisibleText(GoodsInfo.nlcz);
//        垫脚材质
        Select djSelect=new Select(WebElementUtils.findElement(GoodsPage.djcz));
        djSelect.selectByVisibleText(GoodsInfo.djzz);
//        拉链
        Select llSelect=new Select(WebElementUtils.findElement(GoodsPage.ll));
        llSelect.selectByVisibleText(GoodsInfo.ll);
//        系带
        Select jdSelect=new Select(WebElementUtils.findElement(GoodsPage.jd));
        jdSelect.selectByVisibleText(GoodsInfo.jd);
//          生命周期
        Actions.sendTest(GoodsPage.smzq,GoodsInfo.smzq);
//          退货周期
        Actions.sendTest(GoodsPage.thzq,GoodsInfo.thzq);
//        年份
        Actions.sendTest(GoodsPage.nf,GoodsInfo.nf);


     oracleConnection = new OracleConnection();
        ResultSet resultSet = oracleConnection.querySql("select count(*) as  numTotal from GOODSIMPORTHEAD");
        int num1=0;
        while (resultSet.next()) {
            num1 = resultSet.getInt("numTotal") + 1;
        }
        logger.info("添加前+1："+num1);

        String strSMZQ=WebElementUtils.findElement(GoodsPage.smzq).getAttribute("value");	//生命周期
        String  strSTHZQ=WebElementUtils.findElement(GoodsPage.thzq).getAttribute("value");	//退货周期
        String strSYEAR=WebElementUtils.findElement(GoodsPage.nf).getAttribute("value");	//年份

        Actions.click(GoodsPage.savaClick); // 点击保存
        //数据插入数据库需要时间
        Thread.sleep(7000);
        //订单表：sborderhead  订单明细表： sborderdetail
        ResultSet resultSet1 = oracleConnection.querySql("select count(*) as  numTotal from GOODSIMPORTHEAD");
        int num2=0;
        while (resultSet1.next()) {
            num2 = resultSet1.getInt("numTotal");
        }
        logger.info("添加后："+num2);
        Assert.assertEquals(num1,num2,"商品录入单数量验证失败");


//        验证数据是否正确
      String  strSBILLNO=""; //单据编号
          strSBILLNO=WebElementUtils.findElement(GoodsPage.insertDNDH).getAttribute("value");
        sid =LoginUserInfo.loginUserInfo(LoginUserInfo.username) ;


        String  SBILLNO=""; //单据编号
        String  SFLAG="";//审核标志
        String  SINPUTOR=""	;//"录入员
        String SINPUTDATE="";	//"录入时间
        String SUPDATER="";	//"操作员
        String  SUPDATE="";	//"操作时间
        String SAUDITOR="";	//"审核员
        String SAUDITDATE="";	//"审核日期
        String SREMARK="";	//"备注
        String SISDEL="";	//"是否删除

        ResultSet resultSetHead = oracleConnection.querySql("select * from GOODSIMPORTHEAD  where SBILLNO='"+strSBILLNO+"'");
        while (resultSetHead.next()) {
            //数据表内容为null时，不能去空格
            SBILLNO = resultSetHead.getString("SBILLNO");
            SFLAG = resultSetHead.getString("SFLAG");
            SINPUTOR = resultSetHead.getString("SINPUTOR");
            SINPUTDATE = resultSetHead.getString("SINPUTDATE");
            SUPDATER = resultSetHead.getString("SUPDATER");
            SUPDATE = resultSetHead.getString("SUPDATE");
            SAUDITOR = resultSetHead.getString("SAUDITOR");
            SAUDITDATE = resultSetHead.getString("SAUDITDATE");
            SREMARK = resultSetHead.getString("SREMARK");
            SISDEL = resultSetHead.getString("SISDEL");

        }

        Assert.assertEquals("N",SFLAG.trim(),"审核标志错误");
        Assert.assertEquals(SINPUTOR,sid,"录入员错误");
        Assert.assertNotNull(SINPUTDATE,"录入时间为空");
        Assert.assertEquals(SUPDATER,sid,"操作员错误");
        Assert.assertNotNull(SUPDATE,"操作时间为空");
        Assert.assertEquals(SAUDITOR, "0","审核员错误");
        Assert.assertEquals(SAUDITDATE, null,"审核时间错误");//数据库是空的话，则是null
        Assert.assertEquals(SREMARK,null,"备注错误");
        Assert.assertEquals(SISDEL,"0","是否删除错误");


        ResultSet resultSetDetail = oracleConnection.querySql(" select * from GOODSIMPORTDETAIL  where SDBILLNO='"+strSBILLNO+"'");

        while (resultSetDetail.next()) {

            String  SDBILLNO=""	;//"单据编号
            String SDROWNO="";	//"行号
            String SDGDID="";	//商品编码
            String SWMID="";	//经营方式
            String SBUYER="";	//买手
            String SAREA="";	//区域
            String SORIGIN="";	//产地
            String SEASON="";	//季节
            String SUPID="";	//供应商
            String  SBRAND="";	//品牌
            String SCCODE="";	//公司货号
            String SVCODE="";	//厂商货号
            String SCOLOR="";	//颜色
            String SNAME="";	///品名
            String SSEX="";	//性别
            String SERIES="";	//系列
            String SGX="";	//跟型
            String SGG="";	//跟高
            String SDX="";	//底型
            String SXK="";	//鞋口

            String SBG="";	//帮高
            String SML="";	//面料
            String SNL="";	//内里
            String SJG="";	//激光
            String SMK="";	//毛口
            String SLZ="";	//亮钻
            String SSK="";	//饰扣
            String SNLCZ="";	//内里材质
            String SDJCZ="";	//垫脚材质
            String SLL="";	//拉链
            String  SXD="";	//系带
            String SCM="";	//尺码
            String SCCJ="";	//出厂价
            String SPFJ="";	//"批发价
            String SBZF="";	//包装费
            String SDPURPRICE="";	//进价
            String SDPRICE="";	//售价
           // String SCREASERATE="";	//加价率
            String SMZQ="";	//生命周期
            String  STHZQ="";	//退货周期
           // String  SHSJ="";	//上货时间
            String SYEAR="";	//年份
           // String SIMG="";	//图片
            String  SREMARK0="";	//描述
            String SISDEL0="";	//是否删除
            String SUPDATER0="";	//操作员
            String SUPDATE0="";	//操作时间
            String SCOLORCARD="";	//色卡
            String SCATEGORY="";	//类别


            SDROWNO=resultSetDetail.getString("SDROWNO");
            SDGDID=resultSetDetail.getString("SDGDID");
            SWMID=resultSetDetail.getString("SWMID");
            SBUYER=resultSetDetail.getString("SBUYER");
            SAREA=resultSetDetail.getString("SAREA");
            SORIGIN = resultSetDetail.getString("SORIGIN");
            SEASON=resultSetDetail.getString("SEASON");
            SUPID= resultSetDetail.getString("SUPID");
            SBRAND= resultSetDetail.getString("SBRAND");
            SCCODE=resultSetDetail.getString("SCCODE");
            SVCODE=resultSetDetail.getString("SVCODE");
            SCOLOR=resultSetDetail.getString("SCOLOR");

            SNAME=resultSetDetail.getString("SNAME");
            SSEX= resultSetDetail.getString("SSEX");
            SERIES= resultSetDetail.getString("SERIES");
            SGX=resultSetDetail.getString("SGX");
            SGG=resultSetDetail.getString("SGG");
            SDX=resultSetDetail.getString("SDX");
            SXK=resultSetDetail.getString("SXK");

            SBG=resultSetDetail.getString("SBG");
            SML=resultSetDetail.getString("SML");
            SNL=resultSetDetail.getString("SNL");
            SJG=resultSetDetail.getString("SJG");
            SMK=resultSetDetail.getString("SMK");
            SLZ=resultSetDetail.getString("SLZ");
            SSK=resultSetDetail.getString("SSK");
            SNLCZ=resultSetDetail.getString("SNLCZ");
            SDJCZ=resultSetDetail.getString("SDJCZ");
            SLL=resultSetDetail.getString("SLL");
            SXD=resultSetDetail.getString("SXD");
            SCM=resultSetDetail.getString("SCM");
            SCCJ=resultSetDetail.getString("SCCJ");
            SPFJ=resultSetDetail.getString("SPFJ");
            SBZF=resultSetDetail.getString("SBZF");
            SDPURPRICE=resultSetDetail.getString("SDPURPRICE");
            SDPRICE=resultSetDetail.getString("SDPRICE");
            //SCREASERATE=resultSetDetail.getString("SCREASERATE");
            SMZQ=resultSetDetail.getString("SMZQ");
            STHZQ=resultSetDetail.getString("STHZQ");
           // SHSJ=resultSetDetail.getString("SHSJ");
            SYEAR=resultSetDetail.getString("SYEAR");
            //SIMG=resultSetDetail.getString("SIMG");
            SREMARK0=resultSetDetail.getString("SREMARK");
            SISDEL0=resultSetDetail.getString("SISDEL");
            SUPDATER0=resultSetDetail.getString("SUPDATER");
            SUPDATE0=resultSetDetail.getString("SUPDATE");
            SCOLORCARD=resultSetDetail.getString("SCOLORCARD");
            SCATEGORY=resultSetDetail.getString("SCATEGORY");

            String strSDROWNO=WebElementUtils.findElement(GoodsPage.hh).getAttribute("value");//"行号
            String strSDGDID="";	//商品编码
            String strSWMID=WebElementUtils.findElement(GoodsPage.jyfs).getAttribute("value");	//经营方式
            String strSBUYER="0";		//买手
            String strSAREA=WebElementUtils.findElement(GoodsPage.qy).getAttribute("value");	//区域
            String strSORIGIN=WebElementUtils.findElement(GoodsPage.cd).getAttribute("value");	//产地
            String strSEASON=WebElementUtils.findElement(GoodsPage.jjie).getAttribute("value");	//季节
            String strSUPID=WebElementUtils.findElement(GoodsPage.GYSValue).getAttribute("value");	//供应商
            String  strSBRAND=WebElementUtils.findElement(GoodsPage.ppValue).getAttribute("value");	//品牌
            String strSCCODE=WebElementUtils.findElement(GoodsPage.gshh).getAttribute("value");	//公司货号
            String strSVCODE=WebElementUtils.findElement(GoodsPage.cshh).getAttribute("value");	//厂商货号
            String strSCOLOR=WebElementUtils.findElement(GoodsPage.ysValue).getAttribute("value");	//颜色
            String strSNAME=WebElementUtils.findElement(GoodsPage.pm).getAttribute("value");	///品名
            String strSSEX=WebElementUtils.findElement(GoodsPage.xlValue).getAttribute("value");		//性别
            String strSERIES=WebElementUtils.findElement(GoodsPage.xlValue).getAttribute("value");	//系列
            String strSGX=WebElementUtils.findElement(GoodsPage.gx).getAttribute("value");	//跟型
            String strSGG=WebElementUtils.findElement(GoodsPage.gg).getAttribute("value");	//跟高
            String strSDX=WebElementUtils.findElement(GoodsPage.dx).getAttribute("value");		//底型
            String strSXK=WebElementUtils.findElement(GoodsPage.xkValue).getAttribute("value");		//鞋口

            String strSBG=WebElementUtils.findElement(GoodsPage.bg).getAttribute("value");	//帮高
            String strSML=WebElementUtils.findElement(GoodsPage.ml).getAttribute("value");		//面料
            String strSNL=WebElementUtils.findElement(GoodsPage.nlValue).getAttribute("value");		//内里
            String strSJG=WebElementUtils.findElement(GoodsPage.jg).getAttribute("value");		//激光
            String strSMK=WebElementUtils.findElement(GoodsPage.mk).getAttribute("value");		//毛口
            String strSLZ=WebElementUtils.findElement(GoodsPage.lz).getAttribute("value");	//亮钻
            String strSSK=WebElementUtils.findElement(GoodsPage.sk).getAttribute("value");	//饰扣
            String strSNLCZ=WebElementUtils.findElement(GoodsPage.nlcz).getAttribute("value");	//内里材质
            String strSDJCZ=WebElementUtils.findElement(GoodsPage.djcz).getAttribute("value");	//垫脚材质
            String strSLL=WebElementUtils.findElement(GoodsPage.ll).getAttribute("value");	//拉链
            String  strSXD=WebElementUtils.findElement(GoodsPage.jd).getAttribute("value");//系带
            String strSCM=WebElementUtils.findElement(GoodsPage.xiema).getAttribute("value");//尺码
            String strSCCJ=WebElementUtils.findElement(GoodsPage.ccj).getAttribute("value");	//出厂价
            String strSPFJ=WebElementUtils.findElement(GoodsPage.pfsj).getAttribute("value");	//"批发价
            String strSBZF=WebElementUtils.findElement(GoodsPage.bzf).getAttribute("value");	//包装费
            String strSDPURPRICE=WebElementUtils.findElement(GoodsPage.jj).getAttribute("value");	//进价
           // String strSDPRICE=WebElementUtils.findElement(GoodsPage.sj).getAttribute("value");;	//售价
            //String strSCREASERATE=WebElementUtils.findElement(GoodsPage.jjv).getAttribute("value");	//加价率

            String strSUPDATER0=sid;	//操作员


            Assert.assertEquals(SDROWNO,strSDROWNO,"行号错误");
            Assert.assertEquals(SWMID,strSWMID,"经营方式错误");
            Assert.assertEquals(SBUYER,strSBUYER,"买手错误");
            Assert.assertEquals(SAREA,strSAREA,"区域错误");
            Assert.assertEquals(SORIGIN,strSORIGIN,"产地错误");
            Assert.assertEquals(SEASON,strSEASON,"季节错误错误");


            Assert.assertEquals(SUPID,strSUPID,"供应商错误");
            Assert.assertEquals(SBRAND,strSBRAND,"品牌错误");
            Assert.assertEquals(SCCODE.trim(),strSCCODE.trim(),"公司货号错误");

            Assert.assertEquals(SVCODE,strSVCODE,"厂商货号错误");
            Assert.assertEquals(SCOLOR,strSCOLOR,"颜色错误");
            Assert.assertEquals(SNAME,strSNAME,"品名错误");

            Assert.assertEquals(SSEX,strSSEX,"性别错误");
            Assert.assertEquals(SERIES,strSERIES,"系列错误");
            Assert.assertEquals(SGX,strSGX,"跟型错误");
            Assert.assertEquals(SGG,strSGG,"跟高错误");
            Assert.assertEquals(SDX,strSDX,"底型错误");
            Assert.assertEquals(SXK,strSXK,"鞋口错误");

            Assert.assertEquals(SBG,strSBG,"帮高错误");
            Assert.assertEquals(SML,strSML,"面料错误");
            Assert.assertEquals(SNL,strSNL,"内里错误");
            Assert.assertEquals(SJG,strSJG,"激光错误");
            Assert.assertEquals(SMK,strSMK,"毛口错误");
            Assert.assertEquals(SLZ,strSLZ,"亮钻错误");

            Assert.assertEquals(SSK,strSSK,"饰扣错误");
            Assert.assertEquals(SNLCZ,strSNLCZ,"内里材质错误");
            Assert.assertEquals(SDJCZ,strSDJCZ,"垫脚材质错误");
            Assert.assertEquals(SXD,strSXD,"系带错误");
            Assert.assertEquals(SCM,strSCM,"尺码错误");
            Assert.assertEquals(SCCJ,strSCCJ,"出厂价错误");

            Assert.assertEquals(SPFJ,strSPFJ,"批发售价错误");
            Assert.assertEquals(SBZF,strSBZF,"包装费错误");
            Assert.assertEquals(SDPURPRICE,strSDPURPRICE,"进价错误");
            Assert.assertEquals(SMZQ.substring(0,10),strSMZQ,"生命周期错误");
            Assert.assertEquals(STHZQ.substring(0,10),strSTHZQ,"退货周期错误");
            Assert.assertEquals(SYEAR.substring(0,4),strSYEAR.substring(0,4),"年份错误");
            Assert.assertEquals(SISDEL0,"0","是否删除错误");
            Assert.assertNotNull(SUPDATE0,"操作时间错误");

        }
        oracleConnection.close();
        SeleniumDriver.driver.switchTo().parentFrame();
        Actions.click(GoodsPage.insertClose);
        SeleniumDriver.driver.switchTo().defaultContent();
    }

    //  新增
    @Test
    public   void  InsertGoodsTestExcel() throws InterruptedException, SQLException, IOException, ClassNotFoundException {
//   将控制权转交给iframe
        WebElement webElement1 = WebElementUtils.findElement(GoodsPage.iframe);
        driver.switchTo().frame(webElement1);
        Actions.click(GoodsPage.insertClick);
        //控制权转交给弹出页面的iframe
        WebElement webElement2 = WebElementUtils.findElement(GoodsPage.iframeInsert);
        driver.switchTo().frame(webElement2);

        ExcelUnit excelUnit=new ExcelUnit();
        String fileName="F:\\测试资料\\WangZiShoes\\src\\main\\java\\Information\\GoodsInsert.xlsx";
        HashMap<String,String>[][] map = (HashMap<String, String>[][]) excelUnit.testDate(fileName,0);
        int  dateTotal=map.length;//数据从第1行开始
        int j=2;//从第二行开始才是内容
        System.out.println("excle总行数："+dateTotal);

        for (int i = 0; i < dateTotal; i++) {

                  //输入供应商
                String exGYS=map[i][0].get("供应商");
                String exGYSid=map[i][0].get("供应商id");
        Actions.sendTest(GoodsPages.GYS(i+j), exGYS);
        WebElement webElement=WebElementUtils.findElement(GoodsPages.GYSValue(i+j));
        Actions.setAttribute(webElement, driver, "value", exGYSid);

            // 经营方式
            Select jyfsSelect=new Select(WebElementUtils.findElement(GoodsPages.jyfs(i+j)));
            jyfsSelect.selectByVisibleText(map[i][0].get("经营方式"));
//        鞋码
            logger.info("鞋码:"+map[i][0].get("尺码"));
            logger.info("By:"+GoodsPages.xiema(i+j));
            Select xiemaSelect=new Select(WebElementUtils.findElement(GoodsPages.xiema(i+j)));
            xiemaSelect.selectByVisibleText(map[i][0].get("尺码"));
//出厂价
            Actions.sendTest(GoodsPages.ccj(i+j),map[i][0].get("出厂价"));
//        包装费
            Actions.sendTest(GoodsPages.bzf(i+j),map[i][0].get("包装费"));
//        进价
            Actions.sendTest(GoodsPages.jj(i+j),map[i][0].get("进价"));
//        批发售价
            Actions.sendTest(GoodsPages.pfsj(i+j),map[i][0].get("批发售价"));
//        区域
            Select qySelect=new Select(WebElementUtils.findElement(GoodsPages.qy(i+j)));
            qySelect.selectByVisibleText(map[i][0].get("区域"));
//        产地
            Select cdSelect=new Select(WebElementUtils.findElement(GoodsPages.cd(i+j)));
            cdSelect.selectByVisibleText(map[i][0].get("产地"));
//        季节
            Select jjSelect=new Select(WebElementUtils.findElement(GoodsPages.jjie(i+j)));
            jjSelect.selectByVisibleText(map[i][0].get("季节"));
//         品牌
            Actions.sendTest(GoodsPages.pp(i+j), map[i][0].get("品牌"));
            WebElement pp=WebElementUtils.findElement(GoodsPages.ppValue(i+j));
            Actions.setAttribute(pp, driver, "value",map[i][0].get("品牌id"));
//公司货号
            String  gshh="g"+RandomNum.getRandomNum(4);
            Actions.sendTest(GoodsPages.gshh(i+j),gshh);
//厂商货号
            Actions.sendTest(GoodsPages.cshh(i+j),map[i][0].get("厂商货号"));
//        颜色
            Actions.sendTest(GoodsPages.ys(i+j), map[i][0].get("颜色"));
            WebElement ys=WebElementUtils.findElement(GoodsPages.ysValue(i+j));
            Actions.setAttribute(ys, driver, "value",  map[i][0].get("颜色id"));
//        品名
            Actions.sendTest(GoodsPages.pm(i+j),map[i][0].get("品牌内容")+gshh+ map[i][0].get("颜色"));
//        性别
            Select xbSelect=new Select(WebElementUtils.findElement(GoodsPages.xb(i+j)));
            xbSelect.selectByVisibleText(map[i][0].get("性别"));
//        系列
            Actions.sendTest(GoodsPages.xl(i+j), map[i][0].get("系列"));
            WebElement xl=WebElementUtils.findElement(GoodsPages.xlValue(i+j));
            Actions.setAttribute(xl, driver, "value", map[i][0].get("系列id"));
//        鞋口
            Actions.sendTest(GoodsPages.xk(i+j), map[i][0].get("鞋口"));
            WebElement xk=WebElementUtils.findElement(GoodsPages.xkValue(i+j));
            Actions.setAttribute(xk, driver, "value", map[i][0].get("鞋口id"));
//        面料
            Select mlSelect=new Select(WebElementUtils.findElement(GoodsPages.ml(i+j)));
            mlSelect.selectByVisibleText(map[i][0].get("面料"));
//        跟型
            Select gxSelect=new Select(WebElementUtils.findElement(GoodsPages.gx(i+j)));
            gxSelect.selectByVisibleText(map[i][0].get("跟型"));
//        跟高
            Select ggSelect=new Select(WebElementUtils.findElement(GoodsPages.gg(i+j)));
            ggSelect.selectByVisibleText(map[i][0].get("跟高"));
//        底型
            Select dxSelect=new Select(WebElementUtils.findElement(GoodsPages.dx(i+j)));
            dxSelect.selectByVisibleText(map[i][0].get("底型"));
//        帮高
            Select bgSelect=new Select(WebElementUtils.findElement(GoodsPages.bg(i+j)));
            bgSelect.selectByVisibleText(map[i][0].get("帮高"));
//        内里
            Actions.sendTest(GoodsPages.nl(i+j), map[i][0].get("内里"));
            WebElement nl=WebElementUtils.findElement(GoodsPages.nlValue(i+j));
            Actions.setAttribute(nl, driver, "value",map[i][0].get("内里id"));
//        激光
            Select jgSelect=new Select(WebElementUtils.findElement(GoodsPages.jg(i+j)));
            jgSelect.selectByVisibleText(map[i][0].get("激光"));
//        毛口
            Select mkSelect=new Select(WebElementUtils.findElement(GoodsPages.mk(i+j)));
            mkSelect.selectByVisibleText(map[i][0].get("毛口"));
//        亮钻
            Select lzSelect=new Select(WebElementUtils.findElement(GoodsPages.lz(i+j)));
            lzSelect.selectByVisibleText(map[i][0].get("亮钻"));
//        饰扣
            Select xsSelect=new Select(WebElementUtils.findElement(GoodsPages.sk(i+j)));
            xsSelect.selectByVisibleText(map[i][0].get("饰扣"));
//        内里材质
            Select nlczSelect=new Select(WebElementUtils.findElement(GoodsPages.nlcz(i+j)));
            nlczSelect.selectByVisibleText(map[i][0].get("内里材质"));
//        垫脚材质
            Select djSelect=new Select(WebElementUtils.findElement(GoodsPages.djcz(i+j)));
            djSelect.selectByVisibleText(map[i][0].get("垫脚材质"));
//        拉链
            Select llSelect=new Select(WebElementUtils.findElement(GoodsPages.ll(i+j)));
            llSelect.selectByVisibleText(map[i][0].get("拉链"));
//        系带
            Select jdSelect=new Select(WebElementUtils.findElement(GoodsPages.jd(i+j)));
            jdSelect.selectByVisibleText(map[i][0].get("系带"));
//          生命周期
            logger.info("生命周期:"+map[i][0].get("生命周期"));
            Actions.sendTest(GoodsPages.smzq(i+j),map[i][0].get("生命周期").substring(0,10));
//          退货周期
            logger.info("退货周期:"+map[i][0].get("退货周期"));
            Actions.sendTest(GoodsPages.thzq(i+j),map[i][0].get("退货周期").substring(0,10));
//        年份
            Actions.sendTest(GoodsPages.nf(i+j),map[i][0].get("年份"));
            //多行数据时点击添加+
if(dateTotal>1&&i!=dateTotal-1){
    Actions.click(GoodsPage.tianjia0);
}


        }


        oracleConnection = new OracleConnection();
        ResultSet resultSet = oracleConnection.querySql("select count(*) as  numTotal from GOODSIMPORTHEAD");
        int num1=0;
        while (resultSet.next()) {
            num1 = resultSet.getInt("numTotal") + 1;
        }
        logger.info("添加前+1："+num1);

        String strSMZQ=WebElementUtils.findElement(GoodsPage.smzq).getAttribute("value");	//生命周期
        String  strSTHZQ=WebElementUtils.findElement(GoodsPage.thzq).getAttribute("value");	//退货周期
        String strSYEAR=WebElementUtils.findElement(GoodsPage.nf).getAttribute("value");	//年份

        Actions.click(GoodsPage.savaClick); // 点击保存
        //数据插入数据库需要时间
        Thread.sleep(7000);
        //订单表：sborderhead  订单明细表： sborderdetail
        ResultSet resultSet1 = oracleConnection.querySql("select count(*) as  numTotal from GOODSIMPORTHEAD");
        int num2=0;
        while (resultSet1.next()) {
            num2 = resultSet1.getInt("numTotal");
        }
        logger.info("添加后："+num2);
        Assert.assertEquals(num1,num2,"商品录入单失败");


//        验证数据是否正确
        String  strSBILLNO=""; //单据编号
        strSBILLNO=WebElementUtils.findElement(GoodsPage.insertDNDH).getAttribute("value");
        sid =LoginUserInfo.loginUserInfo(LoginUserInfo.username) ;


        String  SBILLNO=""; //单据编号
        String  SFLAG="";//审核标志
        String  SINPUTOR=""	;//"录入员
        String SINPUTDATE="";	//"录入时间
        String SUPDATER="";	//"操作员
        String  SUPDATE="";	//"操作时间
        String SAUDITOR="";	//"审核员
        String SAUDITDATE="";	//"审核日期
        String SREMARK="";	//"备注
        String SISDEL="";	//"是否删除

        ResultSet resultSetHead = oracleConnection.querySql("select * from GOODSIMPORTHEAD  where SBILLNO='"+strSBILLNO+"'");
        while (resultSetHead.next()) {
            //数据表内容为null时，不能去空格
            SBILLNO = resultSetHead.getString("SBILLNO");
            SFLAG = resultSetHead.getString("SFLAG");
            SINPUTOR = resultSetHead.getString("SINPUTOR");
            SINPUTDATE = resultSetHead.getString("SINPUTDATE");
            SUPDATER = resultSetHead.getString("SUPDATER");
            SUPDATE = resultSetHead.getString("SUPDATE");
            SAUDITOR = resultSetHead.getString("SAUDITOR");
            SAUDITDATE = resultSetHead.getString("SAUDITDATE");
            SREMARK = resultSetHead.getString("SREMARK");
            SISDEL = resultSetHead.getString("SISDEL");

        }

        Assert.assertEquals("N",SFLAG.trim(),"审核标志错误");
        Assert.assertEquals(SINPUTOR,sid,"录入员错误");
        Assert.assertNotNull(SINPUTDATE,"录入时间为空");
        Assert.assertEquals(SUPDATER,sid,"操作员错误");
        Assert.assertNotNull(SUPDATE,"操作时间为空");
        Assert.assertEquals(SAUDITOR, "0","审核员错误");
        Assert.assertEquals(SAUDITDATE, null,"审核时间错误");//数据库是空的话，则是null
        Assert.assertEquals(SREMARK,null,"备注错误");
        Assert.assertEquals(SISDEL,"0","是否删除错误");


        ResultSet resultSetDetail = oracleConnection.querySql(" select * from GOODSIMPORTDETAIL   where SDBILLNO='"+strSBILLNO+"' order by SDROWNO ");
        int n=2;
        int m=0;
        while (resultSetDetail.next()) {

            String  SDBILLNO=""	;//"单据编号
            String SDROWNO="";	//"行号
            String SDGDID="";	//商品编码
            String SWMID="";	//经营方式
            String SBUYER="";	//买手
            String SAREA="";	//区域
            String SORIGIN="";	//产地
            String SEASON="";	//季节
            String SUPID="";	//供应商
            String  SBRAND="";	//品牌
            String SCCODE="";	//公司货号
            String SVCODE="";	//厂商货号
            String SCOLOR="";	//颜色
            String SNAME="";	///品名
            String SSEX="";	//性别
            String SERIES="";	//系列
            String SGX="";	//跟型
            String SGG="";	//跟高
            String SDX="";	//底型
            String SXK="";	//鞋口

            String SBG="";	//帮高
            String SML="";	//面料
            String SNL="";	//内里
            String SJG="";	//激光
            String SMK="";	//毛口
            String SLZ="";	//亮钻
            String SSK="";	//饰扣
            String SNLCZ="";	//内里材质
            String SDJCZ="";	//垫脚材质
            String SLL="";	//拉链
            String  SXD="";	//系带
            String SCM="";	//尺码
            String SCCJ="";	//出厂价
            String SPFJ="";	//"批发价
            String SBZF="";	//包装费
            String SDPURPRICE="";	//进价
            String SDPRICE="";	//售价
            // String SCREASERATE="";	//加价率
            String SMZQ="";	//生命周期
            String  STHZQ="";	//退货周期
            // String  SHSJ="";	//上货时间
            String SYEAR="";	//年份
            // String SIMG="";	//图片
            String  SREMARK0="";	//描述
            String SISDEL0="";	//是否删除
            String SUPDATER0="";	//操作员
            String SUPDATE0="";	//操作时间
            String SCOLORCARD="";	//色卡
            String SCATEGORY="";	//类别


            SDROWNO=resultSetDetail.getString("SDROWNO");
            SDGDID=resultSetDetail.getString("SDGDID");
            SWMID=resultSetDetail.getString("SWMID");
            SBUYER=resultSetDetail.getString("SBUYER");
            SAREA=resultSetDetail.getString("SAREA");
            SORIGIN = resultSetDetail.getString("SORIGIN");
            SEASON=resultSetDetail.getString("SEASON");
            SUPID= resultSetDetail.getString("SUPID");
            SBRAND= resultSetDetail.getString("SBRAND");
            SCCODE=resultSetDetail.getString("SCCODE");
            SVCODE=resultSetDetail.getString("SVCODE");
            SCOLOR=resultSetDetail.getString("SCOLOR");

            SNAME=resultSetDetail.getString("SNAME");
            SSEX= resultSetDetail.getString("SSEX");
            SERIES= resultSetDetail.getString("SERIES");
            SGX=resultSetDetail.getString("SGX");
            SGG=resultSetDetail.getString("SGG");
            SDX=resultSetDetail.getString("SDX");
            SXK=resultSetDetail.getString("SXK");

            SBG=resultSetDetail.getString("SBG");
            SML=resultSetDetail.getString("SML");
            SNL=resultSetDetail.getString("SNL");
            SJG=resultSetDetail.getString("SJG");
            SMK=resultSetDetail.getString("SMK");
            SLZ=resultSetDetail.getString("SLZ");
            SSK=resultSetDetail.getString("SSK");
            SNLCZ=resultSetDetail.getString("SNLCZ");
            SDJCZ=resultSetDetail.getString("SDJCZ");
            SLL=resultSetDetail.getString("SLL");
            SXD=resultSetDetail.getString("SXD");
            SCM=resultSetDetail.getString("SCM");
            SCCJ=resultSetDetail.getString("SCCJ");
            SPFJ=resultSetDetail.getString("SPFJ");
            SBZF=resultSetDetail.getString("SBZF");
            SDPURPRICE=resultSetDetail.getString("SDPURPRICE");
            SDPRICE=resultSetDetail.getString("SDPRICE");
            //SCREASERATE=resultSetDetail.getString("SCREASERATE");
            SMZQ=resultSetDetail.getString("SMZQ");
            STHZQ=resultSetDetail.getString("STHZQ");
            // SHSJ=resultSetDetail.getString("SHSJ");
            SYEAR=resultSetDetail.getString("SYEAR");
            //SIMG=resultSetDetail.getString("SIMG");
            SREMARK0=resultSetDetail.getString("SREMARK");
            SISDEL0=resultSetDetail.getString("SISDEL");
            SUPDATER0=resultSetDetail.getString("SUPDATER");
            SUPDATE0=resultSetDetail.getString("SUPDATE");
            SCOLORCARD=resultSetDetail.getString("SCOLORCARD");
            SCATEGORY=resultSetDetail.getString("SCATEGORY");

            String strSDROWNO=WebElementUtils.findElement(GoodsPages.hh(n+m)).getAttribute("value");//"行号
            String strSDGDID="";	//商品编码
            String strSWMID=WebElementUtils.findElement(GoodsPages.jyfs(n+m)).getAttribute("value");	//经营方式
            String strSBUYER="0";		//买手
            String strSAREA=WebElementUtils.findElement(GoodsPages.qy(n+m)).getAttribute("value");	//区域
            String strSORIGIN=WebElementUtils.findElement(GoodsPages.cd(n+m)).getAttribute("value");	//产地
            String strSEASON=WebElementUtils.findElement(GoodsPages.jjie(n+m)).getAttribute("value");	//季节
            String strSUPID=WebElementUtils.findElement(GoodsPages.GYSValue(n+m)).getAttribute("value");	//供应商
            String  strSBRAND=WebElementUtils.findElement(GoodsPages.ppValue(n+m)).getAttribute("value");	//品牌
            String strSCCODE=WebElementUtils.findElement(GoodsPages.gshh(n+m)).getAttribute("value");	//公司货号
            String strSVCODE=WebElementUtils.findElement(GoodsPages.cshh(n+m)).getAttribute("value");	//厂商货号
            String strSCOLOR=WebElementUtils.findElement(GoodsPages.ysValue(n+m)).getAttribute("value");	//颜色
            String strSNAME=WebElementUtils.findElement(GoodsPages.pm(n+m)).getAttribute("value");	///品名
            String strSSEX=WebElementUtils.findElement(GoodsPages.xlValue(n+m)).getAttribute("value");		//性别
            String strSERIES=WebElementUtils.findElement(GoodsPages.xlValue(n+m)).getAttribute("value");	//系列
            String strSGX=WebElementUtils.findElement(GoodsPages.gx(n+m)).getAttribute("value");	//跟型
            String strSGG=WebElementUtils.findElement(GoodsPages.gg(n+m)).getAttribute("value");	//跟高
            String strSDX=WebElementUtils.findElement(GoodsPages.dx(n+m)).getAttribute("value");		//底型
            String strSXK=WebElementUtils.findElement(GoodsPages.xkValue(n+m)).getAttribute("value");		//鞋口

            String strSBG=WebElementUtils.findElement(GoodsPages.bg(n+m)).getAttribute("value");	//帮高
            String strSML=WebElementUtils.findElement(GoodsPages.ml(n+m)).getAttribute("value");		//面料
            String strSNL=WebElementUtils.findElement(GoodsPages.nlValue(n+m)).getAttribute("value");		//内里
            String strSJG=WebElementUtils.findElement(GoodsPages.jg(n+m)).getAttribute("value");		//激光
            String strSMK=WebElementUtils.findElement(GoodsPages.mk(n+m)).getAttribute("value");		//毛口
            String strSLZ=WebElementUtils.findElement(GoodsPages.lz(n+m)).getAttribute("value");	//亮钻
            String strSSK=WebElementUtils.findElement(GoodsPages.sk(n+m)).getAttribute("value");	//饰扣
            String strSNLCZ=WebElementUtils.findElement(GoodsPages.nlcz(n+m)).getAttribute("value");	//内里材质
            String strSDJCZ=WebElementUtils.findElement(GoodsPages.djcz(n+m)).getAttribute("value");	//垫脚材质
            String strSLL=WebElementUtils.findElement(GoodsPages.ll(n+m)).getAttribute("value");	//拉链
            String  strSXD=WebElementUtils.findElement(GoodsPages.jd(n+m)).getAttribute("value");//系带
            String strSCM=WebElementUtils.findElement(GoodsPages.xiema(n+m)).getAttribute("value");//尺码
            String strSCCJ=WebElementUtils.findElement(GoodsPages.ccj(n+m)).getAttribute("value");	//出厂价
            String strSPFJ=WebElementUtils.findElement(GoodsPages.pfsj(n+m)).getAttribute("value");	//"批发价
            String strSBZF=WebElementUtils.findElement(GoodsPages.bzf(n+m)).getAttribute("value");	//包装费
            String strSDPURPRICE=WebElementUtils.findElement(GoodsPages.jj(n+m)).getAttribute("value");	//进价
            // String strSDPRICE=WebElementUtils.findElement(GoodsPage.sj).getAttribute("value");;	//售价
            //String strSCREASERATE=WebElementUtils.findElement(GoodsPage.jjv).getAttribute("value");	//加价率

            String strSUPDATER0=sid;	//操作员


            Assert.assertEquals(SDROWNO,strSDROWNO,"行号错误");
            Assert.assertEquals(SWMID,strSWMID,"经营方式错误");
            Assert.assertEquals(SBUYER,strSBUYER,"买手错误");
            Assert.assertEquals(SAREA,strSAREA,"区域错误");
            Assert.assertEquals(SORIGIN,strSORIGIN,"产地错误");
            Assert.assertEquals(SEASON,strSEASON,"季节错误错误");


            Assert.assertEquals(SUPID,strSUPID,"供应商错误");
            Assert.assertEquals(SBRAND,strSBRAND,"品牌错误");
            Assert.assertEquals(SCCODE.trim(),strSCCODE.trim(),"公司货号错误");

            Assert.assertEquals(SVCODE,strSVCODE,"厂商货号错误");
            Assert.assertEquals(SCOLOR,strSCOLOR,"颜色错误");
            Assert.assertEquals(SNAME,strSNAME,"品名错误");

            Assert.assertEquals(SSEX,strSSEX,"性别错误");
            Assert.assertEquals(SERIES,strSERIES,"系列错误");
            Assert.assertEquals(SGX,strSGX,"跟型错误");
            Assert.assertEquals(SGG,strSGG,"跟高错误");
            Assert.assertEquals(SDX,strSDX,"底型错误");
            Assert.assertEquals(SXK,strSXK,"鞋口错误");

            Assert.assertEquals(SBG,strSBG,"帮高错误");
            Assert.assertEquals(SML,strSML,"面料错误");
            Assert.assertEquals(SNL,strSNL,"内里错误");
            Assert.assertEquals(SJG,strSJG,"激光错误");
            Assert.assertEquals(SMK,strSMK,"毛口错误");
            Assert.assertEquals(SLZ,strSLZ,"亮钻错误");

            Assert.assertEquals(SSK,strSSK,"饰扣错误");
            Assert.assertEquals(SNLCZ,strSNLCZ,"内里材质错误");
            Assert.assertEquals(SDJCZ,strSDJCZ,"垫脚材质错误");
            Assert.assertEquals(SXD,strSXD,"系带错误");
            Assert.assertEquals(SCM,strSCM,"尺码错误");
            Assert.assertEquals(SCCJ,strSCCJ,"出厂价错误");

            Assert.assertEquals(SPFJ,strSPFJ,"批发售价错误");
            Assert.assertEquals(SBZF,strSBZF,"包装费错误");
            Assert.assertEquals(SDPURPRICE,strSDPURPRICE,"进价错误");
            Assert.assertEquals(SMZQ.substring(0,10),strSMZQ,"生命周期错误");
            Assert.assertEquals(STHZQ.substring(0,10),strSTHZQ,"退货周期错误");
            Assert.assertEquals(SYEAR.substring(0,4),strSYEAR.substring(0,4),"年份错误");
            Assert.assertEquals(SISDEL0,"0","是否删除错误");
            Assert.assertNotNull(SUPDATE0,"操作时间错误");
m++;
        }
        oracleConnection.close();
        SeleniumDriver.driver.switchTo().parentFrame();
        Actions.click(GoodsPage.insertClose);
        SeleniumDriver.driver.switchTo().defaultContent();
    }
    //    修改
    @Test
    public  void  UpdateGoodsTest()  throws InterruptedException, SQLException, IOException, ClassNotFoundException {
        WebElement webElement1 = WebElementUtils.findElement(GoodsPage.iframe);
        SeleniumDriver.driver.switchTo().frame(webElement1);
        Actions.click(GoodsPage.selectClick);
        logger.info("选中："+ WebElementUtils.findElement(GoodsPage.liebiao1).getText());
        if ( WebElementUtils.findElement(GoodsPage.liebiao1).getText().equals("1")) {
            logger.info("选中");
            Actions.click(GoodsPage.liebiao1Selected);
        }
        Actions.click(GoodsPage.updateClick);

        //控制权转交给弹出页面的iframe
        WebElement webElement2 = WebElementUtils.findElement(DdPage.iframeInsert1);
        SeleniumDriver.driver.switchTo().frame(webElement2);

        //输入供应商
        Actions.sendTest(GoodsPage.GYS, GoodsInfo.gysU);
        WebElement webElement=WebElementUtils.findElement(GoodsPage.GYSValue);
        Actions.setAttribute(webElement, driver, "value", GoodsInfo.gysValueU);
        // 经营方式
        Select jyfsSelect=new Select(WebElementUtils.findElement(GoodsPage.jyfs));
        jyfsSelect.selectByVisibleText(GoodsInfo.jyfsU);
//        鞋码
        Select xiemaSelect=new Select(WebElementUtils.findElement(GoodsPage.xiema));
        xiemaSelect.selectByVisibleText(GoodsInfo.xiemaU);
//出厂价
        Actions.sendTest(GoodsPage.ccj,GoodsInfo.ccjU);
//        包装费
        Actions.sendTest(GoodsPage.bzf,GoodsInfo.bzfU);
//        进价
        Actions.sendTest(GoodsPage.jj,GoodsInfo.jjU);
//        批发售价
        Actions.sendTest(GoodsPage.pfsj,GoodsInfo.pfsjU);
//        区域
        Select qySelect=new Select(WebElementUtils.findElement(GoodsPage.qy));
        qySelect.selectByVisibleText(GoodsInfo.qyU);
//        产地
        Select cdSelect=new Select(WebElementUtils.findElement(GoodsPage.cd));
        cdSelect.selectByVisibleText(GoodsInfo.cdU);
//        季节
        Select jjSelect=new Select(WebElementUtils.findElement(GoodsPage.jjie));
        jjSelect.selectByVisibleText(GoodsInfo.jjieU);
//         品牌
        Actions.sendTest(GoodsPage.pp, GoodsInfo.ppU);
        WebElement pp=WebElementUtils.findElement(GoodsPage.ppValue);
        Actions.setAttribute(pp, driver, "value", GoodsInfo.ppValueU);
//公司货号
        Actions.sendTest(GoodsPage.gshh,GoodsInfo.gshhU);
//厂商货号
        Actions.sendTest(GoodsPage.cshh,GoodsInfo.cshhU);
//        颜色
        Actions.sendTest(GoodsPage.ys, GoodsInfo.ysU);
        WebElement ys=WebElementUtils.findElement(GoodsPage.ysValue);
        Actions.setAttribute(ys, driver, "value", GoodsInfo.ysValueU);
//        品名
        Actions.sendTest(GoodsPage.pm,GoodsInfo.pmU);
//        性别
        Select xbSelect=new Select(WebElementUtils.findElement(GoodsPage.xb));
        xbSelect.selectByVisibleText(GoodsInfo.xbU);
//        系列
        Actions.sendTest(GoodsPage.xl, GoodsInfo.xlU);
        WebElement xl=WebElementUtils.findElement(GoodsPage.xlValue);
        Actions.setAttribute(xl, driver, "value", GoodsInfo.xlValueU);
//        鞋口
        Actions.sendTest(GoodsPage.xk, GoodsInfo.xkU);
        WebElement xk=WebElementUtils.findElement(GoodsPage.xkValue);
        Actions.setAttribute(xk, driver, "value", GoodsInfo.xkValueU);
//        面料
        Select mlSelect=new Select(WebElementUtils.findElement(GoodsPage.ml));
        mlSelect.selectByVisibleText(GoodsInfo.mlU);
//        跟型
        Select gxSelect=new Select(WebElementUtils.findElement(GoodsPage.gx));
        gxSelect.selectByVisibleText(GoodsInfo.gxU);
//        跟高
        Select ggSelect=new Select(WebElementUtils.findElement(GoodsPage.gg));
        ggSelect.selectByVisibleText(GoodsInfo.ggU);
//        底型
        Select dxSelect=new Select(WebElementUtils.findElement(GoodsPage.dx));
        dxSelect.selectByVisibleText(GoodsInfo.dxU);
//        帮高
        Select bgSelect=new Select(WebElementUtils.findElement(GoodsPage.bg));
        bgSelect.selectByVisibleText(GoodsInfo.bgU);
//        内里
        Actions.sendTest(GoodsPage.nl, GoodsInfo.nlU);
        WebElement nl=WebElementUtils.findElement(GoodsPage.nlValue);
        Actions.setAttribute(nl, driver, "value", GoodsInfo.nlValueU);
//        激光
        Select jgSelect=new Select(WebElementUtils.findElement(GoodsPage.jg));
        jgSelect.selectByVisibleText(GoodsInfo.jgU);
//        毛口
        Select mkSelect=new Select(WebElementUtils.findElement(GoodsPage.mk));
        mkSelect.selectByVisibleText(GoodsInfo.mkU);
//        亮钻
        Select lzSelect=new Select(WebElementUtils.findElement(GoodsPage.lz));
        lzSelect.selectByVisibleText(GoodsInfo.lzU);
//        饰扣
        Select xsSelect=new Select(WebElementUtils.findElement(GoodsPage.sk));
        xsSelect.selectByVisibleText(GoodsInfo.skU);
//        内里材质
        Select nlczSelect=new Select(WebElementUtils.findElement(GoodsPage.nlcz));
        nlczSelect.selectByVisibleText(GoodsInfo.nlczU);
//        垫脚材质
        Select djSelect=new Select(WebElementUtils.findElement(GoodsPage.djcz));
        djSelect.selectByVisibleText(GoodsInfo.djzzU);
//        拉链
        Select llSelect=new Select(WebElementUtils.findElement(GoodsPage.ll));
        llSelect.selectByVisibleText(GoodsInfo.llU);
//        系带
        Select jdSelect=new Select(WebElementUtils.findElement(GoodsPage.jd));
        jdSelect.selectByVisibleText(GoodsInfo.jdU);
//          生命周期
        Actions.sendTest(GoodsPage.smzq,GoodsInfo.smzqU);
//          退货周期
        Actions.sendTest(GoodsPage.thzq,GoodsInfo.thzqU);
//        年份
        Actions.sendTest(GoodsPage.nf,GoodsInfo.nfU);

        String strSMZQ=WebElementUtils.findElement(GoodsPage.smzq).getAttribute("value");	//生命周期
        String  strSTHZQ=WebElementUtils.findElement(GoodsPage.thzq).getAttribute("value");	//退货周期
        String strSYEAR=WebElementUtils.findElement(GoodsPage.nf).getAttribute("value");	//年份
        String  strSBILLNO=""; //单据编号
        strSBILLNO=WebElementUtils.findElement(GoodsPage.insertDNDH).getAttribute("value");
        sid =LoginUserInfo.loginUserInfo(LoginUserInfo.username) ;
System.out.println("strSBILLNO:"+strSBILLNO);
        Actions.click(GoodsPage.savaClick); // 点击保存
        Thread.sleep(8000);
        oracleConnection = new OracleConnection();
        ResultSet resultSetDetail = oracleConnection.querySql(" select * from GOODSIMPORTDETAIL  where SDBILLNO='"+strSBILLNO+"'");

        while (resultSetDetail.next()) {

            String  SDBILLNO=""	;//"单据编号
            String SDROWNO="";	//"行号
            String SDGDID="";	//商品编码
            String SWMID="";	//经营方式
            String SBUYER="";	//买手
            String SAREA="";	//区域
            String SORIGIN="";	//产地
            String SEASON="";	//季节
            String SUPID="";	//供应商
            String  SBRAND="";	//品牌
            String SCCODE="";	//公司货号
            String SVCODE="";	//厂商货号
            String SCOLOR="";	//颜色
            String SNAME="";	///品名
            String SSEX="";	//性别
            String SERIES="";	//系列
            String SGX="";	//跟型
            String SGG="";	//跟高
            String SDX="";	//底型
            String SXK="";	//鞋口

            String SBG="";	//帮高
            String SML="";	//面料
            String SNL="";	//内里
            String SJG="";	//激光
            String SMK="";	//毛口
            String SLZ="";	//亮钻
            String SSK="";	//饰扣
            String SNLCZ="";	//内里材质
            String SDJCZ="";	//垫脚材质
            String SLL="";	//拉链
            String  SXD="";	//系带
            String SCM="";	//尺码
            String SCCJ="";	//出厂价
            String SPFJ="";	//"批发价
            String SBZF="";	//包装费
            String SDPURPRICE="";	//进价
            String SDPRICE="";	//售价
            // String SCREASERATE="";	//加价率
            String SMZQ="";	//生命周期
            String  STHZQ="";	//退货周期
            // String  SHSJ="";	//上货时间
            String SYEAR="";	//年份
            // String SIMG="";	//图片
            String  SREMARK0="";	//描述
            String SISDEL0="";	//是否删除
            String SUPDATER0="";	//操作员
            String SUPDATE0="";	//操作时间
            String SCOLORCARD="";	//色卡
            String SCATEGORY="";	//类别


            SDROWNO=resultSetDetail.getString("SDROWNO");
            SDGDID=resultSetDetail.getString("SDGDID");
            SWMID=resultSetDetail.getString("SWMID");
            SBUYER=resultSetDetail.getString("SBUYER");
            SAREA=resultSetDetail.getString("SAREA");
            SORIGIN = resultSetDetail.getString("SORIGIN");
            SEASON=resultSetDetail.getString("SEASON");
            SUPID= resultSetDetail.getString("SUPID");
            SBRAND= resultSetDetail.getString("SBRAND");
            SCCODE=resultSetDetail.getString("SCCODE");
            SVCODE=resultSetDetail.getString("SVCODE");
            SCOLOR=resultSetDetail.getString("SCOLOR");

            SNAME=resultSetDetail.getString("SNAME");
            SSEX= resultSetDetail.getString("SSEX");
            SERIES= resultSetDetail.getString("SERIES");
            SGX=resultSetDetail.getString("SGX");
            SGG=resultSetDetail.getString("SGG");
            SDX=resultSetDetail.getString("SDX");
            SXK=resultSetDetail.getString("SXK");

            SBG=resultSetDetail.getString("SBG");
            SML=resultSetDetail.getString("SML");
            SNL=resultSetDetail.getString("SNL");
            SJG=resultSetDetail.getString("SJG");
            SMK=resultSetDetail.getString("SMK");
            SLZ=resultSetDetail.getString("SLZ");
            SSK=resultSetDetail.getString("SSK");
            SNLCZ=resultSetDetail.getString("SNLCZ");
            SDJCZ=resultSetDetail.getString("SDJCZ");
            SLL=resultSetDetail.getString("SLL");
            SXD=resultSetDetail.getString("SXD");
            SCM=resultSetDetail.getString("SCM");
            SCCJ=resultSetDetail.getString("SCCJ");
            SPFJ=resultSetDetail.getString("SPFJ");
            SBZF=resultSetDetail.getString("SBZF");
            SDPURPRICE=resultSetDetail.getString("SDPURPRICE");
            SDPRICE=resultSetDetail.getString("SDPRICE");
            //SCREASERATE=resultSetDetail.getString("SCREASERATE");
            SMZQ=resultSetDetail.getString("SMZQ");
            STHZQ=resultSetDetail.getString("STHZQ");
            // SHSJ=resultSetDetail.getString("SHSJ");
            SYEAR=resultSetDetail.getString("SYEAR");
            //SIMG=resultSetDetail.getString("SIMG");
            SREMARK0=resultSetDetail.getString("SREMARK");
            SISDEL0=resultSetDetail.getString("SISDEL");
            SUPDATER0=resultSetDetail.getString("SUPDATER");
            SUPDATE0=resultSetDetail.getString("SUPDATE");
            SCOLORCARD=resultSetDetail.getString("SCOLORCARD");
            SCATEGORY=resultSetDetail.getString("SCATEGORY");

            WebElement eSDROWNO=WebElementUtils.findElement(GoodsPage.hh);
            String strSDROWNO=eSDROWNO.getAttribute("value");//"行号
            if (eSDROWNO.isDisplayed()) {//若元素disabled=true，则需要去掉此属性，否则会提示无效的元素（org.openqa.selenium.InvalidElementStateException: invalid element state:）
                Actions.RemoveAttribute(eSDROWNO, driver, "disabled");
            }
            String strSDGDID=WebElementUtils.findElement(GoodsPage.spbm).getAttribute("value");	//商品编码
            String strSWMID=WebElementUtils.findElement(GoodsPage.jyfs).getAttribute("value");	//经营方式
            String strSBUYER="0";		//买手
            String strSAREA=WebElementUtils.findElement(GoodsPage.qy).getAttribute("value");	//区域
            String strSORIGIN=WebElementUtils.findElement(GoodsPage.cd).getAttribute("value");	//产地
            String strSEASON=WebElementUtils.findElement(GoodsPage.jjie).getAttribute("value");	//季节
            WebElement eGYS=WebElementUtils.findElement(GoodsPage.GYSValue);
            String strSUPID=eGYS.getAttribute("value");	//供应商
            if (eGYS.isDisplayed()) {
                Actions.RemoveAttribute(eGYS, driver, "disabled");
            }
            WebElement epp=WebElementUtils.findElement(GoodsPage.ppValue);
            String  strSBRAND=epp.getAttribute("value");	//品牌
            if (epp.isDisplayed()) {
                Actions.RemoveAttribute(epp, driver, "disabled");
            }
            String strSCCODE=WebElementUtils.findElement(GoodsPage.gshh).getAttribute("value");	//公司货号
            String strSVCODE=WebElementUtils.findElement(GoodsPage.cshh).getAttribute("value");	//厂商货号
            WebElement eyy=WebElementUtils.findElement(GoodsPage.ysValue);
            String strSCOLOR=eyy.getAttribute("value");	//颜色
            if (eyy.isDisplayed()) {
                Actions.RemoveAttribute(eyy, driver, "disabled");
            }
            String strSNAME=WebElementUtils.findElement(GoodsPage.pm).getAttribute("value");	///品名
            String strSSEX=WebElementUtils.findElement(GoodsPage.xb).getAttribute("value");		//性别
            WebElement exl=WebElementUtils.findElement(GoodsPage.xlValue);
            String strSERIES=exl.getAttribute("value");	//系列
            if (exl.isDisplayed()) {
                Actions.RemoveAttribute(exl, driver, "disabled");
            }
            String strSGX=WebElementUtils.findElement(GoodsPage.gx).getAttribute("value");	//跟型
            String strSGG=WebElementUtils.findElement(GoodsPage.gg).getAttribute("value");	//跟高
            String strSDX=WebElementUtils.findElement(GoodsPage.dx).getAttribute("value");		//底型
            WebElement exk=WebElementUtils.findElement(GoodsPage.xkValue);
            String strSXK=exk.getAttribute("value");		//鞋口
            if (exk.isDisplayed()) {
                Actions.RemoveAttribute(exk, driver, "disabled");
            }
            String strSBG=WebElementUtils.findElement(GoodsPage.bg).getAttribute("value");	//帮高
            String strSML=WebElementUtils.findElement(GoodsPage.ml).getAttribute("value");		//面料
            WebElement enl=WebElementUtils.findElement(GoodsPage.nlValue);
            String strSNL=WebElementUtils.findElement(GoodsPage.nlValue).getAttribute("value");		//内里
            if (enl.isDisplayed()) {
                Actions.RemoveAttribute(enl, driver, "disabled");
            }
            String strSJG=WebElementUtils.findElement(GoodsPage.jg).getAttribute("value");		//激光
            String strSMK=WebElementUtils.findElement(GoodsPage.mk).getAttribute("value");		//毛口
            String strSLZ=WebElementUtils.findElement(GoodsPage.lz).getAttribute("value");	//亮钻
            String strSSK=WebElementUtils.findElement(GoodsPage.sk).getAttribute("value");	//饰扣
            String strSNLCZ=WebElementUtils.findElement(GoodsPage.nlcz).getAttribute("value");	//内里材质
           String strSDJCZ=WebElementUtils.findElement(GoodsPage.djcz).getAttribute("value");	//垫脚材质
            String strSLL=WebElementUtils.findElement(GoodsPage.ll).getAttribute("value");	//拉链
            String  strSXD=WebElementUtils.findElement(GoodsPage.jd).getAttribute("value");//系带
            String strSCM=WebElementUtils.findElement(GoodsPage.xiema).getAttribute("value");//尺码
            String strSCCJ=WebElementUtils.findElement(GoodsPage.ccj).getAttribute("value");	//出厂价
            String strSPFJ=WebElementUtils.findElement(GoodsPage.pfsj).getAttribute("value");	//"批发价
            String strSBZF=WebElementUtils.findElement(GoodsPage.bzf).getAttribute("value");	//包装费
            String strSDPURPRICE=WebElementUtils.findElement(GoodsPage.jj).getAttribute("value");	//进价
            // String strSDPRICE=WebElementUtils.findElement(GoodsPage.sj).getAttribute("value");;	//售价
            //String strSCREASERATE=WebElementUtils.findElement(GoodsPage.jjv).getAttribute("value");	//加价率

            String strSUPDATER0=sid;	//操作员

            System.out.println("行号："+SDROWNO);
            Assert.assertEquals(SDROWNO,strSDROWNO,"行号错误");
            Assert.assertEquals(SDGDID,strSDGDID,"商品编码错误");
            Assert.assertEquals(SWMID,strSWMID,"经营方式错误");
            Assert.assertEquals(SBUYER,strSBUYER,"买手错误");
            Assert.assertEquals(SAREA,strSAREA,"区域错误");
            Assert.assertEquals(SORIGIN,strSORIGIN,"产地错误");
            Assert.assertEquals(SEASON,strSEASON,"季节错误错误");


            Assert.assertEquals(SUPID,strSUPID,"供应商错误");
            Assert.assertEquals(SBRAND,strSBRAND,"品牌错误");
            Assert.assertEquals(SCCODE.trim(),strSCCODE.trim(),"公司货号错误");

            Assert.assertEquals(SVCODE,strSVCODE,"厂商货号错误");
            Assert.assertEquals(SCOLOR,strSCOLOR,"颜色错误");
            Assert.assertEquals(SNAME,strSNAME,"品名错误");

            Assert.assertEquals(SSEX,strSSEX,"性别错误");
            Assert.assertEquals(SERIES,strSERIES,"系列错误");
            Assert.assertEquals(SGX,strSGX,"跟型错误");
            Assert.assertEquals(SGG,strSGG,"跟高错误");
            Assert.assertEquals(SDX,strSDX,"底型错误");
            Assert.assertEquals(SXK,strSXK,"鞋口错误");

            Assert.assertEquals(SBG,strSBG,"帮高错误");
            Assert.assertEquals(SML,strSML,"面料错误");
            Assert.assertEquals(SNL,strSNL,"内里错误");
            Assert.assertEquals(SJG,strSJG,"激光错误");
            Assert.assertEquals(SMK,strSMK,"毛口错误");
            Assert.assertEquals(SLZ,strSLZ,"亮钻错误");

            Assert.assertEquals(SSK,strSSK,"饰扣错误");
            Assert.assertEquals(SNLCZ,strSNLCZ,"内里材质错误");
            Assert.assertEquals(SDJCZ,strSDJCZ,"垫脚材质错误");
            Assert.assertEquals(SXD,strSXD,"系带错误");
            Assert.assertEquals(SCM,strSCM,"尺码错误");
            Assert.assertEquals(SCCJ,strSCCJ,"出厂价错误");

            Assert.assertEquals(SPFJ,strSPFJ,"批发售价错误");
            Assert.assertEquals(SBZF,strSBZF,"包装费错误");
            Assert.assertEquals(SDPURPRICE,strSDPURPRICE,"进价错误");
            Assert.assertEquals(SMZQ.substring(0,10),strSMZQ,"生命周期错误");
            Assert.assertEquals(STHZQ.substring(0,10),strSTHZQ,"退货周期错误");
            Assert.assertEquals(SYEAR.substring(0,4),strSYEAR.substring(0,4),"年份错误");
            Assert.assertEquals(SISDEL0,"0","是否删除错误");
            Assert.assertNotNull(SUPDATE0,"操作时间错误");

        }
        oracleConnection.close();
        SeleniumDriver.driver.switchTo().parentFrame();
        Actions.click(GoodsPage.insertClose);
        SeleniumDriver.driver.switchTo().defaultContent();
    }
//    审核
    @Test
    public  void  goodsShenHe() throws InterruptedException, SQLException, IOException, ClassNotFoundException {
//    操作
        String DJBH="";
        WebElement webElement1 = WebElementUtils.findElement(GoodsPage.iframe);
        SeleniumDriver.driver.switchTo().frame(webElement1);
        Actions.click(GoodsPage.selectClick);
        logger.info("选中："+ WebElementUtils.findElement(GoodsPage.liebiao1).getText());
        if ( WebElementUtils.findElement(GoodsPage.liebiao1).getText().equals("1")) {
            logger.info("选中");
            Thread.sleep(3000);
            Actions.click(GoodsPage.liebiao1Selected);
           DJBH=WebElementUtils.findElement(GoodsPage.lbDJBH).getText();
        }

        Actions.click(GoodsPage.checkClick);// //*[@id="layui-layer11"]/div[3]/a[1]     //*[@id="layui-layer3"]/div[3]/a[1]
        // WebElement webElement = WebElementUtils.findElementEqual(DdPage.shQD1,DdPage.shQD2,DdPage.shQD3,DdPage.shQD5);
        WebElement webElement = WebElementUtils.findElement(GoodsPage.shQD);
        webElement.click();
//  验证数据库是否审核成功。

        OracleConnection  oracleConnection = new OracleConnection();  //*[@id="layui-layer1"]/span/a     //*[@id="layui-layer-shade2"]   /html/body/section/div
        ResultSet resultSet =oracleConnection.querySql("select * from GOODSIMPORTHEAD  where SBILLNO='"+DJBH+"'");
        String SFLAG="";
        String SAUDITOR="";
        String SAUDITDATE="";
        while (resultSet.next()) {
            SFLAG = resultSet.getString("SFLAG");
            SAUDITOR = resultSet.getString("SAUDITOR");
            SAUDITDATE=resultSet.getString("SAUDITDATE");
        }

        sid =LoginUserInfo.loginUserInfo(LoginUserInfo.username) ;


        Assert.assertEquals("Y",SFLAG.trim(),"审核标志错误");
        Assert.assertEquals(SAUDITOR, sid,"审核员错误");
        Assert.assertNotNull(SAUDITDATE,"审核时间为空");
        String  textYZ= WebElementUtils.findElement(GoodsPage.textYZ).getText();
        logger.info(textYZ);
        Assert.assertEquals(textYZ,"操作成功","商品录入单页面审核失败！");
        SeleniumDriver.driver.switchTo().defaultContent();

    }
    @DataProvider(name="userList")
    public Object[][] test2()
    {
        return GoodsInfo.Object;

    }

    //查询
    @Test  (dataProvider = "userList")
    public   void selectInfo(String sSBILLNO,String sCHECK,String sSPBM,String sHH,String sPP,String sGYS,String sLRSJ1,String sLRSJ2,int isImport) throws SQLException, IOException, ClassNotFoundException, InterruptedException {
        WebElement webElement1 = WebElementUtils.findElement(GoodsPage.iframe);
        SeleniumDriver.driver.switchTo().frame(webElement1);
        Thread.sleep(4000);
        Actions.click(GoodsPage.selectClick);
//        输入查询条件，及书写查询条件
        String strWhere=" where (1=1)";
        String wheresCHECK="";
        if(sSBILLNO.length()>0){
            strWhere+=" and SBILLNO like '%"+sSBILLNO+"%'";
            WebElementUtils.findElement(GoodsPage.sSBILLNO).sendKeys(sSBILLNO);
        }
        if(sCHECK.length()>0){
            strWhere+=" and SFLAG='"+sCHECK+"'";

            WebElement webElement= WebElementUtils.findElement(GoodsPage.sSFLAG);
            Select select=new Select(webElement);
            select.selectByValue(""+sCHECK+"");
            strWhere+=wheresCHECK;
        }
        else
        {
            strWhere+="and  SFLAG='N'";

        }


        if(sLRSJ1.length()>0&&sLRSJ2.length()==0){ WebElementUtils.findElement(GoodsPage.sStartdate).sendKeys(sLRSJ1.substring(0,10));
            strWhere+=" and SINPUTDATE >to_date('"+sLRSJ1+"','yyyy/mm/dd hh24:mi:ss')";
        }
        if(sLRSJ2.length()>0&&sLRSJ1.length()==0){   WebElementUtils.findElement(DdPage.senddate).sendKeys(sLRSJ2.substring(0,10));
            strWhere+=" and SINPUTDATE <to_date('"+sLRSJ2+"','yyyy/mm/dd hh24:mi:ss')";
        }


        if(sLRSJ1.length()>0&&sLRSJ2.length()>0){
            WebElementUtils.findElement(GoodsPage.sStartdate).sendKeys(sLRSJ1.substring(0,10));
            WebElementUtils.findElement(DdPage.senddate).sendKeys(sLRSJ2.substring(0,10));
            strWhere+=" and SINPUTDATE between  to_date('"+sLRSJ1+"','yyyy/mm/dd hh24:mi:ss') and to_date('"+sLRSJ2+"','yyyy/mm/dd hh24:mi:ss')";
        }

        if(sSPBM.length()>0){
            WebElementUtils.findElement(GoodsPage.sSDGDID).sendKeys(sSPBM);
            strWhere+=" and exists (select b.sdbillno  from SBORDERDETAIL b  where b.SDGDID like '%"+sSPBM+"%')";
        }



        Actions.click(GoodsPage.selectClick);//点了2次才有效果
        Thread.sleep(3000);
        int trNum=0;
        int tdNum=0;
        int  totalNum=0;
        String strSBILLNO="";
        String strSREMARK="";
        String strSAUDITDATE="";
        String strSAUDITOR="";
        String strSINPUTDATE="";
        String strSINPUTOR="";
        String strSTOQTY="";
        String strSTOPURPRICE="";
        String strSTOPRICE="";
        WebElement table=WebElementUtils.findElement(GoodsPage.ddTable);
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        logger.info("首页总行数："+rows.size());
        for(WebElement row:rows){


            //获取第一行的值
            if(trNum==1)//第二行开始为内容
            {

                List<WebElement> col = row.findElements(By.tagName("td"));
                logger.info("第一行总列数："+col.size());
                for(WebElement cell:col){
                    //获取第一行的序列值，及文本值

                    totalNum=Integer.parseInt(col.get(0).getText());
                    strSBILLNO=col.get(2).getText();
                    strSREMARK=col.get(3).getText();
                    strSAUDITDATE=col.get(4).getText();
                    strSAUDITOR=col.get(5).getText();
                    if(strSAUDITOR.trim().length()==0){strSAUDITOR="0";}
                    strSINPUTDATE=col.get(6).getText();
                    strSINPUTOR=col.get(7).getText();


                }
            }
            trNum++;
        }

        Actions.click(GoodsPage.wy);//点击【尾页】
        WebElement table1=WebElementUtils.findElement(GoodsPage.ddTable);
        List<WebElement> rows1 = table1.findElements(By.tagName("tr"));
//        分页只能读取当前页的行数，所以要点击尾页，获取最后一列的值。
        logger.info("最后一页多少行："+rows1.size());
        int  trNum0=0;
        for(WebElement row1:rows1){
            trNum0++;
            //最后一行
            if(rows1.size()==trNum0)
            {
                List<WebElement> col = row1.findElements(By.tagName("td"));
                for(WebElement cell:col){
                    tdNum++;
                    //获取最后一行的序列值，及文本值
                    if(col.size()==tdNum) {

                        totalNum=Integer.parseInt(col.get(0).getText());

                    }

                }
            }


        }

        int  num=0;
        String SBILLNO="";
        String SREMARK="";
        String SAUDITDATE="";
        String SAUDITOR="";
        String SINPUTDATE="";
        String SINPUTOR="";
        String STOQTY="";
        String STOPURPRICE="";
        String STOPRICE="";
        oracleConnection = new OracleConnection();


//        select (select  sname from SYSUSER where SNUM='000010') as sname,a.*  from SBORDERHEAD a  where SBILLNO='DD2019011700001'
        ResultSet resultSet =oracleConnection.querySql("select to_char(SAUDITDATE,'yyyy-mm-dd hh24:mi:ss')  as SAUDITDATE ,to_char(SINPUTDATE,'yyyy-mm-dd hh24:mi:ss')  as SINPUTDATE, (select  sname from SYSUSER where Sid=a.SINPUTOR) as SINPUTORname,(select  sname from SYSUSER where Sid=a.SAUDITOR) as SAUDITORname,a.* from GOODSIMPORTHEAD a   "+strWhere);


        while (resultSet.next()) {
//            比较的是最后一列
            if(strSBILLNO.trim().equals(resultSet.getString("SBILLNO").trim())){

                SBILLNO=resultSet.getString("SBILLNO");
                SREMARK=resultSet.getString("SREMARK");        if(SREMARK==null){SREMARK="";}
                SAUDITDATE=resultSet.getString("SAUDITDATE");if(SAUDITDATE==null){SAUDITDATE="";}
                if(SAUDITDATE.length()==21){
                    SAUDITDATE=SAUDITDATE.substring(0,19);

                }
                SAUDITOR=resultSet.getString("SAUDITORname");if(SAUDITOR==null){SAUDITOR="0";}
                SINPUTDATE=resultSet.getString("SINPUTDATE").trim();if(SINPUTDATE==null){SINPUTDATE="";}
                if(SINPUTDATE.length()==21){
                    SINPUTDATE=SINPUTDATE.substring(0,19);
                }
                SINPUTOR=resultSet.getString("SINPUTORname");if(SINPUTOR==null){SINPUTOR="";}

            }
            num++;

        }
        resultSet.last();//直接执行跳到结果集的最后一行
        num =resultSet.getRow(); //这一句就能得到结果集的行数
        resultSet.beforeFirst();  //重新执行到第一行的前一行，以便查询结果集的集体内容
        logger.info("数据表总行数num："+num);
        Assert.assertEquals(totalNum,num,"页面数据条数和数据表条数不一致");
        Assert.assertEquals(strSBILLNO,SBILLNO,"单据编号错误");
        Assert.assertEquals(strSREMARK,SREMARK,"备注错误");
        //设置要获取到什么样的时间

        Assert.assertEquals(strSAUDITDATE,SAUDITDATE,"审核日期错误");
        Assert.assertEquals(strSAUDITOR,SAUDITOR,"审核员错误");
        Assert.assertEquals(strSINPUTDATE,SINPUTDATE,"录入日期错误");
        Assert.assertEquals(strSINPUTOR,SINPUTOR,"录入员错误");



//----开始验证导出  isImport:0为不运行，1为运行
        if(isImport==1){
             /*1,在selenium启动浏览器前，为其配置好默认下载文件夹

    2,点击导出后，判断此默认文件夹下是否有这个文件。

    3,如果需要判断Excel内容，则需要能够处理Excel的架包以及用自己合适的方法去匹配Excel里的内容。*/
            ExcelUnit excelUnit=new ExcelUnit();
            File[] list0=new File("D:\\selenium\\Downloads").listFiles();
            int fileCount0=list0.length; //未点击前的文件数目
            System.out.println("文件夹名字："+fileCount0);
       /* WebElement imWebElement = WebElementUtils.findElement(DdPage.iframe);
        SeleniumDriver.driver.switchTo().frame(imWebElement);
        WebElementUtils.findElement(DdPage.selectClick).click();*/
            WebElementUtils.findElement(DdPage.daochu).click();
            Thread.sleep(8000);
            int fileCount=0;
            String  fileName="";
            File [] list=new File("D:\\selenium\\Downloads").listFiles();
            for(File file:list){
                if(file.isFile())
                {
                    fileCount++;
                    if(fileCount==list.length){ fileName= file.getName().substring(0,21);
                        System.out.println("文件夹名字："+fileName);
                    }

                }
            }

            System.out.println("文件夹个数："+fileCount);
//        Object  强制转换为HashMap
            HashMap<String,String>[][] map = (HashMap<String, String>[][]) excelUnit.testDate("D:\\selenium\\Downloads\\"+fileName,1);//因为有列表题目，所以是从第二行开始的，，索引值是1开始
            int  dateTotal=(map.length-1);//数据从第二行开始
            System.out.println("excle总行数："+map.length);
            String imSBILLNO=map[0][0].get("单据编号");
            if(imSBILLNO==null){imSBILLNO="";}
            String imSFLAG=map[0][0].get("状态");
            if(imSFLAG==null){imSFLAG="";}
            String imSINPUTOR=map[0][0].get("录入员");
            if(imSINPUTOR==null){imSINPUTOR="";}
            String imSINPUTDATE=map[0][0].get("录入日期");
            if(imSINPUTDATE==null){imSINPUTDATE="";}
            String imSAUDITOR=map[0][0].get("审核员");
            if(imSAUDITOR==null){imSAUDITOR="";}
            String imSAUDITDATE=map[0][0].get("审核日期");
            if(imSAUDITDATE==null){imSAUDITDATE="";}
            Assert.assertEquals(imSBILLNO,SBILLNO,"单据编号错误");
            String createdate1="";
            if(imSAUDITDATE.length()>0) {        //设置要获取到什么样的时间
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                //获取String类型的时间  2019/2/18 9:32:00 转换为 2019-02-18 09:32:00
                Date imSAUDITDATEDate = new Date(imSAUDITDATE);
                createdate1 = sdf1.format(imSAUDITDATEDate);
                logger.info("录入日期:" + createdate1);
            }
            Assert.assertEquals(createdate1,SAUDITDATE,"审核日期错误");
            if(SAUDITOR=="0"){SAUDITOR="";}
            Assert.assertEquals(imSAUDITOR,SAUDITOR,"审核员错误");

            //设置要获取到什么样的时间
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            //获取String类型的时间  2019/2/18 9:32:00 转换为 2019-02-18 09:32:00
            String createdate="";
            if(imSINPUTDATE.length()>0){
            Date imSINPUTDATEDate = new Date(imSINPUTDATE);
             createdate = sdf.format(imSINPUTDATEDate);
            }
            logger.info("录入日期:"+createdate);
            Assert.assertEquals(createdate,SINPUTDATE,"录入日期错误");
            if(SINPUTOR=="0"){SINPUTOR="";}
            Assert.assertEquals(imSINPUTOR,SINPUTOR,"录入员错误");
            Assert.assertEquals(fileCount0+1,fileCount,"订单导出失败");
            Assert.assertEquals(dateTotal,totalNum,"导出总条数和页面总条数不一致");
            logger.info("订单总条数和列表内容验证通过");
        }
        //----导出验证结束

        // 查询完后内容要清空
        WebElementUtils.findElement(GoodsPage.sSBILLNO).clear();
        WebElementUtils.findElement(GoodsPage.sStartdate).clear();
        WebElementUtils.findElement(GoodsPage.sEnddate).clear();
        WebElementUtils.findElement(GoodsPage.sSDGDID).clear();
        oracleConnection.close();
        SeleniumDriver.driver.switchTo().defaultContent();

    }

    @AfterTest
    public   void quitTest() throws InterruptedException, SQLException {
        //关闭数据库
//      浏览器关闭
SeleniumDriver.closedAll();
    }
}
