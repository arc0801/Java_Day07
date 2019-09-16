package com.arc.mod3;

public final class Member {

	public static int age; //클래스변수
	public String name; //멤버변수

	//멤버메서드
	public void instanceMethod() {
		System.out.println(name);
		System.out.println(age);
		info();
	}


	/*
	public Member() {
		this.AGE=20;
	}

	public Member(int age) {
		this.AGE=age;
	}
	 */
	//클래스메서드
	public static void info() {
		//this.age=30;
		System.out.println(age);
		System.out.println(name);
		instanceMethod();
		
	}






}
