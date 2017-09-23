package com.mit;
import java.sql.*;
public class PhoneBean {
	int pid;
	String phnum;
	int phown;
	String phtype;
	boolean phstat;
	String notes;
	/**
	 * @return the pid
	 */
	public int getPid() {
		return pid;
	}
	/**
	 * @param pid the pid to set
	 */
	public void setPid(int pid) {
		this.pid = pid;
	}
	/**
	 * @return the phnum
	 */
	public String getPhnum() {
		return phnum;
	}
	/**
	 * @param phnum the phnum to set
	 */
	public void setPhnum(String phnum) {
		this.phnum = phnum;
	}
	/**
	 * @return the phown
	 */
	public int getPhown() {
		return phown;
	}
	/**
	 * @param phown the phown to set
	 */
	public void setPhown(int phown) {
		this.phown = phown;
	}
	/**
	 * @return the phtype
	 */
	public String getPhtype() {
		return phtype;
	}
	/**
	 * @param phtype the phtype to set
	 */
	public void setPhtype(String phtype) {
		this.phtype = phtype;
	}
	/**
	 * @return the phstat
	 */
	public boolean isPhstat() {
		return phstat;
	}
	/**
	 * @param phstat the phstat to set
	 */
	public void setPhstat(boolean phstat) {
		this.phstat = phstat;
	}
	/**
	 * @return the notes
	 */
	public String getNotes() {
		return notes;
	}
	/**
	 * @param notes the notes to set
	 */
	public void setNotes(String notes) {
		this.notes = notes;
	}

}
