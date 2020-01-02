package postgresql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class insert {
	public static void main(String args[]) {
	      Connection c = null;
	      Statement stmt = null;
	      try {
	         Class.forName("org.postgresql.Driver");
	         c = DriverManager
	            .getConnection("jdbc:postgresql://localhost:5432/test",
	            "postgres", "123456");
	         c.setAutoCommit(false);
	         System.out.println("数据库连接成功");

	         stmt = c.createStatement();
	         String sql = "INSERT INTO missingpersons4 (ID,NAME,AGE,SEX,MIS_LOCATION,DETAIL,DETAIL_OF_CASE,PIC_URL,MISS_REGION,PLICE_NAME,PLICE_TEL,MSG_URL,PIC_BYTE) "
	               + "VALUES (2310384000, '李云云',13,'女','安徽省阜阳市太和县开发区管理委员会太和大道太和八中北1000米','2018年12月24日21时许，李云云从太和县经济开发区宝雅凯旋门c9拣家中与好友外出，至今未归。现家人已报案至我局。走时穿白色短款','我局民警于2019年1月29日16时许在浙江慈溪开元街一出租屋内找到，系和朋友外出。', 'https://ww2.sinaimg.cn/thumb180/4e704b16ly1fz86lq7uy3j20u0140dkw.jpg','阜阳','滕洪亮','18155816761','https://m.weibo.cn/api/container/getIndex?containerid=2310384000&luicode=10000011&lfid=1076035918987931','    ');";
	         stmt.executeUpdate(sql);

//	         sql = "INSERT INTO student2 (ID,NAME,AGE) "
//	               + "VALUES (2, '小亮', 20);";
//	         stmt.executeUpdate(sql);

	         stmt.close();
	         c.commit();
	         c.close();
	      } catch (Exception e) {
	         System.err.println( e.getClass().getName()+": "+ e.getMessage() );
	         System.exit(0);
	      }
	      System.out.println("表信息插入成功");
	   }


}
