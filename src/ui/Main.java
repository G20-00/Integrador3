package ui;
import java.util.Scanner;
import model.*;
public class Main{
	public static Scanner sc;
	private Club club;
	private Scanner scan  = new Scanner(System.in);
	private	Scanner numScan = new Scanner(System.in);
	private int countainPlayer;
	private int countainCoachMain;
	private int countainTechnicalCoach;
	private int countainClub ;
	private int countainEmployee;
	public Main(){
		club = new Club("","","");
		numScan = new Scanner(System.in);
		scan = new Scanner(System.in);
		countainPlayer = 0;
		countainCoachMain = 0;
		countainTechnicalCoach = 0;
		countainClub = 0;
		countainEmployee = 0;
	}
	public static void main(String[] args){
		sc = new Scanner(System.in);
		System.out.println("Nombre del club");
		String name = sc.nextLine();
		System.out.println("Nit del club");
		String chain = sc.nextLine();
		System.out.println("Fecha de fundacion dia/mes/anio");
		String date = sc.nextLine();
		Club club = new Club(name,chain,date);
		 Main m = new Main();
		 m.menu();
	}
	public void menu(){
		boolean run = true;
		while(run){
		System.out.println("¿Que desea hacer?"+"\n 1. Crear un empleado"+"\n 2. Crear equipo"+"\n 3. Asignar empleados a equipo"+"\n 4. Despedir empleado"+
		"\n 5. Imprimir empleados"+"\n 6. Crear una formacion");
		int eleccion = numScan.nextInt();
			switch(eleccion){
				case 1:
					creadEmployee();
				break;
				case 2:
					creadTeam();
				break;
				case 3 :
					assignEmployee();
				break;
				case 4:
					fireEmployee();
				break;
				case 5:
					printEmplooyes();
				break;
				case 6:
					creatLineUp();
				break;
				
			}
		}
	}
	public void creadEmployee(){
		countainEmployee++;
		boolean run = true;
		while(run){
		System.out.println("\n 1. Crear un Jugador"+"\n 2. Crear un entrenador");
		int eleccion = numScan.nextInt();
			switch(eleccion){
				case 1:	
					if(countainPlayer < 50){
						System.out.println("Digite el nombre del jugador");
						String name = scan.nextLine();
						System.out.println("Numero de identidad");
						String identificator= scan.nextLine();
						System.out.println("Salario");
						double salary = numScan.nextInt();
						System.out.println("Numero de la camisa");
						String numberShirt = scan.nextLine();
						System.out.println("Numero de goles");
						int numberGoals = numScan.nextInt();
						System.out.println("Calificacion promedio");
						double averageRating = numScan.nextDouble();
						boolean positionPlayer = true;
						String position = "";
						while(positionPlayer){
							System.out.println("Posicion en la que juega"+"\n 1. Portero"+"\n 2. Defensa"+"\n 3. Volante"+"\n 4.Delantero");
							int numPosition = numScan.nextInt();
							switch(numPosition){
								case 1:
									position = "GOALKEEPER";
									positionPlayer = false;
								break;
								case 2:
									position = "DEFENDER";
									positionPlayer = false;
								break;
								case 3:
									position = "MIDFIELD";
									positionPlayer = false;
								break;
								case 4:
									position = "STRICKER";
									positionPlayer = false;
								break;	
							}
						}
						countainPlayer++;
						club.createEmployee(name,identificator,salary,numberShirt,numberGoals,averageRating,position);
	// imprimir camerinos		System.out.println(club.printdressingRoom());
					}
					run = false;
				break;
				case 2:
					boolean runing= true;
					while(runing){
						System.out.println("\n¿Que tipo de entrenador va crear?"+"\n 1. Entrenador principal"+"\n 2. entrenadores asistentes");
						int positionCoach = numScan.nextInt();
							switch(positionCoach){
								case 1: 
								if(countainCoachMain<2){
									System.out.println("Digite el nombre del entrenador");
									String name = scan.nextLine();
									System.out.println("Numero de identidad");
									String identificator= scan.nextLine();
									System.out.println("Salario");
									double salary = numScan.nextInt();
									System.out.println("Anios de experiencia");
									int experienceYears = numScan.nextInt();
									System.out.println("Numero de equipos dirigidos ");
									int teamsThatlsEncharged = numScan.nextInt();
									System.out.println("Numero de campeonatos ganados");
									int wonChampionShips = numScan.nextInt();
									countainCoachMain++;
									club.createEmployee(name,identificator,salary,experienceYears,teamsThatlsEncharged,wonChampionShips);
								}else{
									System.out.println("Numero maximo de entrenadores principales");
								}
								runing = false;
								break;
								case 2:
								if(countainTechnicalCoach < 6){
									System.out.println("Digite el nombre del entrenador");
									String name = scan.nextLine();
									System.out.println("Numero de identidad");
									String identificator= scan.nextLine();
									System.out.println("Salario");
									double salary = numScan.nextInt();
									System.out.println("Anios de experiencia");
									int experienceYears = numScan.nextInt();
									boolean playerSoccer = true ;
									String playedSoccer = "";
									while(playerSoccer){
									System.out.println("¿Fue jugador de futbol?"+"\n 1. Si"+"\n 2. No");
									int playSoccer = numScan.nextInt();
										switch(playSoccer){
											case 1:
												playedSoccer = "Si";
												playerSoccer  = false;
											break;
											case 2 :
												playedSoccer = "No";
												playerSoccer  = false;
											break;
										}
									}
									boolean haveSkill = true;
									String skill="";
									while(haveSkill){
										System.out.println("¿Que habilidad tiene?"+"\n 1. Ofensivo"+"\n 2. Defensivo"+"\n 3. Posesion"+"\n 4. Jugadas de laboratorio");
										int eleccionSkill = numScan.nextInt();
										switch(eleccionSkill){
											case 1: 
												skill = "OFFENSIVE";
												haveSkill = false;
											break;
											case 2: 
												skill = "DEFFENSIVE";
												haveSkill = false;
											break;
											case 3: 
												skill = "CONTROLLER";
												haveSkill = false;
											break;
											case 4: 
												skill = "LAB_PLAYS";
												haveSkill = false;
											break;
										}
									}
									club.createEmployee(name,identificator,salary,experienceYears,playedSoccer,skill);
									countainCoachMain++;
								}else{
									System.out.println("Numero maximo de entrenadores asistentes");
								}
								runing = false ;
								break;
							}
					}
					run = false;
				break;
			}
		}
	}	
	public void creadTeam(){
		if(countainClub < 2){
		System.out.println("Nombre del equipo");
		String name = scan.nextLine();
		club.creadTeam(name);
		countainClub++;
		}
		else{
			System.out.println("Creo el maximo de equipos\n");
		}
	}
	public void assignEmployee(){
		if(countainClub != 0 && countainPlayer !=0){
			System.out.println("¿a cual equipo le asignaras el empleado?");
			System.out.println(club.printTeam());
			int numTeam= numScan.nextInt();
			if(numTeam >= 0 && numTeam <= 1){
				boolean run = true;
				while(run){
					System.out.println("1. Jugador "+"\n2. Entrenador principal"+"\n3. Asistente ");
					int eleccion = numScan.nextInt();
					switch(eleccion){
						case 1 :
							if(countainPlayer > 0){
								System.out.println(club.printNamePlayer());
								System.out.println("Digite el numero");
								int numEmployee = numScan.nextInt();
								club.addPlayer(numTeam,numEmployee);
								System.out.println(club.addPlayer(numTeam,numEmployee));
								
							}
							else{
								System.out.println("Debe crear primero el empleado\n");
							}
							run = false;
						break;
						case 2 :
							if(countainCoachMain > 0){
								System.out.println(club.printNameMainCoach());
								System.out.println("Digite el numero");
								int numEmployee = numScan.nextInt();
								club.addMainCoach(numTeam,numEmployee);
								System.out.println(club.addMainCoach(numTeam,numEmployee));
							}
							else{
								System.out.println("Debe crear primero el empleado\n");
							}
							run = false;
						break;
						case 3 :
							if(countainTechnicalCoach > 0){
								System.out.println(club.printNameTechnica());
								System.out.println("Digite el numero");
								int numEmployee = numScan.nextInt();
								club.addTechnicalAssistants(numTeam,numEmployee);
								System.out.println(club.addTechnicalAssistants(numTeam,numEmployee));
							}
							else{
								System.out.println("Debe crear primero el empleado\n");
							}
							run = false;
						break;
					}
				}
			}
			else{
				System.out.println("\nEleccion equivocada\n");
			}
		}
	}
	public void fireEmployee(){
		if(countainPlayer > 0){
		System.out.println("\nEmpleado que va a despedir\n"+club.printEmplooyes());
		System.out.println("Digite el numero del empleado");
		int num = numScan.nextInt();
		System.out.println(club.fireEmployee(num));
		}else{
			System.out.println(club.printEmplooyes());
		}
		
	}
	public void printEmplooyes(){
		System.out.println("\nEmpleado contratados\n"+club.printEmplooyes());
	}
	public void creatLineUp(){
		if(countainClub > 0){
		int num = countainClub;
		System.out.println("Digite el numero del equipo");
		System.out.println(club.printTeam());
		int numTeam = numScan.nextInt();
		if(numTeam >= 0 && numTeam <= num-1){
		System.out.println("Digite la formacion Seperada por (-): ejemplo 2-3-7 ");
		String lineUp = scan.nextLine();
		club.creatLineUp(numTeam,lineUp);
		}else{
			System.out.println("El equipo seleccionado no exite\n");
		}
		}
		else{
			System.out.println("Debe crear un equipo\n");
		}
		
	}
}