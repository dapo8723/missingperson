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
	         System.out.println("���ݿ����ӳɹ�");

	         stmt = c.createStatement();
	         String sql = "INSERT INTO missingpersons4 (ID,NAME,AGE,SEX,MIS_LOCATION,DETAIL,DETAIL_OF_CASE,PIC_URL,MISS_REGION,PLICE_NAME,PLICE_TEL,MSG_URL,PIC_BYTE) "
	               + "VALUES (2310384000, '������',13,'Ů','����ʡ������̫���ؿ���������ίԱ��̫�ʹ��̫�Ͱ��б�1000��','2018��12��24��21ʱ�������ƴ�̫���ؾ��ÿ��������ſ�����c9�������������������δ�顣�ּ����ѱ������Ҿ֡���ʱ����ɫ�̿�','�Ҿ�����2019��1��29��16ʱ�����㽭��Ϫ��Ԫ��һ���������ҵ���ϵ�����������', 'https://ww2.sinaimg.cn/thumb180/4e704b16ly1fz86lq7uy3j20u0140dkw.jpg','����','������','18155816761','https://m.weibo.cn/api/container/getIndex?containerid=2310384000&luicode=10000011&lfid=1076035918987931','    ');";
	         stmt.executeUpdate(sql);

//	         sql = "INSERT INTO student2 (ID,NAME,AGE) "
//	               + "VALUES (2, 'С��', 20);";
//	         stmt.executeUpdate(sql);

	         stmt.close();
	         c.commit();
	         c.close();
	      } catch (Exception e) {
	         System.err.println( e.getClass().getName()+": "+ e.getMessage() );
	         System.exit(0);
	      }
	      System.out.println("����Ϣ����ɹ�");
	   }


}
