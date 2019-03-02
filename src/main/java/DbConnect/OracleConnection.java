package DbConnect;

import log4j.LoggerControler;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import oracle.jdbc.driver.OracleDriver;
/**
 * Created by Administrator on 2019/1/17.
 */
public class OracleConnection {
    final static LoggerControler logger = LoggerControler.getLogger(OracleConnection.class);
    static Connection con = null;

    public Connection getConnection() throws IOException, ClassNotFoundException, SQLException {
//1、准备连接数据库的4个字符串,properties文件中写入
        logger.info("进入getConnection（）");
        //调用配置文件
        Properties properties = new Properties();
        String path=System.getProperty("user.dir");
        String CONFIGFILE =path+ "\\configs\\oracle.properties";
        logger.info("配置文件路径："+CONFIGFILE);
        //new FileInputStream("c:\\xiaozhi.properties")
        properties.load(new FileInputStream(CONFIGFILE));
        //properties.load(this.getClass().getResourceAsStream(CONFIGFILE));
        logger.info("调用sql配置文件");
        String driver = properties.getProperty("jdbc.driver");
        String url = properties.getProperty("jdbc.url");
        String user = properties.getProperty("jdbc.username");
        String password = properties.getProperty("jdbc.password");
//1)第一步：注册驱动
        logger.info("注册驱动开始");
   //Class.forName(driver);
       Driver driver1 = new OracleDriver();
        DriverManager.deregisterDriver(driver1);
        logger.info("注册驱动结束");
        //第二步：获取连接,用户名，密码
        logger.info(url+" "+user+" "+password);
        con = DriverManager.getConnection(url, user, password);
        logger.info("链接getConnection（）完毕："+con);
        return con;

    }

    //查询数据库方法，返回结果集
    public ResultSet querySql(String sql) throws SQLException, IOException, ClassNotFoundException {
        logger.info("进入querySql（）");
        con=getConnection();
        //查询数据库
        ResultSet resultSet = null;
        Statement statement = null;
        logger.info("数据库连接成功，createStatement（）");
        statement = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        logger.info("数据库连接成功");
        logger.info(sql);
        resultSet = statement.executeQuery(sql);
     /*   while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String city = resultSet.getString("city");
            System.out.println(id + "   " + name + "   " + city);  //打印输出结果集
        }*/

        return  resultSet;
    }


    //数据库插入数据方法
   /* public void Insert(String sql)throws SQLException{
        Statement SQL;
        SQL = con.createStatement();
        SQL.execute(sql);
    }*/
    //关闭连接的方法
    public void close() throws SQLException{
        if(!con.isClosed()){
            con.close();
        }
    }


}
