package model;
import java.util.ArrayList;
public class Team{
	private int countainPlayer;
	private int countainMain;
	private int countainAssitans;
	private String name;
	private ArrayList <LineUp> line;
	private ArrayList<Player> player;
	private ArrayList<MainCoach> mainCoach;
	private ArrayList<TechnicalAssistants> assitans;
	
	public Team(String name){
		this.name = name;
		line = new ArrayList<LineUp>();
		player= new ArrayList<Player>();
		mainCoach= new ArrayList<MainCoach>();
		assitans= new ArrayList<TechnicalAssistants>();
		countainAssitans= 0;
		countainMain = 0;
		countainPlayer = 0;
	}
	public String getName(){
		return name;
	}
	public boolean addPlayer(Employee playerss){
		boolean out= false ;
			if(countainPlayer < 25){
				Player players = (Player)playerss;
				player.add(players);
				out = true ;
				countainPlayer++;
			}
		return out;	
	}
	public boolean addMainCoach(Employee coachs){
		boolean out= false ;
			if(countainMain < 1){
				MainCoach coach = (MainCoach)coachs;
				mainCoach.add(coach);
				out = true ;
				countainMain++;
			}
		return out;	
	}
	public boolean addTechnicalAssistants(Employee assitan){
		boolean out= false ;
			if(countainAssitans < 3){
				TechnicalAssistants technical = (TechnicalAssistants)assitan;
				assitans.add(technical);
				out= true ;
				countainMain++;
			}
		return out;	
		
	}
	public void  creatLineUp(String date ,String lineUp,String tactis){
		LineUp lines = new LineUp(lineUp,date,tactis); 
		String[] formacion = lineUp.split("-");
		int[]num = new int[formacion.length];
		int suma = 0;
		System.out.println("1");
		for(int i = 0 ; i< num.length; i++){
			num[i]= Integer.parseInt(formacion[i]);
			}
			int a = formacion.length;
			for(int i = 0; i<num.length; i++){
				suma += num[i]; 
			}
			if(	suma > 10){
			 
			}
			else{
				line.add(lines); 
			}
			
	}
	public String printFormations(){
		String out ="";
		for(int i = 0; i<line.size();i++){
			System.out.println("Funciona 12");
			out = i+"- "+line.get(i).getDate()+"\n";
		}
		return out;
	}
	public String printTraining(int eleccion){
		String out = "";
			out = (line.get(eleccion).showMatrix());
		return out;
	}
	
}