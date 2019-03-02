package pages;

import org.openqa.selenium.By;

/**
 * Created by Administrator on 2019/2/21.
 */
public class GoodsPages {
    // 商品录入单页面
    //行号
    public  static By hh(int row)
    {
           By hh=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr["+row+"]/td[1]/input");
        return hh;
    }

    //   商品编码
    public  static By spbm(int row) {
          By spbm = By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr["+row+"]/td[2]/input");
        return spbm;
    }
    // 供应商
    public  static By GYSValue(int row) {
        By GYSValue = By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr["+row+"]/td[3]/input[1]");
        return GYSValue;
    }
    public  static By GYS(int row) {
         By GYS = By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr["+row+"]/td[3]/input[2]");
        return GYS;
    }
    //    经营方式
    public  static By jyfs(int row) {
         By jyfs = By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr["+row+"]/td[4]/select");
        return  jyfs;
    }
    //    鞋码
    public  static By xiema(int row) {
       By xiema = By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr["+row+"]/td[5]/select");
        return  xiema;
    }
    //出厂价
    public  static By ccj(int row) {
        By ccj = By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr["+row+"]/td[6]/input");
        return  ccj;
    }
    //    包装费
    public  static By bzf(int row) {
        By bzf = By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr["+row+"]/td[7]/input");
        return  bzf;
    }
    //    进价
    public  static By jj(int row) {
          By jj = By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr["+row+"]/td[8]/input");
        return  jj;
    }
    //    批发售价
    public  static By pfsj(int row) {
        By pfsj = By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr["+row+"]/td[9]/input");
        return  pfsj;
    }
    //    区域
    public  static By qy(int row) {
          By qy = By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr["+row+"]/td[10]/select");
        return  qy;
    }
    //    产地
    public  static By cd(int row) {
          By cd = By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr["+row+"]/td[11]/select");
        return  cd;
    }
    // 季节
    public  static By jjie(int row) {
     By jjie=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr["+row+"]/td[12]/select");
        return  jjie;
    }
    //    品牌
    public  static By pp(int row) {
     By pp=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr["+row+"]/td[13]/input[2]");
      return  pp;
}
    public  static By ppValue(int row) {
       By ppValue=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr["+row+"]/td[13]/input[1]");
      return  ppValue;
              }
    //    公司货号
    public  static By gshh(int row) {
    By gshh=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr["+row+"]/td[14]/input");
        return  gshh;
    }
    //    厂商货号
    public  static By cshh(int row) {
    By cshh = By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr["+row+"]/td[15]/input");
        return  cshh;
    }
    //    颜色
    public  static By ys(int row) {
     By ys=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr["+row+"]/td[16]/input[2]");
        return  ys;
    }
    public  static By ysValue(int row) {
       By ysValue=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr["+row+"]/td[16]/input[1]");
       return  ysValue;
}
    //    品名
    public  static By pm(int row) {
          By pm = By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr["+row+"]/td[17]/input");
        return  pm;
    }
    //    性别
    public  static By xb(int row) {
       By xb=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr["+row+"]/td[18]/select");
        return  xb;
    }
    //    系列
    public  static By xl(int row) {
          By xl = By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr["+row+"]/td[19]/input[2]");
        return  xl;
    }
    public  static By xlValue(int row) {
       By xlValue=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr["+row+"]/td[19]/input[1]");
        return  xlValue;
    }
    //    鞋口
    public  static By xk(int row) {
       By xk=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr["+row+"]/td[20]/input[2]");
        return  xk;
    }
    public  static By xkValue(int row) {
       By xkValue=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr["+row+"]/td[20]/input[1]");
       return  xkValue;
}
    //    面料
    public  static By ml(int row) {
          By ml = By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr["+row+"]/td[21]/select");
        return  ml;
    }
    //    跟形
    public  static By gx(int row) {
       By gx=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr["+row+"]/td[22]/select");
        return  gx;
    }
    //    跟高
    public  static By gg(int row) {
          By gg = By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr["+row+"]/td[23]/select");
        return  gg;
    }
    //  底型
    public  static By dx(int row) {
       By dx=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr["+row+"]/td[24]/select");
        return  dx;
    }
    //    帮高
    public  static By bg(int row) {
       By bg=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr["+row+"]/td[25]/select");
        return  bg;
    }
    //    内里
        public  static By nl(int row) {
       By nl=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr["+row+"]/td[26]/input[2]");
            return  nl;
        }
    public  static By nlValue(int row) {
       By nlValue=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr["+row+"]/td[26]/input[1]");
        return  nlValue;
    }
    //    激光
    public  static By jg(int row) {
       By jg=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr["+row+"]/td[27]/select");
        return  jg;
    }
    //    毛口
    public  static By mk(int row) {
       By mk=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr["+row+"]/td[28]/select");
        return  mk;
    }
    //    亮钻
    public  static By lz(int row) {
       By lz=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr["+row+"]/td[29]/select");
        return  lz;
    }
    //    饰扣
    public  static By sk(int row) {
       By sk=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr["+row+"]/td[30]/select");
        return  sk;
    }
    //    内里材质
    public  static By nlcz(int row) {
       By nlcz=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr["+row+"]/td[31]/select");
        return  nlcz;
    }
    //    垫脚材质
    public  static By djcz(int row) {
       By djcz=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr["+row+"]/td[32]/select");
        return  djcz;
    }
    //    拉链
    public  static By ll(int row) {
       By ll=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr["+row+"]/td[33]/select");
        return  ll;
    }
    //    系带
    public  static By jd(int row) {
       By jd=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr["+row+"]/td[34]/select");
        return  jd;
    }
    //    生命周期
    public  static By smzq(int row) {
       By smzq=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr["+row+"]/td[35]/input");
        return  smzq;
    }
    //    退货周期
    public  static By thzq(int row) {
       By thzq=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr["+row+"]/td[36]/input");
        return  thzq;
    }
    //    年份
    public  static By nf(int row) {
       By nf=By.xpath("/html/body/form/div/div/div[2]/div[2]/div/table/tbody/tr["+row+"]/td[37]/input");
        return  nf;
    }
}
