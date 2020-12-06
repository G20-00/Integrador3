package model;
import java.util.ArrayList;
public class Club{
	public static final int MAX_CLUB =2;
	private String name;
	private String nit;
	private String creationDate;
	private Team[] teams;
	private ArrayList<Employee> employee;
	private int[][] office;
	private int[][] dressingRoom1;
	private int[][] dressingRoom2;
	
	
	
public Club(String name,String nit,String creationDate){
	this.name = name;
	this.nit = nit;
	this.creationDate = creationDate;
	office = new int[6][6];
	dressingRoom1 = new int[7][6];
	dressingRoom2 = new int[7][7];
	teams = new Team[MAX_CLUB];
	employee= new ArrayList<Employee>();
}	
	public void createEmployee(String name, String identificator,double salary,String numberShirt,int numberGoals,double averageRating
	,String position){
		Employee player = new Player(name,identificator,salary,numberShirt,numberGoals,averageRating,position);
				employee.add(player);
		boolean found = true;
		for(int i= 0; i< dressingRoom1.length && found ; i++){
			for(int j= 0;j< dressingRoom1[0].length && found ;j=j+2){
				if(dressingRoom1[i][j] == 0){
					dressingRoom1[i][j]= 1;
					found = false ;
				}
				
			}
			i++;
		}
		if(found == true){
			for(int i= 0; i< dressingRoom2.length && found ; i++){
			for(int j= 0;j< dressingRoom2[0].length && found ;j=j+2){
				if(dressingRoom2[i][j] == 0){
					dressingRoom2[i][j]= 1;
					found = false ;
				}
				
			}
			i++;
		}
		}
	}
	public void createEmployee(String name, String identificator,double salary,int experienceYears,int teamsThatlsEncharged,int wonChampionShips){
		Employee coach = new MainCoach(name,identificator,salary,experienceYears,teamsThatlsEncharged,wonChampionShips);
			employee.add(coach);
		boolean found = true;
		for(int i= 0; i< office.length && found ; i++){
			for(int j= 0;j< office[0].length && found ;j=j+2){
				if(office[i][j] == 0){
					office[i][j]= 1;
					found = false ;
				}
				
			}
			i++;
		}
	}
	public void createEmployee(String name, String identificator,double salary,int experienceYears,String professionalPlayer,String skill){
		Employee assitentCoach = new TechnicalAssistants(name,identificator,salary,experienceYears,professionalPlayer,skill);
			employee.add(assitentCoach);
		boolean found = true;
		for(int i= 0; i< office.length && found ; i++){
			for(int j= 0;j< office[0].length && found ;j=j+2){
				if(office[i][j] == 0){
					office[i][j]= 1;
					found = false ;
				}
				
			}
			i++;
		}
	}
	public String printdressingRoom (){
			String out = " Camerino 1\n";
		for(int i= 0; i< dressingRoom1.length  ; i++){
			for(int j= 0;j< dressingRoom1[0].length  ;j++){
				out += dressingRoom1[i][j]+ " "+("\t"); 
				}
				out += "\n";
		}
		out += "\n Camerino 2\n";
		for(int i= 0; i< dressingRoom2.length  ; i++){
			for(int j= 0;j< dressingRoom2[0].length  ;j++){
				out += dressingRoom2[i][j]+ " "+("\t"); 
				}
				out += "\n";
		}
		out += "\n Oficina\n";
		for(int i= 0; i< office.length  ; i++){
			for(int j= 0;j< office[0].length  ;j++){
				out += office[i][j]+ " "+("\t"); 
				}
				out += "\n";
		}
			
		return out;	
		
	}
	public void creadTeam(String name){
		boolean found = true;
		Team team =new Team(name);
		for(int i=0; i< teams.length && found;i++){
			if(teams[i]== null){
				teams[i]= team;
				found = false;
			}
		}
	}
	public String printTeam(){
		String out = "";
		for(int i= 0; i< teams.length;i++){
			if(teams[i]!= null){
			out+= i+". "+teams[i].getName()+"\n";
			}
		}
		return out ;
	}
	public String printNamePlayer(){
	String out = "";
		for(int i= 0; i< employee.size();i++){
			if(employee.get(i) instanceof Player ){
			out+= i+". "+employee.get(i).getName()+"\n";
			}
		}
		return out ;
	}	
	
	public String printNameMainCoach(){
	String out = "";
		for(int i= 0; i< employee.size();i++){
			if(employee.get(i) instanceof MainCoach ){
			out+= i+". "+employee.get(i).getName()+"\n";
			}
		}
		return out ;
	}	
	
	public String printNameTechnica(){
	String out = "";
		for(int i= 0; i< employee.size();i++){
			if(employee.get(i) instanceof TechnicalAssistants ){
			out+= i+". "+ employee.get(i).getName()+"\n";
			}
		}
		return out ;
	}	
	public String addPlayer(int team,int numEmplooye){
		String out = "La seleccion no pertenece a un jugador";
			if(employee.get(numEmplooye) instanceof Player){
				Employee player = employee.get(numEmplooye);
				teams[team].addPlayer(player);
				if(teams[team].addPlayer(player) == true){
					out = "Tiene un nuevo jugador \n";
				}else{
					out = "Numero maximo de jugadores para un equipo \n";
				}
			}
		return out ;	
	}
	public String addMainCoach(int team,int numEmplooye){
		String out = "La seleccion no pertenece a un entrenador";
			if(employee.get(numEmplooye) instanceof Coach){
				Employee coach = employee.get(numEmplooye);
				teams[team].addMainCoach(coach);
				if(teams[team].addMainCoach(coach) == true){
					out = "Tiene un nuevo entrenador \n";
				}else{
					out = "Supero el maximo de entrenadores para un equipo \n";
				}
			}
		return out ;	
	}
	public String addTechnicalAssistants(int team,int numEmplooye){
		String out = "La seleccion no pertenece a un asistente tecnico";
			if(employee.get(numEmplooye) instanceof TechnicalAssistants){
				Employee assistans = employee.get(numEmplooye);
				teams[team].addTechnicalAssistants(assistans);
				if(teams[team].addTechnicalAssistants(assistans) == true){
					out = "Tiene un nuevo asistente \n";
				}else{
					out = "Supero el maximo de asistentes para un equipo \n";
				}
			}
		return out ;	
	}
	public String printEmplooyes(){
		String out = "No hay empleados";
			for(int i= 0; i< employee.size();i++ ){
			 if(employee.get(i) != null){
				if(i==0){
					out = "****Empleados****\n";
				}
				out+= i+" - "+employee.get(i).getName()+"\n";
			 }
			}
		return out;	
	}
	public String printEmplooye(){// para imprimir los de jugadores y coach
		String out = "No hay empleados";
			int num = 0;
			for(int i= 0; i< employee.size();i++ ){
			 if(employee.get(i) != null){
				if(employee.get(i) instanceof Player){
					if(num==0){
					num++;	
					out = "****Empleados****\n";
				}
				out+= i+" - "+employee.get(i).getName()+"\n";
				}
				if(employee.get(i) instanceof MainCoach){
					if(num==0){
					num++;	
					out = "****Empleados****\n";
				}
				out+= i+" - "+employee.get(i).getName()+"\n";
				}
			 }
			}
		return out;	
	}
	public String fireEmployee(int num){
		String out = "";
		boolean found  = false;
		for(int i = 0; i< employee.size();i++){
			if(i == num){
				found = true;
			}
		}
		if(found == true){
		employee.remove(num);
		out = "Empleado despedido\n";
		}else{
			out = "El empleado no existe\n";
		}
		return out;
	}
	public void creatLineUp(String date, int numTeam,String lineUp,String tactis){
		System.out.println("llega");
		teams[numTeam].creatLineUp( date,lineUp,tactis);
	}
	public String printFormations(int numTeam){
		String out="No existe el equipo";
		if(teams[numTeam] != null){
		out = (teams[numTeam].printFormations());
		}
		return out;
	}
	public String printTraining(int numTeam,int eleccion){
		String out = "";
			if(teams[numTeam] != null){
			out = (teams[numTeam].printTraining(eleccion));
		}
		return out;
	}
	public double calculateValue(int num){
		double out = 0;
		out = employee.get(num).calculateMarketPrice();
		return out;
	}
	public double calculateStars(int num){
		double out = 0;
		out = employee.get(num).calculateStars();
		return out;
	}
}