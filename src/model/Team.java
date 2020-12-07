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
	/**
	 * Constructor
	 *initialize variables
	 @param name is a String
	 */
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
	//getters
	public String getName(){
		return name;
	}
	/**
	*addPlayer: add an player to the team and return a message
	*<b> pre: </b>
	*<b> pos: </b> 
	*@param playerss is a Employee
	*@return out is a boolean
	*/
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
	/**
	*addMainCoach: add an main coach to the team and return a message
	*<b> pre: </b>
	*<b> pos: </b> 
	*@param coachs is a Employee
	*@return out is a boolean
	*/
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
	/**
	*addTechnicalAssistants: add an technical assistans to the team and return a message
	*<b> pre: </b>
	*<b> pos: </b> 
	*@param assitan is a Employee
	*@return out is a boolean
	*/
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
	/**
	*creatLineUp: create the team formation
	*<b> pre: </b>
	*<b> pos: </b> 
	*@param  date is a String
	*@param lineUp is a String
	*@param tactis  is a String
	*/
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
	/**
	*printFormations: print the training you want
	*<b> pre: </b>
	*<b> pos: </b> 
	*@return out String 
	*/
	public String printFormations(){
		String out ="";
		for(int i = 0; i<line.size();i++){
			out = i+"- "+line.get(i).getDate()+"\n";
		}
		return out;
	}
	/**
	*printTraining: print the dates of the team formations
	*<b> pre: </b>
	*<b> pos: </b> 
	*@param eleccion is a int
	*@return out  is a String
	*/
	public String printTraining(int eleccion){
		String out = "";
			out = (line.get(eleccion).showMatrix());
		return out;
	}
	/**
	*validateLine: validates that formations are created
	*<b> pre: </b>
	*<b> pos: </b> 
	*@return found is a boolean 
	*/
	public boolean validateLine(){
		boolean found = false;
		for(int i = 0; i<line.size();i++){
			if(line.get(i)!= null){
				found = true;
			}
		}
		return found;
	}
	
}