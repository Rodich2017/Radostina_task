
public class Owner {

	private String fullName;
	private String mailAddress;
	private String deptName;
	private String posDescr;
	private String phNumber;
	
	public Owner() {
		this.fullName = "John Smith";
		this.mailAddress = "mail_john@some.com";
		this.deptName = "MM";
		this.posDescr = "Manager";
		this.phNumber = "0888444222";
		
	}

	/**
	 * @param fullName
	 * @param mailAddress
	 * @param deptName
	 * @param posDescr
	 * @param phNumber
	 */
	public Owner(String fullName, String mailAddress, String deptName, String posDescr, String phNumber) {
		this.fullName = fullName;
		this.mailAddress = mailAddress;
		this.deptName = deptName;
		this.posDescr = posDescr;
		this.phNumber = phNumber;
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
	 * @return the mailAddress
	 */
	public String getMailAddress() {
		return mailAddress;
	}

	/**
	 * @param mailAddress the mailAddress to set
	 */
	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
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

	/**
	 * @return the phNumber
	 */
	public String getPhNumber() {
		return phNumber;
	}

	/**
	 * @param phNumber the phNumber to set
	 */
	public void setPhNumber(String phNumber) {
		this.phNumber = phNumber;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Owner [fullName=" + fullName + ", mailAddress=" + mailAddress + ", deptName=" + deptName + ", posDescr="
				+ posDescr + ", phNumber=" + phNumber + "]";
	}

	
	
}
