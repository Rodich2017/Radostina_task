package com.mit;
import java.sql.*;
public class PhoneDAO {
	static Connection conn;
	static PreparedStatement pst;
	
	public static int insertPhone(PhoneBean u) {
		int status=0;
		try {
		conn=ConnProvider.getCon();
		pst=conn.prepareStatement("INSERT INTO myschema.phones(\r\n" + 
				"	pid, phnum, phown, phtype, phstat, notes)\r\n" + 
				"	VALUES (?, ?, ?, ?, ?, ?);");
		pst.setInt(1, u.getPid());
		pst.setString(2, u.getPhnum());
		pst.setLong(3, u.getPhown());
		pst.setString(4, u.getPhtype());
		// pole phstatus = 1 / 0 
		// da procheta kak da stane
		// pst.setString(5, u.  ......
		pst.setString(6 , u.getNotes());
		
		
		status=pst.executeUpdate();
		conn.close();
		
		} catch(Exception  ex) {
			System.out.println(ex.getMessage());
		}
		return status;
	}
}
