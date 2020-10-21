package BasicAlgorithms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleConnection {

	public static void main(String[] args) throws SQLException {

		try {
			// step1 load the driver class
			Class.forName("oracle.jdbc.driver.OracleDriver");

			//create connect
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:49161:xe", "system", "oracle");

			//create statement
			Statement s = con.createStatement();

			//execute query and store in a result set
			ResultSet rs = s.executeQuery("select first_name, last_name from hr.employees where employee_id=100");

			//traverse the results and display result
			while (rs.next()) {
				// System.out.println("Connected");
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
				//System.out.println(rs.);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}