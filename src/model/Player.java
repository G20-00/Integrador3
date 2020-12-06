package model;
public class Player extends Employee implements Profitable{
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
	public Position getPositions(){
		return positions;
	}
	public double calculateMarketPrice(){
		double out = 0; 
		if(getPositions() == Position.GOALKEEPER ){
			out = getSalary()*12+ averageRating*150;
		}
		if(getPositions() == Position.DEFENDER){
			out = getSalary()*13 + averageRating*125 + numberGoals*100;
		}
		if(getPositions() == Position.MIDFIELD){
			out = getSalary()*14 + averageRating*135 + numberGoals*125;
		}
		if(getPositions() == Position.STRICKER){
			out = getSalary()*15 + averageRating*145 + numberGoals*150;
		}
		return out; 
	}
	
	public double calculateStars(){
		double out = 0;
		if(getPositions() == Position.GOALKEEPER ){
			out = averageRating*0.9;
		}
		if(getPositions() == Position.DEFENDER){
			out = averageRating*0.9 + numberGoals/100;
		}
		if(getPositions() == Position.MIDFIELD){
			out =  averageRating*0.9 + numberGoals/90;
		}
		if(getPositions() == Position.STRICKER){
			out = averageRating*0.9+ numberGoals/80;
		}
		return out;
	}
}