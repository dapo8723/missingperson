package postgresql;

import java.sql.ResultSet;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MissingPersonsDbOperator {
	private Operation op = null;

	public MissingPersonsDbOperator() {
		op = new Operation("jdbc:postgresql://localhost:5432/test", "postgres","123456");
		op.connect();
	}
	public MissingPersons queryMissingPersonsById(String id) {
		try {
			String sql ="select * from missingpersons4 where ID=" + id;
			ResultSet rs = op.executeQuery(sql);
			MissingPersons Miss = getString(rs);
			return Miss;
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			return null;
		}
	}
	
	public MissingPersons queryMissingPersonsByName(String name) {
		
		try {
		String sql ="select * from missingpersons4 where NAME='" + name+"'";
		ResultSet rs = op.executeQuery(sql);
		MissingPersons Miss = getString(rs);
		return Miss;
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			return null;
		}
	}
	
	
	public MissingPersons queryMissingPersonsByAge(String age) {
		try {
			String sql ="select * from missingpersons4 where AGE="+age;
			ResultSet rs = op.executeQuery(sql);
			MissingPersons Miss = getString(rs);
			return Miss;
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			return null;
		}
	}
	
	public MissingPersons queryMissingPersonsBySex(String sex) {
		try {
			String sql ="select * from missingpersons4 where SEX='"+ sex+"'";
			ResultSet rs = op.executeQuery(sql);
			MissingPersons Miss = getString(rs);
			return Miss;
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			return null;
		}
	}
	
	
public MissingPersons getString(ResultSet rs) throws SQLException {
		rs.next();
		String sId = rs.getString("id");
		String sName = rs.getString("name");
		String sAge = rs.getString("age");
		String sSEX  = rs.getString("Sex");
		String sMIS_LOCATION = rs.getString("MIS_LOCATION");
		String sDETAIL = rs.getString("DETAIL");
		String sDETAIL_OF_CASE = rs.getString("DETAIL_OF_CASE");
		String sPIC_URL = rs.getString("PIC_URL");
		String sMISS_REGION = rs.getString("MISS_REGION");
		String sPLICE_NAME = rs.getString("PLICE_NAME");
		String sPLICE_TEL = rs.getString("PLICE_TEL");
		String sMSG_URL = rs.getString("MSG_URL");
		String sPIC_BYTE  = rs.getString("PIC_BYTE");
		MissingPersons Miss = new MissingPersons();
		Miss.setId(sId);
		Miss.setName(sName);
		Miss.setAge(sAge);
		Miss.setSex(sSEX);
		Miss.setMIS_LOCATION(sMIS_LOCATION);
		Miss.setDETAIL(sDETAIL);
		Miss.setDETAIL_OF_CASE(sDETAIL_OF_CASE);
		Miss.setPIC_URL(sPIC_URL);
		Miss.setMISS_REGION(sMISS_REGION);
		Miss.setPLICE_NAME(sPLICE_NAME);
		Miss.setPLICE_NAME(sPLICE_TEL);
		Miss.setMSG_URL(sMSG_URL);
		Miss.setPIC_BYTE(sPIC_BYTE);
		return Miss;
	}
	
}	