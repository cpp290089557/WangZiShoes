package com.steps;
import Information.FaHuoDanInfo;
import Information.LoginUserInfo;
import actions.Actions;
import actions.FaHuoDanAction;
import actions.YanShouDanAction;
import cucumber.api.PendingException;
        import cucumber.api.java.zh_cn.并且;
        import cucumber.api.java.zh_cn.当;
        import cucumber.api.java.zh_cn.假如;
        import cucumber.api.java.zh_cn.那么;
import drivers.SeleniumDriver;
import pages.HomePage;
import pages.MenuPage;

import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by Administrator on 2019/2/15.
 */
public class steps {

        @当("^登录王子鞋城总店$")
        public void openUrl() throws InterruptedException {
            LoginUserInfo.login(0);//登录
            System.out.println("登录王子鞋城成功");
        }

        @并且("^我新增发货单$")
        public void insertFaHuoDan() throws InterruptedException, SQLException, ClassNotFoundException, IOException {
            LoginUserInfo.clickDjTest(MenuPage.fhd); //进入订单页面；
            FaHuoDanAction.insertORupdateFaHuoDan(0);
            System.out.println("我新增发货单");
        }
    @并且("^我审核发货单$")
    public void faHuoDanShenHe() throws InterruptedException, SQLException, ClassNotFoundException, IOException {
        FaHuoDanAction.faHuoDanShenHe();
        SeleniumDriver.closedAll();//关闭页面
        System.out.println("我审核发货单成功；关闭页面");
    }
    @并且("^我登录门店$")
    public void loginMD() throws InterruptedException, SQLException, ClassNotFoundException, IOException {
        LoginUserInfo.login(1);
        LoginUserInfo.clickDjTest(MenuPage.ysdMD);
        System.out.println("我我登录门店；");
    }
    @并且("^我编辑门店验收单$")
    public void updateYanShouDan() throws InterruptedException, SQLException, ClassNotFoundException, IOException {
        YanShouDanAction.updateYanShouDan();
        System.out.println("我编辑门店验收单；");
    }
    @并且("^我审核验收单$")
    public void shenHeYanShouDan() throws InterruptedException, SQLException, ClassNotFoundException, IOException {
        YanShouDanAction.shenHeYanShouDan();
        System.out.println("我审核验收单;");
    }
        @那么("^我新增并审核录入单成功，页面关闭$")
        public void close()  {
            SeleniumDriver.closedAll();
           System.out.println("我新增及审核发货单成功，页面关闭；");
        }


}
