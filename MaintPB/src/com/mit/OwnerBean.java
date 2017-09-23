package com.mit;
import java.sql.*;
public class OwnerBean {
	int ownID;
	String fullName;
	String mailAdr;
	String deptName;
	String posDescr;
	/**
	 * @return the ownID
	 */
	public int getOwnID() {
		return ownID;
	}
	/**
	 * @param ownID the ownID to set
	 */
	public void setOwnID(int ownID) {
		this.ownID = ownID;
	}
	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}
	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	/**
	 * @return the mailAdr
	 */
	public String getMailAdr() {
		return mailAdr;
	}
	/**
	 * @param mailAdr the mailAdr to set
	 */
	public void setMailAdr(String mailAdr) {
		this.mailAdr = mailAdr;
	}
	/**
	 * @return the deptName
	 */
	public String getDeptName() {
		return deptName;
	}
	/**
	 * @param deptName the deptName to set
	 */
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	/**
	 * @return the posDescr
	 */
	public String getPosDescr() {
		return posDescr;
	}
	/**
	 * @param posDescr the posDescr to set
	 */
	public void setPosDescr(String posDescr) {
		this.posDescr = posDescr;
	}
	
	
	

}
