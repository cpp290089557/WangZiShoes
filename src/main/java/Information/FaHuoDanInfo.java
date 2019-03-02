package Information;

import DbConnect.OracleConnection;
import actions.Actions;
import drivers.SeleniumDriver;
import findElements.WebElementUtils;
import log4j.LoggerControler;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pages.*;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import static drivers.SeleniumDriver.driver;

/**
 * Created by Administrator on 2019/2/22.
 */
public class FaHuoDanInfo {

    /*新增数据*/
    public  static String gys="a001-宜昌飞美";   //供应商
    public  static String gysValue="a001";
    public  static String jyfs="自营";//经营方式
    public  static String ms="000004-王子9";//买手
    public  static String msValue="10103";
    public  static String shmd="0002-沙市";//收货门店 shmdValue
    public  static String shmdValue="0002";
    public  static String bz="自动化测试";//    备注
    public  static String spbm="2071622";//    商品编码
    public  static String jj="10";//    加价
    public  static String sj="60";//    售价

    //    鞋码数量
    public  static  String xm33="2";
    public  static  String xm34="2";
    public  static  String xm35="2";
    public  static  String xm36="2";
    public  static  String xm37="2";
    public  static  String xm38="2";
    public  static  String xm39="2";
    public  static  String xm40="2";
    public  static  String xm41="2";
    public  static  String xm42="2";

///*编辑数据*/  0:新增，1编辑
public static   String  gys(int i)
{      String gys="";
    if(i==0) {gys="a001-宜昌飞美";} else {gys="a001-宜昌飞美";}
    return gys;
}
    public static   String  gysValue(int i)
    {      String gysValue="";
        if(i==0) {gysValue="a001";} else {gysValue="a001";}
        return gysValue;
    }
    public static   String  jyfs(int i)
    {      String jyfs="";
        if(i==0) {jyfs="自营";} else {jyfs="自营";} //经营方式
        return jyfs;
    }
    public static   String  ms(int i)
    {      String ms="";
        if(i==0) {ms="000004-王子9";} else {ms="000004-王子9";} //买手
        return ms;
    }
    public static   String  msValue(int i)
    {      String msValue="";
        if(i==0) {msValue="10103";} else {msValue="10103";} //买手
        return msValue;
    }
    public static   String  shmd(int i)
    {      String shmd="";
        if(i==0) {shmd="0002-沙市";} else {shmd="0002-沙市";} //收货门店
        return shmd;
    }
    public static   String  shmdValue(int i)
    {      String shmdValue="";
        if(i==0) {shmdValue="0002";} else {shmdValue="0002";} //收货门店
        return shmdValue;
    }
    public static   String  bz(int i)
    {      String bz="";
        if(i==0) {bz="自动化测试";} else {bz="自动化测试";}  //备注
        return bz;
    }
    public static   String  spbm(int i)
    {      String spbm="";
        if(i==0) {spbm="2071622";} else {spbm="2071622";}  //商品编码
        return spbm;
    }
    public static   String  jj(int i)
    {      String jj="";
        if(i==0) {jj="10";} else {jj="10";}  //加价
        return jj;
    }
    public static   String  sj(int i)
    {      String sj="";
        if(i==0) {sj="60";} else {sj="60";}  //售价
        return sj;
    }
    //    鞋码数量
    public static   String  xm33(int i)
    {      String xm33="";
        if(i==0) {xm33="2";} else {xm33="2";}
        return xm33;
    }
    public static   String  xm44(int i)
    {      String xm44="";
        if(i==0) {xm44="2";} else {xm44="2";}
        return xm44;
    }
    public static   String  xm34(int i)
    {      String xm34="";
        if(i==0) {xm34="2";} else {xm34="2";}
        return xm34;
    }
    public static   String  xm35(int i)
    {      String xm35="";
        if(i==0) {xm35="2";} else {xm35="2";}
        return xm35;
    }
    public static   String  xm36(int i)
    {      String xm36="";
        if(i==0) {xm36="2";} else {xm36="2";}
        return xm36;
    }
    public static   String  xm37(int i)
    {      String xm37="";
        if(i==0) {xm37="2";} else {xm37="2";}
        return xm37;
    }
    public static   String  xm38(int i)
    {      String xm38="";
        if(i==0) {xm38="2";} else {xm38="2";}
        return xm38;
    }
    public static   String  xm39(int i)
    {      String xm39="";
        if(i==0) {xm39="2";} else {xm39="2";}
        return xm39;
    }
    public static   String  xm40(int i)
    {      String xm40="";
        if(i==0) {xm40="2";} else {xm40="2";}
        return xm40;
    }
    public static   String  xm41(int i)
    {      String xm41="";
        if(i==0) {xm41="2";} else {xm41="2";}
        return xm41;
    }
    //查询
    public  static   Object[][] Object={
            {"0002","","Y","","","","","","",1},//最后一项，为是否验证导出，1为验证，0为不验证
            {"","","N","","","","","","",1},
            {"","DD2019021400021","N","","","","","","",0},
            {"","DD2019021400","N","","","","","","",0},
            {"","","","","","","","2019/2/14 00:00:00","2019/2/14 23:59:59",0},
            {"","","","","","","","2019/2/14 00:00:00","",0},
            {"","","","","","","","","2019/2/14 23:59:59",0},
          //  {"","","","2028392","","","","","2019/2/14 23:59:59",1}
    };
}
