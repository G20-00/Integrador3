package model;
public class Player extends Employee{
	private String numberShirt;
	private double averageRating;
	private int numberGoals ;
	private Position positions;
	
	public Player(String name, String identificator,double salary,String numberShirt,int numberGoals,double averageRating,String position){
		super(name,identificator,salary);
		this.numberShirt = numberShirt;
		this.averageRating = averageRating;
		this.numberGoals = numberGoals;
		this.positions = Position.valueOf(position);
	}
}