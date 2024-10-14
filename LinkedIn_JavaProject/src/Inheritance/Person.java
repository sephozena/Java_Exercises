package Inheritance;

public class Person {
	
	private String name;
	private String gender;
	private String location;
	private int age;
	
	// constructor of a Person class
	public Person (String name, String gender, int age, String location){
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.location = location;
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getGender() {
		return this.gender;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getLocation() {
		return this.location;
	}
	
}
