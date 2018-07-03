package com.hc.history;

public class Person {
	String name;
	
	//  0: 学生  1： 老师   2： 员工  3： 校长   4： 老板
	int role1 = 3;
	// role1 = 100;
	
	// 
	int role2 = Role1.STUDENT;
	// role2 = 300;
	
	Role2 role3 = Role2.EMP;
	// Role2 role4 =  new Role2();

}

class Role1 {
	public static int STUDENT = 0;
	public static int TEACHER = 1;
	public static int EMP = 2;
}

class Role2 {
	private Role2() {
		// 
	}
	public static Role2 STUDENT = new Role2();
	public static Role2 TEACHER = new Role2();
	public static Role2 EMP = new Role2();
}
