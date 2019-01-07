package com.nirakar.springjdbc.util;


public class Query {
	
	public static final String SELECT_ALL_LOGIN="SELECT * FROM LOGIN";
	public static final String SELECT_USERNAME_LOGIN = "SELECT * FROM LOGIN WHERE username = ?";
	public static final String UPDATE_PASSWORD_LOGIN = "UPDATE LOGIN SET  password=? WHERE username=?";
	//INSERT INTO LOGIN (USERNAME,PASSWORD,DATE) VALUES('naman','naman',CURRENT_TIMESTAMP());
	public static final String INSERT_NEW_USER_LOGIN = "INSERT INTO LOGIN (USERNAME,PASSWORD,DATE) values (?, ?, ?)";
	public static final String SELECT_ALL_FLAT = "SELECT * FROM FLAT";
	   

}
