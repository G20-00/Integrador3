package model;
public abstract class Coach extends Employee{
	private int experienceYears;

	public Coach(String name, String identificator,double salary,int experienceYears){
		super(name,identificator,salary);
		this.experienceYears = experienceYears;
	}
	
}