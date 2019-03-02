package Headquarters;

import DbConnect.OracleConnection;
import Information.FaHuoDanInfo;
import Information.LoginUserInfo;
import actions.Actions;
import actions.FaHuoDanAction;
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

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import static drivers.SeleniumDriver.driver;

/**
 * Created by Administrator on 2019/2/22.
 */
public class FaHuoDanTest {
    final static LoggerControler logger = LoggerControler.getLogger(DdTest.class);
    OracleConnection oracleConnection;
    String sid = "";

    //    登录
    @BeforeTest
    public void loginTest() throws InterruptedException {
        LoginUserInfo.login(0);
        LoginUserInfo.clickDjTest(MenuPage.fhd);

    }

    @Test
    public void insertFaHuoDanTest() throws InterruptedException, SQLException, IOException, ClassNotFoundException {
        FaHuoDanAction.insertORupdateFaHuoDan(0);
    }

    @Test
    public void faHuoDanShenHe() throws InterruptedException, SQLException, IOException, ClassNotFoundException {
        FaHuoDanAction.faHuoDanShenHe();

}
    //    修改
    @Test
    public  void  updateFaHuoDanTest()  throws InterruptedException, SQLException, IOException, ClassNotFoundException {
        FaHuoDanAction.insertORupdateFaHuoDan(1);
    }
//    查询
@DataProvider(name="userList")
public Object[][] test2()
{
    return FaHuoDanInfo.Object;

}

    //查询
    @Test  (dataProvider = "userList")
    public   void selectInfo(String sSHMD,String sSBILLNO,String sCHECK,String sSPBM,String sHH,String sPP,String sGYS,String sLRSJ1,String sLRSJ2,int isImport) throws SQLException, IOException, ClassNotFoundException, InterruptedException {
        WebElement webElement1 = WebElementUtils.findElement(FaHuoDanPage.iframe);
        SeleniumDriver.driver.switchTo().frame(webElement1);
        Thread.sleep(4000);
        Actions.click(FaHuoDanPage.selectClick);
//        输入查询条件，及书写查询条件
        String strWhere=" where (1=1) and SISDEL=0 ";
        if(sSHMD.length()>0){
            strWhere+="and  SSHMKT='"+sSHMD+"'";

            Actions.sendTest(FaHuoDanPage.sSHMD, sSHMD);
            WebElement webElement=WebElementUtils.findElement(FaHuoDanPage.sSHMDvalue);
            Actions.setAttribute(webElement, driver, "value", sSHMD);
        }
        String wheresCHECK="";
        if(sSBILLNO.length()>0){
            strWhere+=" and SBILLNO like '%"+sSBILLNO+"%'";
            WebElementUtils.findElement(FaHuoDanPage.sDDBH).sendKeys(sSBILLNO);
        }
        if(sCHECK.length()>0){
            strWhere+=" and SFLAG='"+sCHECK+"'";

            WebElement webElement= WebElementUtils.findElement(FaHuoDanPage.sSFLAG);
            Select select=new Select(webElement);
            select.selectByValue(""+sCHECK+"");
            strWhere+=wheresCHECK;
        }
        else
        {
            strWhere+="and  SFLAG='N'";

        }


        if(sLRSJ1.length()>0&&sLRSJ2.length()==0){ WebElementUtils.findElement(FaHuoDanPage.sSartdate).sendKeys(sLRSJ1.substring(0,10));
            strWhere+=" and SINPUTDATE >to_date('"+sLRSJ1+"','yyyy/mm/dd hh24:mi:ss')";
        }
        if(sLRSJ2.length()>0&&sLRSJ1.length()==0){   WebElementUtils.findElement(FaHuoDanPage.sEnddate).sendKeys(sLRSJ2.substring(0,10));
            strWhere+=" and SINPUTDATE <to_date('"+sLRSJ2+"','yyyy/mm/dd hh24:mi:ss')";
        }


        if(sLRSJ1.length()>0&&sLRSJ2.length()>0){
            WebElementUtils.findElement(FaHuoDanPage.sSartdate).sendKeys(sLRSJ1.substring(0,10));
            WebElementUtils.findElement(FaHuoDanPage.sEnddate).sendKeys(sLRSJ2.substring(0,10));
            strWhere+=" and SINPUTDATE between  to_date('"+sLRSJ1+"','yyyy/mm/dd hh24:mi:ss') and to_date('"+sLRSJ2+"','yyyy/mm/dd hh24:mi:ss')";
        }

        if(sSPBM.length()>0){
            WebElementUtils.findElement(FaHuoDanPage.sSPBM).sendKeys(sSPBM);
            strWhere+=" and exists (select b.sdbillno  from SBINSTRFHDETAIL b  where b.SDGDID like '%"+sSPBM+"%')";
        }



        Actions.click(FaHuoDanPage.selectClick);//点了2次才有效果
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
        WebElement table=WebElementUtils.findElement(FaHuoDanPage.ddTable);
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
                    strSREMARK=col.get(5).getText();
                    strSAUDITDATE=col.get(6).getText();
                    strSAUDITOR=col.get(7).getText();
                    if(strSAUDITOR.trim().length()==0){strSAUDITOR="0";}
                    strSINPUTDATE=col.get(8).getText();
                    strSINPUTOR=col.get(9).getText();


                }
            }
            trNum++;
        }

        Actions.click(FaHuoDanPage.wy);//点击【尾页】
        Thread.sleep(6000);
        WebElement table1=WebElementUtils.findElement(FaHuoDanPage.ddTable);
        List<WebElement> rows1 = table1.findElements(By.tagName("tr"));
        int trNum0=0;
//        分页只能读取当前页的行数，所以要点击尾页，获取最后一列的值。
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
logger.info("最后一行的文本为："+totalNum);
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
        ResultSet resultSet =oracleConnection.querySql("select to_char(SAUDITDATE,'yyyy-mm-dd hh24:mi:ss')  as SAUDITDATE ,to_char(SINPUTDATE,'yyyy-mm-dd hh24:mi:ss')  as SINPUTDATE, (select  sname from SYSUSER where Sid=a.SINPUTOR) as SINPUTORname,(select  sname from SYSUSER where Sid=a.SAUDITOR) as SAUDITORname,a.* from SBINSTRFHHEAD a   "+strWhere);
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
        }
        resultSet.last();//直接执行跳到结果集的最后一行
        num =resultSet.getRow(); //这一句就能得到结果集的行数
        resultSet.beforeFirst();  //重新执行到第一行的前一行，以便查询结果集的集体内容
        logger.info("总行数num："+num);
        Assert.assertEquals(totalNum,num,"页面数据条数和数据表条数不一致");
        Assert.assertEquals(strSBILLNO,SBILLNO,"单据编号错误");
        Assert.assertEquals(strSREMARK,SREMARK,"备注错误");
        Assert.assertEquals(strSAUDITDATE,SAUDITDATE,"审核日期错误");
        Assert.assertEquals(strSAUDITOR,SAUDITOR,"审核员错误");
        Assert.assertEquals(strSINPUTDATE,SINPUTDATE,"录入日期错误");
        Assert.assertEquals(strSINPUTOR,SINPUTOR,"录入员错误");


        // 查询完后内容要清空
        WebElementUtils.findElement(FaHuoDanPage.sSHMD).clear();
        WebElement webElement=WebElementUtils.findElement(FaHuoDanPage.sSHMDvalue);//清空门店的value属性值
        Actions.setAttribute(webElement, driver, "value", "");
        WebElementUtils.findElement(FaHuoDanPage.sDDBH).clear();
        WebElementUtils.findElement(FaHuoDanPage.sSartdate).clear();
        WebElementUtils.findElement(FaHuoDanPage.sEnddate).clear();
        WebElementUtils.findElement(FaHuoDanPage.sSPBM).clear();
        oracleConnection.close();
        SeleniumDriver.driver.switchTo().defaultContent();

    }
    @AfterTest
    public   void quitTest() throws InterruptedException, SQLException {
        //关闭数据库
  //浏览器关闭
       SeleniumDriver.closedAll();
    }
}
