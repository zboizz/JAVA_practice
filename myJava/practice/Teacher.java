package practice;

import Youtube.Person;

public class Teacher extends Person{

	private String teacherId;  //접근하지못하도록 private
	private int monthSalary;
	private int workedYear;
	
	public String getTeacherId() {
		return teacherId;
	}
	public void setTecherId(String teacherId) {
		this.teacherId = teacherId;
	}
	public int getMonthSalary() {
		return monthSalary;
	}
	public void setMonthSalary(int monthSalary) {
		this.monthSalary = monthSalary;
	}
	public int getWorkedYear() {
		return workedYear;
	}
	public void setWorkedYear(int workedYear) {
		this.workedYear = workedYear;
	}
	
	public Teacher(String name, int age, int height, int weight, String teacherId, int monthSalary, int workedYear) {
		super(name, age, height, weight);
		this.teacherId = teacherId;
		this.monthSalary = monthSalary;
		this.workedYear = workedYear;
	}
	
	public void show() {
	System.out.println("------------------");
	System.out.println(getName());
	System.out.println(getAge());
	System.out.println(getHeight());
	System.out.println(getWeight());
	System.out.println(getTeacherId());
	System.out.println(getMonthSalary());
	System.out.println(getWorkedYear());
	
	}
}
