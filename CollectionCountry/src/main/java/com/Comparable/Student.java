package com.Comparable;

public class Student implements Comparable<Student> {
	private int rollno;
	private String name;
	private int age;

	// constructor
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	// constructor
	public Student(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	// generating getter setter
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
	}

	public int compareTo(Student st) {
		// TODO Auto-generated method stub
		if (age == st.age)
			return 0;
		else if (age > st.age)
			return 1;
		else
			return -1;
	}

}
