package Information;

import org.openqa.selenium.By;
import tools.RandomNum;

/**
 * Created by Administrator on 2019/2/19.
 */
public class GoodsInfo {
//    新增商品
//    供应商
    public  static String gys="a001-宜昌飞美";
    public  static String gysValue="a001";
    //    经营方式
    public  static String jyfs="自营";
    //    尺码
    public  static String xiema="女鞋";
    //出厂价
    public  static String ccj="30";
    //    包装费
    public  static String bzf="10";
    //    进价
    public  static String jj="60";
    //    批发售价
    public  static String pfsj="70";
    //    区域
    public  static String qy="另类";
    //    产地
    public  static String cd="广州";
    // 季节
    public  static String jjie="秋冬";
    //    品牌
    public  static String pp="B333-百丽特";
    public  static String ppT="百丽特";
    public  static String ppValue="B333";
    //    公司货号

    public  static String gshh="g"+RandomNum.getRandomNum(4);
    //    厂商货号
    public  static String cshh="cs0001";
    //    颜色
    public  static String ys="黑红";
    public  static String ysValue="15";
    //    品名
    public  static String pm=ppT+gshh+ys;
    //    性别
    public  static String xb="女鞋";
    //    系列
    public  static String xl="鞋擦";
    public  static String xlValue="2";
    //    鞋口
    public  static String xk="中口";
    public  static String xkValue="5";
    //    面料
    public  static String ml="真皮";
    //    跟形
    public  static String gx="正常";
    //    跟高
    public  static String gg="中跟";
    //  底型
    public  static String dx="坡跟";
    //    帮高
    public  static String bg="矮帮";
    //    内里
    public  static String nl="网里";
    public  static String nlValue="3";
    //    激光
    public  static String jg="激光打透";
    //    毛口
    public  static String mk="有";
    //    亮钻
    public  static String lz="有";
    //    饰扣
    public  static String sk="图案";
    //    内里材质
    public  static String nlcz="皮";
    //    垫脚材质
    public  static String djzz="内增高";
    //    拉链
    public  static String ll="有";
    //    系带
    public  static String jd="有";
    //    生命周期
    public  static String smzq="2019-04-19";
    //    退货周期
    public  static String thzq="2019-09-19";
    //    年份
    public  static String nf="2019-08-19";


//修改商品
    //    供应商
    public  static String gysU="S003-天雨鸟";
    public  static String gysValueU="S003";
    //    经营方式
    public  static String jyfsU="经销";
    //    尺码
    public  static String xiemaU="婴儿鞋";
    //出厂价
    public  static String ccjU="31";
    //    包装费
    public  static String bzfU="11";
    //    进价
    public  static String jjU="61";
    //    批发售价
    public  static String pfsjU="71";
    //    区域
    public  static String qyU="流行前沿";
    //    产地
    public  static String cdU="本地";
    // 季节
    public  static String jjieU="秋";
    //    品牌
    public  static String ppU="173-麦克狼袋鼠";
    public  static String ppTU="麦克狼袋鼠";
    public  static String ppValueU="173";
    //    公司货号

    public  static String gshhU="g"+RandomNum.getRandomNum(4);
    //    厂商货号
    public  static String cshhU="cs0002";
    //    颜色
    public  static String ysU="黑白";
    public  static String ysValueU="14";
    //    品名
    public  static String pmU=ppTU+gshhU+ysU;
    //    性别
    public  static String xbU="男童";
    //    系列
    public  static String xlU="网靴";
    public  static String xlValueU="16";
    //    鞋口
    public  static String xkU="浅口";
    public  static String xkValueU="3";
    //    面料
    public  static String mlU="PU";
    //    跟形
    public  static String gxU="吊跟";
    //    跟高
    public  static String ggU="平跟";
    //  底型
    public  static String dxU="正常";
    //    帮高
    public  static String bgU="高帮";
    //    内里
    public  static String nlU="羊羔毛";
    public  static String nlValueU="10";
    //    激光
    public  static String jgU="激光不透";
    //    毛口
    public  static String mkU="无";
    //    亮钻
    public  static String lzU="无";
    //    饰扣
    public  static String skU="珍珠";
    //    内里材质
    public  static String nlczU="棉";
    //    垫脚材质
    public  static String djzzU="无";
    //    拉链
    public  static String llU="无";
    //    系带
    public  static String jdU="无";
    //    生命周期
    public  static String smzqU="2019-04-11";
    //    退货周期
    public  static String thzqU="2019-09-11";
    //    年份
    public  static String nfU="2019-08-11";


     //查询
    public  static   Object[][] Object={
            {"","Y","","","","","","",1},//最后一项，为是否验证导出，1为验证，0为不验证
            {"","N","","","","","","",1},
            {"DD2019021400021","N","","","","","","",0},
            {"DD2019021400","N","","","","","","",0},
            {"","","","","","","2019/2/14 00:00:00","2019/2/14 23:59:59",0},
            {"","","","","","","2019/2/14 00:00:00","",0},
            {"","","","","","","","2019/2/14 23:59:59",0},
           // {"","","2028392","","","","","2019/2/14 23:59:59",1}
    };

}
