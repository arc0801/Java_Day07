package com.arc.mod1;

public class Member {

	private int age;
	String name; //default
	private double ki;

	//디폴트 생성자
	public Member(){}

	public Member(String name, int age, double ki) {
		this.name=name;
		this.age = age;
		this.ki=ki;
	}

	public void setAge(int age) {
		if(age>=0 && age<150) {
			this.age=age;
		}else {
			this.age=10;
		}
	}

	public int getAge() {
		return this.age;
	}
	
	public void setKi(double ki) {
		this.ki = ki;
	}

	//getKi
	public double getKi() {
		return this.ki;
	}

	public void info() {
		System.out.println(this.age);
		System.out.println(this.name);
		System.out.println(this.ki);
		this.test();
	}

	private void test() {
		
	}
	
	
	
	
}
