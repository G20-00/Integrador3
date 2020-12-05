package model;
public class MainCoach extends Coach{
	private int teamsThatlsEncharged ;
	private int wonChampionShips;
	public MainCoach(String name, String identificator,double salary,int experienceYears,int teamsThatlsEncharged,int wonChampionShips){
		super(name,identificator,salary,experienceYears);
		this.teamsThatlsEncharged = teamsThatlsEncharged;
		this.wonChampionShips = wonChampionShips;
		
	}
}