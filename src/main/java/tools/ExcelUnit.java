package tools;

import actions.Actions;
import log4j.LoggerControler;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.crypt.DataSpaceMapUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
/**
 * Created by Administrator on 2018/9/13.
 */
public class ExcelUnit
{
    final static LoggerControler log = LoggerControler.getLogger(ExcelUnit.class);
    public  static  Workbook getWorkbook(String filePath){
        Workbook wb=null;
        try {
if (filePath.endsWith(".xls"))
{
    File file=new File(filePath);
    InputStream  is=new FileInputStream(file);
    wb=new HSSFWorkbook(is);
}
else if(filePath.endsWith(".xlsx"))
{
    wb=new XSSFWorkbook(filePath);
}
        }catch (IOException e)
        {
e.printStackTrace();

        }
        return  wb;
    }
    public  static  String getCellValue(Cell cell)
    {
        String value="";
        switch (cell.getCellTypeEnum())
        {
            //字符
            case  STRING:
                value=String.valueOf(cell.getRichStringCellValue());
                return  value;
            //数字
            case NUMERIC:

                if (HSSFDateUtil.isCellDateFormatted(cell)) {
                    //如果是date类型则 ，获取该cell的date值
                    Date date = HSSFDateUtil.getJavaDate(cell.getNumericCellValue());
                    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    value = format.format(date);;
                }else {// 纯数字
                    BigDecimal big=new BigDecimal(cell.getNumericCellValue());
                    value = big.toString();
                    //解决1234.0  去掉后面的.0
                    if(null!=value&&!"".equals(value.trim())){
                        String[] item = value.split("[.]");
                        if(1<item.length&&"0".equals(item[1])){
                            value=item[0];
                        }
                    }
                }
                return  value;
            case FORMULA:
                //读公式计算值
                value = String.valueOf(cell.getNumericCellValue());
                if (value.equals("NaN")) {// 如果获取的数据值为非法值,则转换为获取字符串
                    value = cell.getStringCellValue().toString();
                }
              return  value;

            case  BOOLEAN:
                value=String.valueOf(cell.getBooleanCellValue());
                return  value;
            //空值
            case BLANK:
                value = "";
                break;
            // 故障
            case ERROR:
                value = "";
                break;
            default:
                value = cell.getStringCellValue().toString();

        }
        return  value;
    }
    public  static String getCellValue(Sheet sheet,int rowNum,int cellNum)
    {
Cell cell=sheet.getRow(rowNum).getCell(cellNum);
        String value=ExcelUnit.getCellValue(cell);
        return  value;
    }

//    public  Object [][] testDate(String file)
//    {
    //file:文件路径  startRowCell：列键值对的首行
  public  Object [][] testDate(String file,int startRowCell)
    {
        ArrayList<String> arrkey=new ArrayList<String>();
        Workbook workbook=ExcelUnit.getWorkbook(file);
        Sheet sheet=workbook.getSheetAt(0);
        //获取总行数
        int rowTotalNum=sheet.getLastRowNum()+1;
//        获取总列数
        int  columns=sheet.getRow(startRowCell).getPhysicalNumberOfCells();
        log.info("rowTotalNum："+rowTotalNum);
        log.info("columns："+columns);
      HashMap<String,String>[][] map=new HashMap[rowTotalNum-1][1];
//对数组中所有元素hashmap进行初始化
        if(rowTotalNum>1){
            for (int i = 0; i < rowTotalNum; i++) {

                    try {
                        map[i][0] = new HashMap();
                    }catch (Exception e)
                    {
                       log.info("错误信息："+e.getMessage());
                    }

            }

        }
        else{
log.info("测试excel"+file+"中没有数据");
        }

        //获得首行的列名，作为hashmap的key值
        for (int c = 0; c < columns; c++) {

            String cellvalue=ExcelUnit.getCellValue(sheet,startRowCell,c);
            arrkey.add(cellvalue);
        }
        //遍历所有单元格的值添加到hashmap中
        for (int r = startRowCell+1; r <rowTotalNum ; r++) {//值从 startRowCell+1行开始
            for (int c = 0; c < columns; c++) {
                String cellValue=ExcelUnit.getCellValue(sheet,r,c);//获取每行的内容
                map[r-(startRowCell+1)][0].put(arrkey.get(c),cellValue);
            }
        }
        log.info("成功执行"+map);
        return  map;
    }
}


