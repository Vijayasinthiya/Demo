package com.example.demo;

public class Employee {
private	int id;
private String name;
private int age;
private int salary;
private String gender;

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
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public Employee(int id, String name, int age, int salary, String gender) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.salary = salary;
	this.gender = gender;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", gender=" + gender + "]";
}

}

