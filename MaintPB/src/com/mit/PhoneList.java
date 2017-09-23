package com.mit;

public class PhoneList {

	public static void main(String[] args) {

		Owner owner = new Owner();
		owner.setFullName("Victor Peshev");
		owner.setMailAddress("peshev@some.com");
		owner.setDeptName("MM");
		owner.setPosDescr("Category Manager");
		owner.setPhNumber("0888230230");
		
		System.out.println(owner.toString());
		

	}

}
