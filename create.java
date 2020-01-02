package postgresql;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class create {
   public static void main( String args[] )
     {
       Connection c = null;
       Statement stmt = null;
       try {
       Class.forName("org.postgresql.Driver");
  	     c = DriverManager
  	         .getConnection("jdbc:postgresql://localhost:5432/test",
  	    	 "postgres", "123456");
  	    	 System.out.println("数据库连接成功");
  			
         stmt = c.createStatement();
         String sql = "CREATE TABLE missingpersons4 " +
                      "(ID           BIGINT    NOT NULL,"+ 
                      "NAME      TEXT      NOT NULL,"+
                      "AGE            INT     NOT NULL," +
                      "SEX         TEXT       NOT NULL,"+
                      "MIS_LOCATION    TEXT      NOT NULL,"+
                      " DETAIL          TEXT    NOT NULL, " +
                      " DETAIL_OF_CASE            TEXT     NOT NULL,"  +
                      "PIC_URL    TEXT    NOT NULL,"+
                      "MISS_REGION      TEXT      NOT NULL,"+
                      "PLICE_NAME   TEXT     NOT NULL,"+
                      "PLICE_TEL    TEXT      NOT NULL, "+
                      "MSG_URL    TEXT    NOT NULL,"+
                       "PIC_BYTE   TEXT     NOT NULL) ";
         stmt.executeUpdate(sql);
         stmt.close();
         c.close();
       } catch ( Exception e ) {
         System.err.println( e.getClass().getName()+": "+ e.getMessage() );
         System.exit(0);
       }
       System.out.println("数据表创建成功");
     }

     }


