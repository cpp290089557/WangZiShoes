package tools;

import java.io.File;

/**
 * Created by Administrator on 2018/9/12.
 */
public class MyFile {
    //判断文件是否存在
    public  static  boolean fileExists(String  filePath)
    {
        File file=new File(filePath);
        Boolean b=file.exists();
return  b;
    }
    //判断文件是否存在，没有就新建
    public  static  void creatFile(String filePath)
    {
if(!MyFile.fileExists(filePath))
{
File file=new File(filePath);
file.mkdir();
}
    }
}
