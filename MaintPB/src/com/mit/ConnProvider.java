package com.mit;
import java.sql.*;
public class ConnProvider implements Provider {
	static Connection conn=null;
	public static Connection getCon() {
		try {
			Class.forName("org.postgresql.driver");
			conn=DriverManager.getConnection(connURL,username,password);		
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return conn;
	}
}
