package com.nirakar.boot.jdbc.test;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestMySQLConnection {

	public static void main(String[] args) {
		try{
			
			String url="jdbc:mysql://localhost:3306/sf";
			String user="root";
			String password ="root";
			java.sql.Connection con = DriverManager.getConnection(url,user,password);
			Statement st=con.createStatement();
			boolean set=st.execute("Select username,password from LOGIN");
			System.out.println(set);
		}catch(Exception ex){
			
		}finally
		{
			
		}
	}
}
