package pages;

import org.openqa.selenium.By;

/**
 * Created by Administrator on 2019/2/26.
 */
public class FaHuoDanPages {
    //行号
    public  static By hh(int row) {
    By hh=By.xpath("/html/body/div/div/div[2]/div[2]/div/table/tbody/tr["+row+"]/td[1]/input");
        return  hh;
    }
//商品编码
public  static By spbm(int row) {
    By spbm=By.xpath("/html/body/div/div/div[2]/div[2]/div/table/tbody/tr["+row+"]/td[2]/input");
    return  spbm;
}
//售价
public  static By sj(int row) {
    By sj=By.xpath("/html/body/div/div/div[2]/div[2]/div/table/tbody/tr["+row+"]/td[8]/input[1]");
    return  sj;
}
    //进价
    public  static By jj(int row) {
        By jj=By.xpath("/html/body/div/div/div[2]/div[2]/div/table/tbody/tr["+row+"]/td[5]");
        return  jj;
    }
    //数量合计
    public  static By slhj(int row) {
        By slhj=By.xpath("/html/body/div/div/div[2]/div[2]/div/table/tbody/tr["+row+"]/td[11]/input");
        return  slhj;
    }
//    售价合计
public  static By sjhj(int row) {
    By sjhj=By.xpath("/html/body/div/div/div[2]/div[2]/div/table/tbody/tr["+row+"]/td[13]");
    return  sjhj;
}
//    进价合计
public  static By jjhj(int row) {
    By jjhj=By.xpath("/html/body/div/div/div[2]/div[2]/div/table/tbody/tr["+row+"]/td[12]");
    return  jjhj;
}
//加价率
public  static By jjl(int row) {
    By jjl=By.xpath("/html/body/div/div/div[2]/div[2]/div/table/tbody/tr["+row+"]/td[6]");
    return  jjl;
}
}
