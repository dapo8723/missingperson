package postgresql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Operation {
	private static final ResultSet rs = null;
	private String username;
	private String URL;
	private String password;

	public Operation(String url, String uname, String pwd) {
		this.username = uname;
		this.URL = url;
		this.password = pwd;
	}

	private Connection c = null;

	
	private Statement stmt = null;

	/*public Connection getConn() {
		return c;
	}

	public void setUsername(String uname) {
		this.username = uname;
	}

	public String getUsername() {
		return username;
	}

	public void setConn(Connection conn) {
		this.c = conn;
	}
	 */
	public void connect() {
		try {
			Class.forName("org.postgresql.Driver");
			c = DriverManager
					.getConnection(URL,
							username, password);
			c.setAutoCommit(false);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getClass().getName()+": "+e.getMessage());
			System.exit(0);
		}
		System.out.println("���ݿ����ӳɹ�");
	}

	/**
	 * ִ�����ݿ����
	 * @param sql 
	 * @return
	 */
	public int executeUpdate(String sql) {
		
	int result = -1;
		try { 
		stmt = c.createStatement();
			result=stmt.executeUpdate(sql);

			
			//stmt.executeUpdate(udt);
			//c.commit();
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		System.out.println(result);
		return result;	
	}

	public ResultSet executeQuery(String sql) {
		ResultSet rs = null;

		try {
			stmt = c.createStatement();
			rs = stmt.executeQuery(sql);

		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();

		}

		return rs; 
	}
	
	


	public static void main(String args[]) {
		Operation op = new Operation("jdbc:postgresql://localhost:5432/test", "postgres","123456");
		//		Operation er = new Operation();
		//String sql = null;
		//		op.create();
		//op.insert();
		//op.delete();
		//op.update();
		//op.select();
		//		er.executeQuery(del);
		 String del ="DELETE from student2 where ID=2;";
	     String udt ="UPDATE student2 set age = 21 where ID=2;";
		//op.executeUpdate(del);
	}

}