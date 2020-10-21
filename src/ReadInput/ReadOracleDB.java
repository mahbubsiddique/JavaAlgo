package ReadInput;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadOracleDB {

	public static void main(String[] args) {
		

		try{  
			//step 1 load the driver class  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			  
			//step 2 create  the connection object  
			Connection con=DriverManager.getConnection(  
			"jdbc:oracle:thin:@localhost:1521:xe","system","oracle");  
			  
			//step 3 create the statement object  
			Statement stmt=con.createStatement();  
			  
			//step 4 execute query  
			ResultSet rs=stmt.executeQuery("select * from emp"); 
			
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			  
			//step 5 close the connection object  
			con.close();  
			  
			}catch(Exception e){ System.out.println(e);} 

	}

}
