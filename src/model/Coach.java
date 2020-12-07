package model;
public abstract class Coach extends Employee{
	private int experienceYears;
	/**
	 * Constructor
	 *initialize variables
	 *@param name is a String 
	 *@param identificator is a String 
	 *@param salary is a double
	 *@param experienceYears is a int
	 */
	public Coach(String name, String identificator,double salary,int experienceYears){
		super(name,identificator,salary);
		this.experienceYears = experienceYears;
	}
	//getters
	public int getExperienceYears(){
		return experienceYears;
	}
}