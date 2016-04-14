package general;

import java.sql.*;

public class DatabaseCon {
	public static void main(String[] args) {
		String dbURL = "jdbc:oracle:thin:whiteboxqa/Excellence@hr.cwjgdp1wxdy2.us-west-1.rds.amazonaws.com:1521:ORCL";
		String username = "whiteboxqa";
		String password = "Excellence";
		try {
			Connection con=DriverManager.getConnection(dbURL,username,password);
			if (con != null) {
		        System.out.println("Connected");
		    }
			String sql = "SELECT * FROM JOBS";
			Statement statement = con.createStatement();
			ResultSet result = statement.executeQuery(sql);
			while (result.next()){
			   System.out.println(result.getString("JOB_ID"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
