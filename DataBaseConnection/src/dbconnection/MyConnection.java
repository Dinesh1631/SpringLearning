package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MyConnection {
	 public static void main(String args[]) throws Exception{
	        String sql = "select * from students";
	        String url = "jdbc:mysql://localhost:3306/dineshdb";
	        String userName = "root";
	        String password ="Dinesh@123";

	        Connection con = DriverManager.getConnection(url, userName, password);

	        Statement st = con.createStatement();
	        ResultSet rs = st.executeQuery(sql);
	        // rs.next();
	        while(rs.next())
	        {
	            System.out.println("Student ID :"+ rs.getInt(1)+" "+"Student Name :"+rs.getString(2)+"    "+"Student Age :"+rs.getInt(3));
	        }
	        con.close();

	    }
}
