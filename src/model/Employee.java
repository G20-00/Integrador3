package model;
public abstract class Employee {
	private String name;
	private String identificator;
	private double salary;
	
	public Employee(String name, String identificator,double salary){
		this.name= name;
		this.identificator= identificator;
		this.salary= salary;
	}
	public String getName(){
		return name;
	}
	public double getSalary(){
		return salary;
	}
	public double calculateMarketPrice(){
		double out = 0; 
		return out;
	}	
	public double calculateStars(){
	double out = 0; 
		return out;
	}	
}