package actions;

import DbConnect.OracleConnection;
import Information.FaHuoDanInfo;
import Information.LoginUserInfo;
import drivers.SeleniumDriver;
import findElements.WebElementUtils;
import log4j.LoggerControler;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pages.FaHuoDanPage;
import pages.FaHuoDanPages;
import pages.XieMaPage;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import static drivers.SeleniumDriver.driver;

/**
 * Created by Administrator on 2019/2/27.
 */
public class FaHuoDanAction {
    final static LoggerControler logger = LoggerControler.getLogger(FaHuoDanInfo.class);
//   录入单新增和编辑
    public static   void  insertORupdateFaHuoDan(int insertORupdate)throws InterruptedException, SQLException, IOException, ClassNotFoundException//0:为新增，1为修改
    {

        OracleConnection oracleConnection;
        String sid = "";
        //   将控制权转交给iframe
        WebElement webElement1 = WebElementUtils.findElement(FaHuoDanPage.iframe);
        driver.switchTo().frame(webElement1);
        if(insertORupdate==0){
            Actions.click(FaHuoDanPage.insertClick);
        }else{
            Actions.click(FaHuoDanPage.selectClick);
            logger.info("选中：" + WebElementUtils.findElement(FaHuoDanPage.liebiao1).getText());
            if (WebElementUtils.findElement(FaHuoDanPage.liebiao1).getText().equals("1")) {
                logger.info("选中");
                Actions.click(FaHuoDanPage.liebiao1Selected);
            }
            Actions.click(FaHuoDanPage.updateClick);

        }

        //控制权转交给弹出页面的iframe
        WebElement webElement2 = WebElementUtils.findElement(FaHuoDanPage.iframeInsert1);
        driver.switchTo().frame(webElement2);
        //输入供应商

        Actions.sendTest(FaHuoDanPage.gys, FaHuoDanInfo.gys(insertORupdate));
        WebElement webElement = WebElementUtils.findElement(FaHuoDanPage.gysValue);
        Actions.setAttribute(webElement, driver, "value", FaHuoDanInfo.gysValue(insertORupdate));
        //输入经营方式
        Select cdSelect = new Select(WebElementUtils.findElement(FaHuoDanPage.jyfs));
        cdSelect.selectByVisibleText(FaHuoDanInfo.jyfs(insertORupdate));
        //输入买手
        Actions.sendTest(FaHuoDanPage.ms, FaHuoDanInfo.ms);
        WebElement msWebElement = WebElementUtils.findElement(FaHuoDanPage.msValue);
        Actions.setAttribute(msWebElement, driver, "value", FaHuoDanInfo.msValue(insertORupdate));

        //收货门店

        Actions.sendTest(FaHuoDanPage.shmd, FaHuoDanInfo.shmd(insertORupdate));
        WebElement shmdWebElement = WebElementUtils.findElement(FaHuoDanPage.shmdValue);
        Actions.setAttribute(shmdWebElement, driver, "value", FaHuoDanInfo.shmdValue(insertORupdate));
//        备注
        Actions.sendTest(FaHuoDanPage.bz, FaHuoDanInfo.bz(insertORupdate));
        //输入商品编码
        Actions.sendTest(FaHuoDanPage.spbm, FaHuoDanInfo.spbm(insertORupdate));
        WebElementUtils.findElement(FaHuoDanPage.spbm).sendKeys(Keys.ENTER);
//        输入加价
        Actions.sendTest(FaHuoDanPage.jj, FaHuoDanInfo.jj(insertORupdate));

//        输入售价
        Actions.sendTest(FaHuoDanPage.sj, FaHuoDanInfo.sj(insertORupdate));
//      选择码号数量
        WebElementUtils.findElement(FaHuoDanPage.mhslClick).click();
        //控制权转交给弹出的鞋码页面（由于这里弹出的两层页面有2个iframe，且id一样，所以这里不能用id定位）
        WebElement webElement3 = WebElementUtils.findElement(XieMaPage.xmIframe);
        SeleniumDriver.driver.switchTo().frame(webElement3);

        Actions.sendTest(XieMaPage.xm33, FaHuoDanInfo.xm33(insertORupdate));
        Actions.sendTest(XieMaPage.xm34, FaHuoDanInfo.xm34(insertORupdate));
        Actions.sendTest(XieMaPage.xm35, FaHuoDanInfo.xm35(insertORupdate));
        Actions.sendTest(XieMaPage.xm36, FaHuoDanInfo.xm36(insertORupdate));
        Actions.sendTest(XieMaPage.xm37, FaHuoDanInfo.xm37(insertORupdate));
        Actions.sendTest(XieMaPage.xm38, FaHuoDanInfo.xm38(insertORupdate));
        Actions.sendTest(XieMaPage.xm39, FaHuoDanInfo.xm39(insertORupdate));
        Actions.sendTest(XieMaPage.xm40, FaHuoDanInfo.xm40(insertORupdate));
        Actions.sendTest(XieMaPage.xm41, FaHuoDanInfo.xm41(insertORupdate));
        int rowNum = 8;//默认设置8行数据
        HashMap<String, String>[][] hashmap = new HashMap[rowNum][1];
//初始化，要不然会报空指针错
        for (int k = 0; k < rowNum; k++) {

            try {
                hashmap[k][0] = new HashMap();
            } catch (Exception e) {
                logger.info("错误信息：" + e.getMessage());
            }

        }

        String hmd = "";
        int num = 0;
        String xiema33 = WebElementUtils.findElement(XieMaPage.xm33).getAttribute("value").trim();
        String tm33 = WebElementUtils.findElement(XieMaPage.tm33).getText().trim();
        if (!xiema33.equals("")) {
            hashmap[0][0].put("mh", "33");
            hashmap[0][0].put("tm", tm33);
            hashmap[0][0].put("xm", xiema33);
            hmd = tm33 + "#" + xiema33;
            num++;
        }
        String xiema34 = WebElementUtils.findElement(XieMaPage.xm34).getAttribute("value").trim();
        String tm34 = WebElementUtils.findElement(XieMaPage.tm34).getText().trim();
        if (!xiema34.equals("")) {
            if (num >= 1) {
                hmd += ",";
            }
            hmd += tm34 + "#" + xiema34;
            hashmap[1][0].put("mh", "34");
            hashmap[1][0].put("tm", tm34);
            hashmap[1][0].put("xm", xiema34);
            num++;
        }
        String xiema35 = WebElementUtils.findElement(XieMaPage.xm35).getAttribute("value").trim();
        String tm35 = WebElementUtils.findElement(XieMaPage.tm35).getText().trim();
        if (!xiema35.equals("")) {
            if (num >= 1) {
                hmd += ",";
            }
            hmd += tm35 + "#" + xiema35;
            hashmap[2][0].put("mh", "35");
            hashmap[2][0].put("tm", tm35);
            hashmap[2][0].put("xm", xiema35);
            num++;
        }
        String xiema36 = WebElementUtils.findElement(XieMaPage.xm36).getAttribute("value").trim();
        String tm36 = WebElementUtils.findElement(XieMaPage.tm36).getText().trim();
        if (!xiema36.equals("")) {
            if (num >= 1) {
                hmd += ",";
            }
            hmd += tm36 + "#" + xiema36;
            hashmap[3][0].put("mh", "36");
            hashmap[3][0].put("tm", tm36);
            hashmap[3][0].put("xm", xiema36);
            num++;
        }
        String xiema37 = WebElementUtils.findElement(XieMaPage.xm37).getAttribute("value").trim();
        String tm37 = WebElementUtils.findElement(XieMaPage.tm37).getText().trim();
        if (!xiema37.equals("")) {
            if (num >= 1) {
                hmd += ",";
            }
            hmd += tm37 + "#" + xiema37;
            hashmap[4][0].put("mh", "37");
            hashmap[4][0].put("tm", tm37);
            hashmap[4][0].put("xm", xiema37);
            num++;
        }
        String xiema38 = WebElementUtils.findElement(XieMaPage.xm38).getAttribute("value").trim();
        String tm38 = WebElementUtils.findElement(XieMaPage.tm38).getText().trim();
        if (!xiema38.equals("")) {
            if (num >= 1) {
                hmd += ",";
            }
            hmd += tm38 + "#" + xiema38;
            hashmap[4][0].put("mh", "38");
            hashmap[4][0].put("tm", tm38);
            hashmap[4][0].put("xm", xiema38);
            num++;
        }
        String xiema39 = WebElementUtils.findElement(XieMaPage.xm39).getAttribute("value").trim();
        String tm39 = WebElementUtils.findElement(XieMaPage.tm39).getText().trim();
        if (!xiema39.equals("")) {
            if (num >= 1) {
                hmd += ",";
            }
            hmd += tm39 + "#" + xiema39;
            hashmap[5][0].put("mh", "39");
            hashmap[5][0].put("tm", tm39);
            hashmap[5][0].put("xm", xiema39);
            num++;
        }
        String xiema40 = WebElementUtils.findElement(XieMaPage.xm40).getAttribute("value").trim();
        String tm40 = WebElementUtils.findElement(XieMaPage.tm40).getText().trim();
        if (!xiema40.trim().equals("")) {
            if (num >= 1) {
                hmd += ",";
            }
            hmd += tm40 + "#" + xiema40;
            hashmap[6][0].put("mh", "40");
            hashmap[6][0].put("tm", tm40);
            hashmap[6][0].put("xm", xiema40);
            num++;
        }
        String xiema41 = WebElementUtils.findElement(XieMaPage.xm41).getAttribute("value").trim();
        String tm41 = WebElementUtils.findElement(XieMaPage.tm41).getText().trim();
        if (!xiema41.trim().equals("")) {
            if (num >= 1) {
                hmd += ",";
            }
            hmd += tm41 + "#" + xiema41;
            hashmap[7][0].put("mh", "41");
            hashmap[7][0].put("tm", tm41);
            hashmap[7][0].put("xm", xiema41);
            num++;
        }

        Actions.click(By.xpath("/html/body/table/tbody/tr[11]/td[2]/input"));


        oracleConnection = new OracleConnection();
        SeleniumDriver.driver.switchTo().parentFrame();
        Actions.click(FaHuoDanPage.saveClick); // 点击保存
        //数据插入数据库需要时间
        Thread.sleep(6000);
        //验证数据是否正确
        String strSBILLNO = ""; //单据编号
        strSBILLNO = WebElementUtils.findElement(FaHuoDanPage.dnbh).getAttribute("value");
        sid = LoginUserInfo.loginUserInfo(LoginUserInfo.username);

        String SBILLNO = "";//单据编号
        String SFLAG = "";    //审核标志 Y 已审核 N未审核
        String SSHMKT = "";    //收货门店
        String STOPRICE = "";    //售价合计
        String STOPURPRICE = "";    //进价合计
        String STOQTY = "";    //数量合计
        String SINPUTOR = "";    //录入员
        String SINPUTDATE = "";    //录入时间
        String SUPDATER = "";    //操作员
        String SUPDATE = "";    //操作时间
        String SAUDITOR = "";    //审核员
        String SAUDITDATE = "";    //审核日期
        String SREMARK = "";    //备注
        String SISDEL = "";    //是否删除

        int pp=0;
        ResultSet resultSetHead = oracleConnection.querySql("select * from SBINSTRFHHEAD  where SBILLNO='" + strSBILLNO + "'");
        while (resultSetHead.next()) {
            pp++;
            //数据表内容为null时，不能去空格
            SBILLNO = resultSetHead.getString("SBILLNO");
            SFLAG = resultSetHead.getString("SFLAG");
            SSHMKT = resultSetHead.getString("SSHMKT");
            STOPRICE = resultSetHead.getString("STOPRICE");
            STOPURPRICE = resultSetHead.getString("STOPURPRICE");
            STOQTY = resultSetHead.getString("STOQTY");
            SINPUTOR = resultSetHead.getString("SINPUTOR");
            SINPUTDATE = resultSetHead.getString("SINPUTDATE");
            SUPDATER = resultSetHead.getString("SUPDATER");
            SUPDATE = resultSetHead.getString("SUPDATE");
            SAUDITOR = resultSetHead.getString("SAUDITOR");
            SAUDITDATE = resultSetHead.getString("SAUDITDATE");
            SREMARK = resultSetHead.getString("SREMARK");
            SISDEL = resultSetHead.getString("SISDEL");

        }
        Assert.assertNotEquals(pp, 0, "录入单主表未添加到数据库");
        Assert.assertEquals("N", SFLAG.trim(), "审核标志错误");
        String strSHMD = WebElementUtils.findElement(FaHuoDanPage.shmdValue).getAttribute("value");
        Assert.assertEquals(SSHMKT, strSHMD, "收货门店错误");
        String strSJHJ = WebElementUtils.findElement(FaHuoDanPage.sjhjTotal).getText();
        Assert.assertEquals(STOPRICE, strSJHJ, "售价合计错误");
        String strJJHJ = WebElementUtils.findElement(FaHuoDanPage.jjTotal).getText();
        Assert.assertEquals(STOPURPRICE, strJJHJ, "进价合计错误");
        String strSLHJ = WebElementUtils.findElement(FaHuoDanPage.slTotal).getText();
        Assert.assertEquals(STOQTY, strSLHJ, "数量合计错误");

        Assert.assertEquals(SINPUTOR, sid, "录入员错误");
        Assert.assertNotNull(SINPUTDATE, "录入时间为空");
        Assert.assertEquals(SUPDATER, sid, "操作员错误");
        Assert.assertNotNull(SUPDATE, "操作时间为空");
        Assert.assertEquals(SAUDITOR, "0", "审核员错误");
        Assert.assertEquals(SAUDITDATE, null, "审核时间错误");//数据库是空的话，则是null
        Assert.assertEquals(SREMARK, null, "备注错误");
        Assert.assertEquals(SISDEL, "0", "是否删除错误");


        ResultSet resultSetDetail = oracleConnection.querySql(" select * from SBINSTRFHDETAIL  where SDBILLNO='" + strSBILLNO + "'");
        int row = 1;
        int i = 0;
        int t = 0;
        while (resultSetDetail.next()) {
            i++;
            String SDBILLNO = strSBILLNO;    //"单据编号
            String SDROWNO = "";    //"行号
            String SDGDID = "";    //商品编码
            String SDPRICE = "";    //售价
            String SDPURPRICEE = "";    //进价
            String SDTOPRICEE = "";    //售价合计
            String SDTOPURPRICEE = "";    //进价合计
            String SDTOQTYE = "";    //数量合计
            String SDMHDE = "";    //码号段
            String SDREMARKE = "";    //备注
            String SISDELE = "";    //是否删除
            String SUPDATERE = "";    //操作员
            String SUPDATEE = "";    //操作时间
            String SCREASERATEE = "";    //加价率

            SDROWNO = resultSetDetail.getString("SDROWNO");
            SDGDID = resultSetDetail.getString("SDGDID");
            SDPRICE = resultSetDetail.getString("SDPRICE");
            SDPURPRICEE = resultSetDetail.getString("SDPURPRICE");
            SDTOPRICEE = resultSetDetail.getString("SDTOPRICE");
            SDTOPURPRICEE = resultSetDetail.getString("SDTOPURPRICE");
            SDTOQTYE = resultSetDetail.getString("SDTOQTY");
            SDMHDE = resultSetDetail.getString("SDMHD");
            SDREMARKE = resultSetDetail.getString("SDREMARK");
            SISDELE = resultSetDetail.getString("SISDEL");
            SUPDATERE = resultSetDetail.getString("SUPDATER");
            SUPDATEE = resultSetDetail.getString("SUPDATE");
            SCREASERATEE = resultSetDetail.getString("SCREASERATE");


            String SDBILLNO0 = strSBILLNO;    //"单据编号
            String strSDROWNO = WebElementUtils.findElement(FaHuoDanPages.hh(i + row)).getAttribute("value");    //"行号
            String strSDGDID = WebElementUtils.findElement(FaHuoDanPages.spbm(i + row)).getAttribute("value");     //商品编码
            String strSDPRICE = WebElementUtils.findElement(FaHuoDanPages.sj(i + row)).getAttribute("value");    //售价
            String strSDPURPRICEE = WebElementUtils.findElement(FaHuoDanPages.jj(i + row)).getText();    //进价
            String strSDTOPRICEE = WebElementUtils.findElement(FaHuoDanPages.sjhj(i + row)).getText();    //售价合计
            String strSDTOPURPRICEE = WebElementUtils.findElement(FaHuoDanPages.jjhj(i + row)).getText();    //进价合计
            String strSDTOQTYE = WebElementUtils.findElement(FaHuoDanPages.slhj(i + row)).getAttribute("value");       //数量合计
//            String strSDMHDE = "";    //码号段
//            String strSDREMARKE = "";    //备注
//            String strSISDELE = "";    //是否删除
            String strSCREASERATEE = WebElementUtils.findElement(FaHuoDanPages.jjl(i + row)).getText();    //加价率

            Assert.assertEquals(SDBILLNO, strSBILLNO, "单据编号错误");
            Assert.assertEquals(SDROWNO, strSDROWNO, "行号错误");
            Assert.assertEquals(SDGDID, strSDGDID, "商品编码错误");
            Assert.assertEquals(SDPRICE, strSDPRICE, "售价错误");
            Assert.assertEquals(SDPURPRICEE, strSDPURPRICEE, "进价错误");
            Assert.assertEquals(SDTOPRICEE, strSDTOPRICEE, "售价合计错误");
            Assert.assertEquals(SDTOPURPRICEE, strSDTOPURPRICEE, "进价合计错误");
            Assert.assertEquals(SDTOQTYE, strSDTOQTYE, "数量合计错误");
            Assert.assertEquals(SDMHDE, hmd, "码号段错误");
            Assert.assertEquals(SCREASERATEE, strSCREASERATEE, "加价率错误");
            Assert.assertEquals(SUPDATERE, "0", "操作员错误");
            Assert.assertNotNull(SUPDATE, "操作时间为空");
            ResultSet SHEADCODENUMrs = oracleConnection.querySql(" select * from SHEADCODENUM  where SBILLNO='" + strSBILLNO + "' and SGDID='" + SDGDID + "'");
            while (SHEADCODENUMrs.next()) {
                t++;
                String SBARCODE = SHEADCODENUMrs.getString("SBARCODE");    //"商品条码
                String SNUM = SHEADCODENUMrs.getString("SNUM");//"数量
                String SISDEL3 = SHEADCODENUMrs.getString("SISDEL");   //是否删除
                String SUPDATER3 = SHEADCODENUMrs.getString("SUPDATER");    //操作员
                String SUPDATE3 = SHEADCODENUMrs.getString("SUPDATE"); //操作时间
                String SMH = SHEADCODENUMrs.getString("SMH");   //码号
                String SID = SHEADCODENUMrs.getString("SID");    //ID

                Assert.assertNotNull(SBARCODE, "商品条码为空");
                Assert.assertEquals(SISDEL3, "0", "是否删除错误");
                Assert.assertEquals(SUPDATERE, "0", "操作员错误");
                Assert.assertNotNull(SUPDATE, "操作时间为空");
                int dateTotal = hashmap.length;
                for (int m = 0; m < dateTotal; m++) {

                    String xm = hashmap[m][0].get("xm");
                    String tm = hashmap[m][0].get("tm");
                    String mh = hashmap[m][0].get("mh");
                    if (SBARCODE.equals(tm)) {
                        Assert.assertEquals(SMH, mh, "码号错误");
                        Assert.assertEquals(SNUM, xm, "鞋数量错误");
                    }


                }
            }
        }

        Assert.assertNotEquals(i, 0, "录入单明细未添加到数据库");
        Assert.assertNotEquals(t, 0, "录入单鞋码数据未添加到数据库");
        SeleniumDriver.driver.switchTo().parentFrame();
        Actions.click(FaHuoDanPage.insertClose);
        SeleniumDriver.driver.switchTo().defaultContent();

    }
//   录入单审核
    public static void faHuoDanShenHe() throws InterruptedException, SQLException, IOException, ClassNotFoundException {
//    操作
        String DJBH = "";
        WebElement webElement1 = WebElementUtils.findElement(FaHuoDanPage.iframe);
        SeleniumDriver.driver.switchTo().frame(webElement1);
        Actions.click(FaHuoDanPage.selectClick);
        logger.info("选中：" + WebElementUtils.findElement(FaHuoDanPage.liebiao1).getText());
        if (WebElementUtils.findElement(FaHuoDanPage.liebiao1).getText().equals("1")) {
            logger.info("选中");
            Thread.sleep(3000);
            Actions.click(FaHuoDanPage.liebiao1Selected);
            DJBH = WebElementUtils.findElement(FaHuoDanPage.lbDJBH).getText();
        }

        Actions.click(FaHuoDanPage.shenheClick);// //*[@id="layui-layer11"]/div[3]/a[1]     //*[@id="layui-layer3"]/div[3]/a[1]
        // WebElement webElement = WebElementUtils.findElementEqual(DdPage.shQD1,DdPage.shQD2,DdPage.shQD3,DdPage.shQD5);
        WebElement webElement = WebElementUtils.findElement(FaHuoDanPage.shQD);
        webElement.click();
//  验证数据库是否审核成功。
        Thread.sleep(3000);
        OracleConnection oracleConnection = new OracleConnection();  //*[@id="layui-layer1"]/span/a     //*[@id="layui-layer-shade2"]   /html/body/section/div
        ResultSet resultSet = oracleConnection.querySql("select * from SBINSTRFHHEAD  where SBILLNO='" + DJBH + "'");
        String SFLAG = "";
        String SAUDITOR = "";
        String SAUDITDATE = "";
        while (resultSet.next()) {
            SFLAG = resultSet.getString("SFLAG");
            SAUDITOR = resultSet.getString("SAUDITOR");
            SAUDITDATE = resultSet.getString("SAUDITDATE");
        }

      String  sid = LoginUserInfo.loginUserInfo(LoginUserInfo.username);


        Assert.assertEquals("Y", SFLAG.trim(), "审核标志错误");
        Assert.assertEquals(SAUDITOR, sid, "审核员错误");
        Assert.assertNotNull(SAUDITDATE, "审核时间为空");
        SeleniumDriver.driver.switchTo().defaultContent();


    }
}
