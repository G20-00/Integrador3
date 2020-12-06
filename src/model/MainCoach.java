package model;
public class MainCoach extends Coach implements Profitable{
	private int teamsThatlsEncharged ;
	private int wonChampionShips;
	public MainCoach(String name, String identificator,double salary,int experienceYears,int teamsThatlsEncharged,int wonChampionShips){
		super(name,identificator,salary,experienceYears);
		this.teamsThatlsEncharged = teamsThatlsEncharged;
		this.wonChampionShips = wonChampionShips;
		
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