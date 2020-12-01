package ui;
import java.util.scanner;
import model.Team;
public class Main{
	public static Scanner sc;
	public static void main(String[] argas){
		sc = new Scanner(System.in);
		System.out.println("new team");
		String name = sc.nextLine();
		System.out.println("new chain")
		String chain = sc.nextLine();
		System.out.println("new date")
		String date = sc.nextLine();
		Team ejemplo = new Team(name);
		ejemplo.addLineup(date,chain);
		System.out.println(ejemplo.toString());
	}
}