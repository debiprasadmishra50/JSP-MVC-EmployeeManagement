package com.db;
import java.sql.*;
	public class Provider 
	{
		public static Connection  getOracleConnection()
		{
			Connection con=null;
			try
			{
				Class.forName("oracle.jdbc.OracleDriver");
				con=DriverManager.getConnection
						("jdbc:oracle:thin:@localhost:1521:xe","system", "lit");
								
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return con;
		}
		public static Connection  getMysqlConnection()
		{
			Connection con=null;
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				con=DriverManager.getConnection
						("jdbc:mysql://localhost:3306/db1","root","litindia");
								
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return con;
		}
		

	


}
