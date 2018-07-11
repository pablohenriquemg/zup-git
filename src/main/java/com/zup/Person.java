package com.zup;

public class Person {

	private int id;
	private String name;
	private int age;
	private String password;

	public Person() {
		super();
	}

	public Person(int id, String name, int age, String password) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.password = password;
	}

	public String toString() {
		return "Id: " + this.id + " Name: " + this.name + " Age: " + this.age + " Password: " + this.password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

}
