package JavaBasics.Automation;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.ResultSet;

import java.sql.*;

import java.sql.Statement;
public class Sqlconnection {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		try{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://10.0.1.86:3306/tatoc","tatocuser","tatoc01");  
		//here sonoo is database name, root is username and password  
		Statement stmt=con.createStatement();  
		//String query="select * from identity;";
		String query="select * from credentials;";
		
		ResultSet rs=stmt.executeQuery(query);  
		//ResultSet rs1-stmt.execute(query1);
		
		while(rs.next())  
		{
		String n=rs.getString(1);
		String password=rs.getString(2);
		String col=rs.getString(3);
		//String colu=rs.getString(4);
		System. out.println(n+"  "+password+" "+col);
		ResultSetMetaData rsmd = rs.getMetaData();
		 String id = rsmd.getColumnName(1);
		 String  name= rsmd.getColumnName(2);
		 String  passkey= rsmd.getColumnName(3);
		 System. out.println(id);
		 System. out.println(name);
		 
		 System. out.println(passkey);
		/*while(rs.next())  
		{
		String n=rs.getString(1);
		String password=rs.getString(2);
		//String col=rs.getString(3);
		//String colu=rs.getString(4);
		System. out.println(n+"  "+password);
		ResultSetMetaData rsmd = rs.getMetaData();
		 String id = rsmd.getColumnName(1);
		 String  name= rsmd.getColumnName(2);
		 System. out.println(id);
		 System. out.println(name);*/
		}
		con.close();
		}
		catch(Exception e){ System.out.println(e);
		}
		}  
		
		}  

