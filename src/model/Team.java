package model;
public class Team{
	private String name;
	private Lineup line;
	public Team(String name){
		this.name = name
	}
	public void addLineup(String date,String chain){
		line = new Lineup(date,chain);
	}
}