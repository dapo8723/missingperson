package postgresql;

import java.sql.ResultSet;


public class Tester1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		MissingPersonsDbOperator missOp = new MissingPersonsDbOperator();
//		MissingPersons Miss = missOp.queryMissingPersonsById("2310384000");
		MissingPersons Miss = missOp.queryMissingPersonsByName("李云云");	
//	    MissingPersons Miss = missOp.queryMissingPersonsByAge("13");	
//  	MissingPersons Miss = missOp.queryMissingPersonsBySex("女");		
		System.out.print(Miss.getId());
		System.out.print(Miss.getName());
		System.out.print(Miss.getAge());
		System.out.print(Miss.getSex());
		System.out.print(Miss.getMIS_LOCATION());
		System.out.print(Miss.getDETAIL());
		System.out.print(Miss.getDETAIL_OF_CASE());
		System.out.print(Miss.getPIC_URL());
		System.out.print(Miss.getMISS_REGION());
		System.out.print(Miss.getPLICE_NAME());
		System.out.print(Miss.getPLICE_TEL());
		System.out.print(Miss.getMSG_URL());
		System.out.print(Miss.getPIC_BYTE());	
	
	}

}
