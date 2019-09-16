package com.arc.mod1;

public class MemberMain2 {

	public static void main(String[] args) {
		Member member = new Member();
		member.age=10;
		member.name="arc";
		double k = 190.2;
		member = new Member("arc", 25, 168);
		member.setKi(171.2);
		
		member.info();
		
		
		System.out.println("Ki : "+member.getKi());
	}
}
