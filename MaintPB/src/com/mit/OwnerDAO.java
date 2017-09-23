package com.mit;
import java.sql.*;
public class OwnerDAO {

	static Connection conn;
	static PreparedStatement pst;
	
	public static int insertOwner(OwnerBean u) {
		int status=0;
		try {
		conn=ConnProvider.getCon();
		pst=conn.prepareStatement("INSERT INTO myschema.owner(\r\n" + 
				"	ownid, fullname, mailadr, deptname, posdescr)\r\n" + 
				"	VALUES (?, ?, ?, ?, ?)");
		pst.setInt(1, u.getOwnID());
		pst.setString(2, u.getFullName());
		pst.setString(3, u.getMailAdr());
		pst.setString(4, u.getDeptName());
		pst.setString(5, u.getPosDescr());
		status=pst.executeUpdate();
		conn.close();
		
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return status;
	}
}
