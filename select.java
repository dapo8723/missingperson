package postgresql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class select {
	public void create() {}
	public select(String User) {}
	public static void main( String args[] )
    {
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
        ResultSet rs = stmt.executeQuery( "SELECT * FROM student2;" );
        while ( rs.next() ) {
           int id = rs.getInt("id");
           String  name = rs.getString("name");
           int age  = rs.getInt("age");
           System.out.println( "ID = " + id );
           System.out.println( "NAME = " + name );
           System.out.println( "AGE = " + age );
           System.out.println();
        }
        rs.close();
        stmt.close();
        c.close();
      } catch ( Exception e ) {
        System.err.println( e.getClass().getName()+": "+ e.getMessage() );
        System.exit(0);
      }
      System.out.println("表数据获取成功");
    }


}
