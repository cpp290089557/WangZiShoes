package Headquarters;

import DbConnect.OracleConnection;
import Information.DdInfo;
import actions.Actions;
import drivers.SeleniumDriver;
import findElements.WebElementUtils;
import Information.LoginUserInfo;

import log4j.LoggerControler;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import pages.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import tools.ExcelUnit;

import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Administrator on 2019/1/16.
 */
public  class DdTest  {
    final static LoggerControler logger = LoggerControler.getLogger(DdTest.class);
    OracleConnection oracleConnection;
    String  sid="";
//    登录
   @BeforeTest
    public   void  loginTest() throws InterruptedException {
       LoginUserInfo.login(0);
       LoginUserInfo.clickDjTest(MenuPage.dd);

    }

    //  新增
    @Test
    public   void  InsertDdTest() throws InterruptedException, SQLException, IOException, ClassNotFoundException {
//   将控制权转交给iframe
        WebElement webElement1 = WebElementUtils.findElement(DdPage.iframe);
        SeleniumDriver.driver.switchTo().frame(webElement1);
        Actions.click(DdPage.xzClick);
 //控制权转交给弹出页面的iframe
        WebElement webElement2 = WebElementUtils.findElement(DdPage.iframeInsert1);
        SeleniumDriver.driver.switchTo().frame(webElement2);
        //输入门店，设置门店value值
        Actions.sendTest(DdPage.md, DdInfo.md);
        WebElement webElement=WebElementUtils.findElement(DdPage.mdValue);
        Actions.setAttribute(webElement, SeleniumDriver.driver, "value", DdInfo.mdValue);
        logger.info("value属性值："+webElement.getAttribute("value"));
 //输入商品编码
        Actions.sendTest(DdPage.spbm,DdInfo.spbh);
        WebElementUtils.findElement(DdPage.spbm).sendKeys(Keys.ENTER);
//      选择码号数量
        WebElementUtils.findElement(DdPage.mhnum).click();
        //控制权转交给弹出的鞋码页面（由于这里弹出的两层页面有2个iframe，且id一样，所以这里不能用id定位）
        WebElement webElement3= WebElementUtils.findElement(XieMaPage.xmIframe);
        SeleniumDriver.driver.switchTo().frame(webElement3);
        Actions.sendTest(XieMaPage.xm33,DdInfo.xm33);
        Actions.sendTest(XieMaPage.xm34,DdInfo.xm34);
        Actions.sendTest(XieMaPage.xm35,DdInfo.xm35);
        Actions.sendTest(XieMaPage.xm36,DdInfo.xm36);
        Actions.sendTest(XieMaPage.xm37,DdInfo.xm37);
        Actions.sendTest(XieMaPage.xm38,DdInfo.xm38);
        Actions.sendTest(XieMaPage.xm39,DdInfo.xm39);
        Actions.sendTest(XieMaPage.xm40,DdInfo.xm40);
        Actions.sendTest(XieMaPage.xm41,DdInfo.xm41);

        //保存hmd的数据，稍后验证字段是否存入成功要用到，那时没有办法获取鞋码页面的值
        String hmd="";
        int num=0;
        if (!WebElementUtils.findElement(XieMaPage.xm33).getAttribute("value").trim().equals("")) {
            hmd= WebElementUtils.findElement(XieMaPage.tm33).getText().trim()+"#"+WebElementUtils.findElement(XieMaPage.xm33).getAttribute("value").trim();
            num++;
        }
        if (!WebElementUtils.findElement(XieMaPage.xm34).getAttribute("value").trim().equals("")) {
            if (num >= 1) {
                hmd+=",";
            }
            hmd+= WebElementUtils.findElement(XieMaPage.tm34).getText().trim()+"#"+WebElementUtils.findElement(XieMaPage.xm34).getAttribute("value").trim();
            num++;
        }
        if (!WebElementUtils.findElement(XieMaPage.xm35).getAttribute("value").trim().equals("")) {
            if (num >= 1) {
                hmd+=",";
            }
            hmd+= WebElementUtils.findElement(XieMaPage.tm35).getText().trim()+"#"+WebElementUtils.findElement(XieMaPage.xm35).getAttribute("value").trim();
            num++;
        }
        if (!WebElementUtils.findElement(XieMaPage.xm36).getAttribute("value").trim().equals("")) {
            if (num >= 1) {
                hmd+=",";
            }
            hmd+= WebElementUtils.findElement(XieMaPage.tm36).getText().trim()+"#"+WebElementUtils.findElement(XieMaPage.xm36).getAttribute("value").trim();
            num++;
        }
        if (!WebElementUtils.findElement(XieMaPage.xm37).getAttribute("value").trim().equals("")) {
            if (num >= 1) {
                hmd+=",";
            }
            hmd+= WebElementUtils.findElement(XieMaPage.tm37).getText().trim()+"#"+WebElementUtils.findElement(XieMaPage.xm37).getAttribute("value").trim();
            num++;
        }
        if (!WebElementUtils.findElement(XieMaPage.xm38).getAttribute("value").trim().equals("")) {
            if (num >= 1) {
                hmd+=",";
            }
            hmd+= WebElementUtils.findElement(XieMaPage.tm38).getText().trim()+"#"+WebElementUtils.findElement(XieMaPage.xm38).getAttribute("value").trim();
            num++;
        }
        if (!WebElementUtils.findElement(XieMaPage.xm39).getAttribute("value").trim().equals("")) {
            if (num >= 1) {
                hmd+=",";
            }
            hmd+= WebElementUtils.findElement(XieMaPage.tm39).getText().trim()+"#"+WebElementUtils.findElement(XieMaPage.xm39).getAttribute("value").trim();
            num++;
        }
        if (!WebElementUtils.findElement(XieMaPage.xm40).getAttribute("value").trim().equals("")) {
            if (num >= 1) {
                hmd+=",";
            }
            hmd+= WebElementUtils.findElement(XieMaPage.tm40).getText().trim()+"#"+WebElementUtils.findElement(XieMaPage.xm40).getAttribute("value").trim();
            num++;
        }
        if (!WebElementUtils.findElement(XieMaPage.xm41).getAttribute("value").trim().equals("")) {
            if (num >= 1) {
                hmd+=",";
            }
            hmd+= WebElementUtils.findElement(XieMaPage.tm41).getText().trim()+"#"+WebElementUtils.findElement(XieMaPage.xm41).getAttribute("value").trim();
            num++;
        }

        Actions.click(XieMaPage.saveBtn);
        //控制权转交回给弹出的新增页面
        //方式一：
        //SeleniumDriver.driver.switchTo().defaultContent();
        //SeleniumDriver.driver.switchTo().frame(webElement1);
       // WebElement webElement11 = WebElementUtils.findElement(DdPage.iframeInsert1);
        //SeleniumDriver.driver.switchTo().frame(webElement11);
//        方式二：
        SeleniumDriver.driver.switchTo().parentFrame();

        logger.info("开始进入数据库");
         oracleConnection = new OracleConnection();
        ResultSet resultSet = oracleConnection.querySql("select count(*) as  numTotal from sborderhead");
        int num1=0;
        while (resultSet.next()) {
             num1 = resultSet.getInt("numTotal") + 1;
        }
        logger.info("添加前："+num1);
        Actions.click(DdPage.saveClick);
        //数据插入数据库需要时间
        Thread.sleep(7000);
        //订单表：sborderhead  订单明细表： sborderdetail
            logger.info("开始进入数据库");
            ResultSet resultSet1 = oracleConnection.querySql("select count(*) as  numTotal from sborderhead");
        int num2=0;
        while (resultSet1.next()) {
             num2 = resultSet1.getInt("numTotal");
        }
        logger.info("添加后："+num2);
        Assert.assertEquals(num1,num2,"保存失败");
        String  strSBILLNO=WebElementUtils.findElement(DdPage.dndh).getAttribute("value");
        //判断页面内容与数据库字段是否一致

            //门市：0002  ，商品编码：2028392
//  门市：      商品编码：2000336

//        判断新增订单数据是否正确
        sid =LoginUserInfo.loginUserInfo(LoginUserInfo.username) ;
//        logger.info("用户id："+sid);
/*        SBILLNO	单据编号	VARCHAR2
        SFLAG	审核标志 Y 已审核 N未审核	CHAR
        STOPRICE	售价合计	NUMBER
        STOPURPRICE	进价合计	NUMBER
        STOQTY	数量合计	NUMBER
        SINPUTOR	录入员	NUMBER
        SINPUTDATE	录入时间	DATE
        SUPDATER	操作员	NUMBER
        SUPDATE	操作时间	DATE
        SAUDITOR	审核员	NUMBER
        SAUDITDATE	审核日期	DATE
        SREMARK	备注	VARCHAR2
        SISDEL	是否删除	CHAR*/

        String SBILLNO="";
        String SFLAG="";
        double STOPRICE=0;
        double STOPURPRICE=0;
        double STOQTY=0;
        String SINPUTOR="";
        String  SINPUTDATE="";
        String SUPDATER="";
        String  SUPDATE="";
        String SAUDITOR="";
        String  SAUDITDATE="";
        String  SREMARK="";
        String  SISDEL="";
        ResultSet resultSetHead = oracleConnection.querySql("select * from sborderhead  where SBILLNO='"+strSBILLNO+"'");
        while (resultSetHead.next()) {
            //数据表内容为null时，不能去空格
            SBILLNO = resultSetHead.getString("SBILLNO");
            SFLAG = resultSetHead.getString("SFLAG");
            STOPRICE = resultSetHead.getDouble("STOPRICE");
            STOPURPRICE = resultSetHead.getDouble("STOPURPRICE");
            STOQTY = resultSetHead.getDouble("STOQTY");
            SINPUTOR = resultSetHead.getString("SINPUTOR");
            SINPUTDATE=resultSetHead.getString("SINPUTDATE");
            SUPDATER = resultSetHead.getString("SUPDATER");
            SUPDATE=resultSetHead.getString("SUPDATE");
            SAUDITOR = resultSetHead.getString("SAUDITOR");
            SAUDITDATE=resultSetHead.getString("SAUDITDATE");
            SREMARK=resultSetHead.getString("SREMARK");
            SISDEL=resultSetHead.getString("SISDEL");
        }

      //  Double sjTotal0T =new Double(WebElementUtils.findElement(DdPage.sjTotal0).getAttribute("value").trim());
        Double jjTotal0T =new Double(WebElementUtils.findElement(DdPage.jjTotal0).getText().trim());
        Double numTotal0T =new Double(WebElementUtils.findElement(DdPage.numTotal0).getText().trim());
        Assert.assertEquals("N",SFLAG.trim(),"审核标志错误");
     //  Assert.assertEquals(STOPRICE,sjTotal0T ,"售价合计错误");
        logger.info("进价合计数据库:"+STOPURPRICE);
     logger.info("进价合计:"+jjTotal0T);
        Assert.assertEquals(STOPURPRICE,jjTotal0T,"进价合计错误");
        Assert.assertEquals(STOQTY,numTotal0T,"数量合计错误");
        Assert.assertEquals(SINPUTOR,sid,"录入员错误");
        Assert.assertNotNull(SINPUTDATE,"录入时间为空");
        Assert.assertEquals(SUPDATER,sid,"操作员错误");
        Assert.assertNotNull(SUPDATE,"操作时间为空");
        Assert.assertEquals(SAUDITOR, "0","审核员错误");
        Assert.assertEquals(SAUDITDATE, null,"审核时间错误");//数据库是空的话，则是null
        Assert.assertEquals(SREMARK,null,"备注错误");
        Assert.assertEquals(SISDEL,"0","是否删除错误");
        //比较明细
       /* SDBILLNO	单据编号	VARCHAR2
        SDROWNO	行号	NUMBER
        SDGDID	商品编码	VARCHAR2
        SDPRICE	售价	NUMBER
        SDPURPRICE	进价	NUMBER
        SDTOPRICE	售价合计	NUMBER
        SDTOPURPRICE	进价合计	NUMBER
        SDTOQTY	数量合计	NUMBER
        SDMHD	码号段	VARCHAR2
        SDREMARK	备注	VARCHAR2
        SISDEL	是否删除	CHAR
        SMARKET	门店	VARCHAR2
        SUPDATER	操作员	NUMBER
        SUPDATE	操作时间	DATE
        SBUYER	买手	NUMBER
*/

        ResultSet resultSetDetail = oracleConnection.querySql(" select * from sborderdetail  where SDBILLNO='"+SBILLNO+"'");

        while (resultSetDetail.next()) {

            String SDBILLNO="";
            int SDROWNO=0;
            String SDGDID="";
            double SDPRICE=0;
            double SDPURPRICE=0;
            double SDTOPRICE=0;
            double SDTOPURPRICE=0;
            double SDTOQTY=0;
            String SDMHD="";
            String SDREMARK="";
            String SISDEL1="";
            String SMARKET="";
            String SBUYER="";
            SDGDID = resultSetDetail.getString("SDGDID");
            SDPRICE=resultSetDetail.getDouble("SDPRICE");
            SDPURPRICE=resultSetDetail.getDouble("SDPURPRICE");
            SDTOPRICE=resultSetDetail.getDouble("SDTOPRICE");
            SDTOPURPRICE=resultSetDetail.getDouble("SDTOPURPRICE");
            SDTOQTY=resultSetDetail.getDouble("SDTOQTY");
            SDMHD = resultSetDetail.getString("SDMHD");
            SDREMARK=resultSetDetail.getString("SDREMARK");
            SISDEL= resultSetDetail.getString("SISDEL");
            SMARKET= resultSetDetail.getString("SMARKET");
            SUPDATER=resultSetDetail.getString("SUPDATER");
            SUPDATE=resultSetDetail.getString("SUPDATE");
            SBUYER=resultSetDetail.getString("SBUYER");
            String spbmT =WebElementUtils.findElement(DdPage.spbm).getAttribute("value").trim();
            Double sjT =new Double(WebElementUtils.findElement(DdPage.sj).getText().trim());

            Double jj0T =new Double(WebElementUtils.findElement(DdPage.jj0).getText().trim());

            Double sjTotalT =new Double(WebElementUtils.findElement(DdPage.sjTotal).getText().trim());

            Double jjTotalT =new Double(WebElementUtils.findElement(DdPage.jjTotal).getText().trim());
           Double slTotalT =new Double(WebElementUtils.findElement(DdPage.slTotal).getAttribute("value").trim());
            String mdValueT =WebElementUtils.findElement(DdPage.mdValue).getAttribute("value").trim();

           Assert.assertEquals(SDGDID,spbmT,"商品编码错误");
            Assert.assertEquals(SDPRICE,sjT,"售价错误");
            Assert.assertEquals(SDPURPRICE,jj0T,"进价错误");
            //Assert.assertEquals(SDTOPRICE,sjTotalT,"售价合计错误");
            Assert.assertEquals(SDTOPURPRICE,jjTotalT,"进价合计错误");

           Assert.assertEquals(SDTOQTY,slTotalT,"数量合计错误");


            Assert.assertEquals(SDMHD,hmd,"码号段错误");
            Assert.assertEquals(SDREMARK,null,"备注错误");
            Assert.assertEquals(SISDEL,"0","是否删除错误");
            Assert.assertEquals(SMARKET,mdValueT,"门店错误");
            Assert.assertEquals("0",SUPDATER,"操作员错误");
            Assert.assertNotNull(SUPDATE,"操作时间为空");
            String msT =WebElementUtils.findElement(DdPage.ms).getAttribute("value").trim();
            Assert.assertEquals(SBUYER,msT,"买手错误");


        }
        oracleConnection.close();
        //新增页面关闭，控制权交到主体页面
        SeleniumDriver.driver.switchTo().parentFrame();
        Actions.click(DdPage.ddClose);
       SeleniumDriver.driver.switchTo().defaultContent();

    }
//    修改
    @Test
    public  void  UpdateDdTest()  throws InterruptedException, SQLException, IOException, ClassNotFoundException {
        WebElement webElement1 = WebElementUtils.findElement(DdPage.iframe);
        SeleniumDriver.driver.switchTo().frame(webElement1);
        Actions.click(DdPage.selectClick);
        logger.info("选中："+ WebElementUtils.findElement(DdPage.liebiao1).getText());
        if ( WebElementUtils.findElement(DdPage.liebiao1).getText().equals("1")) {
            logger.info("选中");
            Actions.click(DdPage.liebiao1Selected);
        }
        Actions.click(DdPage.updateClick);

        //控制权转交给弹出页面的iframe
        WebElement webElement2 = WebElementUtils.findElement(DdPage.iframeInsert1);
        SeleniumDriver.driver.switchTo().frame(webElement2);
        //输入门店，设置门店value值
        Actions.sendTest(DdPage.md,DdInfo.mdU);
        WebElement webElement=WebElementUtils.findElement(DdPage.mdValue);
        Actions.setAttribute(webElement, SeleniumDriver.driver, "value", DdInfo.mdValueU);
        //输入商品编码
        Actions.sendTest(DdPage.spbm,DdInfo.spbhU);
        WebElementUtils.findElement(DdPage.spbm).sendKeys(Keys.ENTER);
//      选择码号数量
        WebElementUtils.findElement(DdPage.mhnum).click();
        //控制权转交给弹出的鞋码页面（由于这里弹出的两层页面有2个iframe，且id一样，所以这里不能用id定位）
        WebElement webElement3= WebElementUtils.findElement(XieMaPage.xmIframe);
        SeleniumDriver.driver.switchTo().frame(webElement3);
        Actions.sendTest(XieMaPage.xm33,DdInfo.xm33U);
        Actions.sendTest(XieMaPage.xm34,DdInfo.xm34U);
        Actions.sendTest(XieMaPage.xm35,DdInfo.xm35U);
        Actions.sendTest(XieMaPage.xm36,DdInfo.xm36U);
        Actions.sendTest(XieMaPage.xm37,DdInfo.xm37U);
        Actions.sendTest(XieMaPage.xm38,DdInfo.xm38U);
        Actions.sendTest(XieMaPage.xm39,DdInfo.xm39U);
        Actions.sendTest(XieMaPage.xm40,DdInfo.xm40U);
        Actions.sendTest(XieMaPage.xm41,DdInfo.xm41U);
        Actions.sendTest(XieMaPage.xm42,DdInfo.xm42U);

        String hmd="";
        int num=0;
        if (!WebElementUtils.findElement(XieMaPage.xm33).getAttribute("value").trim().equals("")) {
            hmd= WebElementUtils.findElement(XieMaPage.tm33).getText().trim()+"#"+WebElementUtils.findElement(XieMaPage.xm33).getAttribute("value").trim();
            num++;
        }
        if (!WebElementUtils.findElement(XieMaPage.xm34).getAttribute("value").trim().equals("")) {
            if (num >= 1) {
                hmd+=",";
            }
            hmd+= WebElementUtils.findElement(XieMaPage.tm34).getText().trim()+"#"+WebElementUtils.findElement(XieMaPage.xm34).getAttribute("value").trim();
            num++;
        }
        if (!WebElementUtils.findElement(XieMaPage.xm35).getAttribute("value").trim().equals("")) {
            if (num >= 1) {
                hmd+=",";
            }
            hmd+= WebElementUtils.findElement(XieMaPage.tm35).getText().trim()+"#"+WebElementUtils.findElement(XieMaPage.xm35).getAttribute("value").trim();
            num++;
        }
        if (!WebElementUtils.findElement(XieMaPage.xm36).getAttribute("value").trim().equals("")) {
            if (num >= 1) {
                hmd+=",";
            }
            hmd+= WebElementUtils.findElement(XieMaPage.tm36).getText().trim()+"#"+WebElementUtils.findElement(XieMaPage.xm36).getAttribute("value").trim();
            num++;
        }
        if (!WebElementUtils.findElement(XieMaPage.xm37).getAttribute("value").trim().equals("")) {
            if (num >= 1) {
                hmd+=",";
            }
            hmd+= WebElementUtils.findElement(XieMaPage.tm37).getText().trim()+"#"+WebElementUtils.findElement(XieMaPage.xm37).getAttribute("value").trim();
            num++;
        }
        if (!WebElementUtils.findElement(XieMaPage.xm38).getAttribute("value").trim().equals("")) {
            if (num >= 1) {
                hmd+=",";
            }
            hmd+= WebElementUtils.findElement(XieMaPage.tm38).getText().trim()+"#"+WebElementUtils.findElement(XieMaPage.xm38).getAttribute("value").trim();
            num++;
        }
        if (!WebElementUtils.findElement(XieMaPage.xm39).getAttribute("value").trim().equals("")) {
            if (num >= 1) {
                hmd+=",";
            }
            hmd+= WebElementUtils.findElement(XieMaPage.tm39).getText().trim()+"#"+WebElementUtils.findElement(XieMaPage.xm39).getAttribute("value").trim();
            num++;
        }
        if (!WebElementUtils.findElement(XieMaPage.xm40).getAttribute("value").trim().equals("")) {
            if (num >= 1) {
                hmd+=",";
            }
            hmd+= WebElementUtils.findElement(XieMaPage.tm40).getText().trim()+"#"+WebElementUtils.findElement(XieMaPage.xm40).getAttribute("value").trim();
            num++;
        }
        if (!WebElementUtils.findElement(XieMaPage.xm41).getAttribute("value").trim().equals("")) {
            if (num >= 1) {
                hmd+=",";
            }
            hmd+= WebElementUtils.findElement(XieMaPage.tm41).getText().trim()+"#"+WebElementUtils.findElement(XieMaPage.xm41).getAttribute("value").trim();
            num++;
        }
        if (!WebElementUtils.findElement(XieMaPage.xm42).getAttribute("value").trim().equals("")) {
            if (num >= 1) {
                hmd+=",";
            }
            hmd+= WebElementUtils.findElement(XieMaPage.tm42).getText().trim()+"#"+WebElementUtils.findElement(XieMaPage.xm42).getAttribute("value").trim();
            num++;
        }
        Actions.click(By.xpath("/html/body/table/tbody/tr[12]/td[2]/input"));

        SeleniumDriver.driver.switchTo().parentFrame();
        Actions.click(DdPage.saveClick);


        //门市：0002  ，商品编码：2028392
//  门市：      商品编码：2000336

      /*  WebElement element= WebElementUtils.findElement(DdPage.dndh);
        if (element.isDisplayed()) {//若元素disabled=true，则需要去掉此属性，否则会提示无效的元素（org.openqa.selenium.InvalidElementStateException: invalid element state:）
           Actions.RemoveAttribute(element, driver, "disabled");
        }
       String SBILLNO= element.getAttribute("value");
        oracleConnection = new OracleConnection();
        ResultSet resultSetDetail = oracleConnection.querySql(" select * from sborderdetail  where SDBILLNO='"+SBILLNO+"'");
        logger.info("SBILLNO:"+SBILLNO);
        while (resultSetDetail.next()) {
            int SDROWNO=0;
            String SDGDID="";
            double SDPRICE=0;
            double SDPURPRICE=0;
            double SDTOPRICE=0;
            double SDTOPURPRICE=0;
            double SDTOQTY=0;
            String SDMHD="";
            String SDREMARK="";
            String SISDEL="";
            String SMARKET="";
            String SBUYER="";
            String SUPDATER="";
            String  SUPDATE="";
            SDGDID = resultSetDetail.getString("SDGDID");
            SDPRICE=resultSetDetail.getDouble("SDPRICE");
            SDPURPRICE=resultSetDetail.getDouble("SDPURPRICE");
            SDTOPRICE=resultSetDetail.getDouble("SDTOPRICE");
            SDTOPURPRICE=resultSetDetail.getDouble("SDTOPURPRICE");
            SDTOQTY=resultSetDetail.getDouble("SDTOQTY");
            SDMHD = resultSetDetail.getString("SDMHD");
            SDREMARK=resultSetDetail.getString("SDREMARK");
            SISDEL= resultSetDetail.getString("SISDEL");
            SMARKET= resultSetDetail.getString("SMARKET");
            SUPDATER=resultSetDetail.getString("SUPDATER");
            SUPDATE=resultSetDetail.getString("SUPDATE");
            SBUYER=resultSetDetail.getString("SBUYER");
            String spbmT =WebElementUtils.findElement(DdPage.spbm).getAttribute("value").trim();
            Double sjT =new Double(WebElementUtils.findElement(DdPage.sj).getText().trim());

            Double jj0T =new Double(WebElementUtils.findElement(DdPage.jj0).getText().trim());

            Double sjTotalT =new Double(WebElementUtils.findElement(DdPage.sjTotal).getText().trim());

            Double jjTotalT =new Double(WebElementUtils.findElement(DdPage.jjTotal).getText().trim());
            Double slTotalT =new Double(WebElementUtils.findElement(DdPage.slTotal).getAttribute("value").trim());
            String mdValueT =WebElementUtils.findElement(DdPage.mdValue).getAttribute("value").trim();

            Assert.assertEquals(SDGDID,spbmT,"商品编码错误");
            Assert.assertEquals(SDPRICE,sjT,"售价错误");
            Assert.assertEquals(SDPURPRICE,jj0T,"进价错误");
            //Assert.assertEquals(SDTOPRICE,sjTotalT,"售价合计错误");
            Assert.assertEquals(SDTOPURPRICE,jjTotalT,"进价合计错误");

            Assert.assertEquals(SDTOQTY,slTotalT,"数量合计错误");


            Assert.assertEquals(SDMHD,hmd,"码号段错误");
            Assert.assertEquals(SDREMARK,null,"备注错误");
            Assert.assertEquals(SISDEL,"0","是否删除错误");
            Assert.assertEquals(SMARKET,mdValueT,"门店错误");
            Assert.assertEquals("0",SUPDATER,"操作员错误");
            Assert.assertNotNull(SUPDATE,"操作时间为空");
            String msT =WebElementUtils.findElement(DdPage.ms).getAttribute("value").trim();
            Assert.assertEquals(SBUYER,msT,"买手错误");


        }
        oracleConnection.close();
        //新增页面关闭*/
        //新增页面关闭，控制权交到主体页面
        SeleniumDriver.driver.switchTo().parentFrame();
       // By byClose = WebElementUtils.findByEqual(DdPage.ddClose1,DdPage.ddClose2,DdPage.ddClose3);
        Actions.click(DdPage.ddClose);
        SeleniumDriver.driver.switchTo().defaultContent();

    }
//审核
@Test
public  void  shenhe() throws InterruptedException, SQLException, IOException, ClassNotFoundException {
//    操作
    String DJBH="";
    WebElement webElement1 = WebElementUtils.findElement(DdPage.iframe);
    SeleniumDriver.driver.switchTo().frame(webElement1);
    Actions.click(DdPage.selectClick);
    logger.info("选中："+ WebElementUtils.findElement(DdPage.liebiao1).getText());
    if ( WebElementUtils.findElement(DdPage.liebiao1).getText().equals("1")) {
        logger.info("选中");
        Thread.sleep(3000);
        Actions.click(DdPage.liebiao1Selected);
        DJBH=WebElementUtils.findElement(DdPage.liebiaoDJBH).getText();
    }

    Actions.click(DdPage.shHome);// //*[@id="layui-layer11"]/div[3]/a[1]     //*[@id="layui-layer3"]/div[3]/a[1]
  // WebElement webElement = WebElementUtils.findElementEqual(DdPage.shQD1,DdPage.shQD2,DdPage.shQD3,DdPage.shQD5);
    WebElement webElement = WebElementUtils.findElement(DdPage.shQD);
    webElement.click();
//  验证数据库是否审核成功。

    OracleConnection  oracleConnection = new OracleConnection();  //*[@id="layui-layer1"]/span/a     //*[@id="layui-layer-shade2"]   /html/body/section/div
    ResultSet resultSet =oracleConnection.querySql("select * from sborderhead  where SBILLNO='"+DJBH+"'");
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
    String  textYZ= WebElementUtils.findElement(DdPage.textYZ).getText();
    logger.info(textYZ);
    Assert.assertEquals(textYZ,"操作成功","订单页面审核失败！");
    SeleniumDriver.driver.switchTo().defaultContent();
}

    @DataProvider(name="userList")
    public Object[][] test2()
    {
        return DdInfo.Object;

    }

//查询
    @Test  (dataProvider = "userList")
    public   void selectInfo(String sSBILLNO,String sCHECK,String sSPBM,String sHH,String sPP,String sGYS,String sLRSJ1,String sLRSJ2,int isImport) throws SQLException, IOException, ClassNotFoundException, InterruptedException {
        WebElement webElement1 = WebElementUtils.findElement(DdPage.iframe);
        SeleniumDriver.driver.switchTo().frame(webElement1);
        Thread.sleep(4000);
        Actions.click(DdPage.selectClick);
//        输入查询条件，及书写查询条件
        String strWhere=" where (1=1) and SISDEL=0 ";
        String wheresSBILLNO="";
        String wheresCHECK="";
        String wheresLRSJ1="";
        String wheresLRSJ2="";
        if(sSBILLNO.length()>0){
            strWhere+=" and SBILLNO like '%"+sSBILLNO+"%'";
            WebElementUtils.findElement(DdPage.sSBILLNO).sendKeys(sSBILLNO);
        }
        if(sCHECK.length()>0){
            strWhere+=" and SFLAG='"+sCHECK+"'";

    WebElement webElement= WebElementUtils.findElement(DdPage.sSFLAG);
            Select select=new Select(webElement);
            select.selectByValue(""+sCHECK+"");
            strWhere+=wheresCHECK;
        }
        else
            {
                strWhere+="and  SFLAG='N'";

            }


            if(sLRSJ1.length()>0&&sLRSJ2.length()==0){ WebElementUtils.findElement(DdPage.sstartdate).sendKeys(sLRSJ1.substring(0,10));
                strWhere+=" and SINPUTDATE >to_date('"+sLRSJ1+"','yyyy/mm/dd hh24:mi:ss')";
            }
            if(sLRSJ2.length()>0&&sLRSJ1.length()==0){   WebElementUtils.findElement(DdPage.senddate).sendKeys(sLRSJ2.substring(0,10));
                strWhere+=" and SINPUTDATE <to_date('"+sLRSJ2+"','yyyy/mm/dd hh24:mi:ss')";
            }


        if(sLRSJ1.length()>0&&sLRSJ2.length()>0){
            WebElementUtils.findElement(DdPage.sstartdate).sendKeys(sLRSJ1.substring(0,10));
            WebElementUtils.findElement(DdPage.senddate).sendKeys(sLRSJ2.substring(0,10));
            strWhere+=" and SINPUTDATE between  to_date('"+sLRSJ1+"','yyyy/mm/dd hh24:mi:ss') and to_date('"+sLRSJ2+"','yyyy/mm/dd hh24:mi:ss')";
        }

 if(sSPBM.length()>0){
     WebElementUtils.findElement(DdPage.sSDGDID).sendKeys(sSPBM);
     strWhere+=" and exists (select b.sdbillno  from SBORDERDETAIL b  where b.SDGDID like '%"+sSPBM+"%')";
 }



        Actions.click(DdPage.selectClick);//点了2次才有效果
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
        WebElement table=WebElementUtils.findElement(DdPage.ddTable);
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
                        strSTOQTY=col.get(8).getText();
                        strSTOPURPRICE=col.get(9).getText();
                        strSTOPRICE=col.get(10).getText();


                }
            }
            trNum++;
        }

        Actions.click(DdPage.wy);//点击【尾页】
        WebElement table1=WebElementUtils.findElement(DdPage.ddTable);
        List<WebElement> rows1 = table1.findElements(By.tagName("tr"));
//        分页只能读取当前页的行数，所以要点击尾页，获取最后一列的值。
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
        ResultSet resultSet =oracleConnection.querySql("select to_char(SAUDITDATE,'yyyy-mm-dd hh24:mi:ss')  as SAUDITDATE ,to_char(SINPUTDATE,'yyyy-mm-dd hh24:mi:ss')  as SINPUTDATE,  (select  sname from SYSUSER where Sid=a.SINPUTOR) as SINPUTORname,(select  sname from SYSUSER where Sid=a.SAUDITOR) as SAUDITORname,a.* from sborderhead a   "+strWhere);


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
           STOQTY=resultSet.getString("STOQTY");if(STOQTY==null){STOQTY="";}
           STOPURPRICE=resultSet.getString("STOPURPRICE");if(STOPURPRICE==null){STOPURPRICE="";}
           STOPRICE=resultSet.getString("STOPRICE");if(STOPRICE==null){STOPRICE="";}

            }


        }
        resultSet.last();//直接执行跳到结果集的最后一行
        num =resultSet.getRow(); //这一句就能得到结果集的行数
        resultSet.beforeFirst();  //重新执行到第一行的前一行，以便查询结果集的集体内容
        logger.info("数据表总行数num："+num);
        Assert.assertEquals(totalNum,num,"页面数据条数和数据表条数不一致");
        Assert.assertEquals(strSBILLNO,SBILLNO,"单据编号错误");
        Assert.assertEquals(strSREMARK,SREMARK,"备注错误");
        Assert.assertEquals(strSAUDITDATE,SAUDITDATE,"审核日期错误");
        Assert.assertEquals(strSAUDITOR,SAUDITOR,"审核员错误");
        Assert.assertEquals(strSINPUTDATE,SINPUTDATE,"录入日期错误");
         Assert.assertEquals(strSINPUTOR,SINPUTOR,"录入员错误");
        Assert.assertEquals(strSTOQTY,STOQTY,"数量合计错误");
        Assert.assertEquals(strSTOPURPRICE,STOPURPRICE,"进价合计错误");
        Assert.assertEquals(strSTOPRICE,STOPRICE,"售价合计错误");


//----开始验证导出  isImport:0为不运行，1为运行
        if(isImport==1){
             /*1,在selenium启动浏览器前，为其配置好默认下载文件夹

    2,点击导出后，判断此默认文件夹下是否有这个文件。

    3,如果需要判断Excel内容，则需要能够处理Excel的架包以及用自己合适的方法去匹配Excel里的内容。*/
            ExcelUnit excelUnit=new ExcelUnit();
            File [] list0=new File("D:\\selenium\\Downloads").listFiles();
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
            String imSFLAG=map[0][0].get("状态");
            String imSTOPRICE=map[0][0].get("售价合计");
            String imSTOPURPRICE=map[0][0].get("进价合计");
            String imSTOQTY=map[0][0].get("数量合计");
            String imSINPUTOR=map[0][0].get("录入员");
            String imSINPUTDATE=map[0][0].get("录入时间");
            String imSAUDITOR=map[0][0].get("审核员");
            String imSAUDITDATE=map[0][0].get("审核时间");
            String imSREMARK=map[0][0].get("备注");
            Assert.assertEquals(imSBILLNO,SBILLNO,"单据编号错误");
            Assert.assertEquals(imSREMARK,SREMARK,"备注错误");
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
            Date imSINPUTDATEDate = new Date(imSINPUTDATE);
            String createdate = sdf.format(imSINPUTDATEDate);
            logger.info("录入日期:"+createdate);
            Assert.assertEquals(createdate,SINPUTDATE,"录入日期错误");
            if(SINPUTOR=="0"){SINPUTOR="";}
            Assert.assertEquals(imSINPUTOR,SINPUTOR,"录入员错误");
            Assert.assertEquals(imSTOQTY,STOQTY,"数量合计错误");
            Assert.assertEquals(imSTOPURPRICE,STOPURPRICE,"进价合计错误");
            Assert.assertEquals(imSTOPRICE,STOPRICE,"售价合计错误");
            Assert.assertEquals(fileCount0+1,fileCount,"订单导出失败");
            Assert.assertEquals(dateTotal,totalNum,"导出总条数和页面总条数不一致");
            logger.info("订单总条数和列表内容验证通过");
        }
        //----导出验证结束

        // 查询完后内容要清空
        WebElementUtils.findElement(DdPage.sSBILLNO).clear();
        WebElementUtils.findElement(DdPage.sstartdate).clear();
        WebElementUtils.findElement(DdPage.senddate).clear();
        WebElementUtils.findElement(DdPage.sSDGDID).clear();
        oracleConnection.close();
        SeleniumDriver.driver.switchTo().defaultContent();

    }

    //    退出
  @AfterTest
    public   void quitTest() throws InterruptedException, SQLException {
      //关闭数据库

//      浏览器关闭
SeleniumDriver.closedAll();
}
}
