package tools;

import log4j.LoggerControler;

import java.util.Random;

/**
 * Created by Administrator on 2018/9/12.
 */
public class RandomNum {
    final static LoggerControler log = LoggerControler.getLogger(RandomNum.class);
    //生成N位数的随机数
    public static  String  getRandomNum(int length)
    {
       String  str="";
        str=String.valueOf((long)(Math.random()*Math.pow(10,length)));
        log.info("生成"+length+"位随机数:"+str);
        return  str;
    }
    //生成区间随机数，【min，max】
    public  static  int getRandomNum(int min,int max)
    {
        int num=0;
        Random random=new Random();
        //random.nextInt(10),表示输出大于等于1小于10的随机数
      num= random.nextInt(max-min+1)+min;
        log.info("生成"+min+"到"+max+"随机数:"+num);
        return  num;
    }
    //生成字母+数字的随机数
    public  static String getNumCharRandom(int length)
    {
       String   val="";
        Random random=new Random();
        for (int i = 0; i < length; i++) {
String charornum=random.nextInt(2)%2==0 ? "char":"num";
            if (charornum.equals("char")) {
                int tem=random.nextInt(2)%2==0 ? 65:97;
                val +=(char)(random.nextInt(26)+tem);
            }
            else
                {
                    val +=String.valueOf(random.nextInt(10));
                }
        }
        log.info("生成数字加字母的"+length+"位数随机数:"+val);
        return  val;
    }
}
