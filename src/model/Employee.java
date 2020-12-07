package model;
public abstract class Employee {
	private String name;
	private String identificator;
	private double salary;
	/**
	 * Constructor
	 *initialize variables
	 *@param name is a String 
	 *@param identificator is a String 
	 *@param salary is a double
	 */
	public Employee(String name, String identificator,double salary){
		this.name= name;
		this.identificator= identificator;
		this.salary= salary;
	}
	//getters
	public String getName(){
		return name;
	}
	//getters
	public double getSalary(){
		return salary;
	}
	/**
	*calculateMarketPrice: print the calculation of the employee value
	*<b> pre: </b>
	*<b> pos: </b> 
	*@return out  is a double
	*/
	public double calculateMarketPrice(){
		double out = 0; 
		return out;
	}	
	/**
	*calculateStars: print the calculation of the employee stars
	*<b> pre: </b>
	*<b> pos: </b> 
	*@return out  is a double
	*/
	public double calculateStars(){
	double out = 0; 
		return out;
	}	
}