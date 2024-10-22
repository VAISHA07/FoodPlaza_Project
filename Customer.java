package com.foodplazza.pojo;

public class Customer {

	 String CName;
	 String CEmailid;
	 String CPassword;
	 int CMobNo;
	 String CAddr;
	
	 public Customer() {
		super();
		
	}
	public Customer(String cName, String cEmailid, String cPassword, int cMobNo, String cAddr) {
		super();
		this.CName = cName;
		this.CEmailid = cEmailid;
		this.CPassword = cPassword;
		this.CMobNo = cMobNo;
		this.CAddr = cAddr;
	}
	public String getCName() {
		return CName;
	}
	public void setCName(String cName) {
		CName = cName;
	}
	public String getCEmailid() {
		return CEmailid;
	}
	public void setCEmailid(String cEmailid) {
		CEmailid = cEmailid;
	}
	public String getCPassword() {
		return CPassword;
	}
	public void setCPassword(String cPassword) {
		CPassword = cPassword;
	}
	public int getCMobNo() {
		return CMobNo;
	}
	public void setCMobNo(int cMobNo) {
		CMobNo = cMobNo;
	}
	public String getCAddr() {
		return CAddr;
	}
	public void setCAddr(String cAddr) {
		CAddr = cAddr;
	}
	@Override
	public String toString() {
		return "Customer [CName=" + CName + ", CEmailid=" + CEmailid + ", CPassword=" + CPassword + ", CMobNo=" + CMobNo
				+ ", CAddr=" + CAddr + "]";
	}
	
}