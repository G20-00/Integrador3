package model;
public class MainCoach extends Coach implements Profitable{
	private int teamsThatlsEncharged ;
	private int wonChampionShips;
	/**
	 * Constructor
	 *initialize variables
	 *@param name is a String 
	 *@param identificator is a String 
	 *@param salary is a double
	 *@param experienceYears is a int
	 *@param teamsThatlsEncharged is a int 
	 *@param wonChampionShips is a int
	 */
	public MainCoach(String name, String identificator,double salary,int experienceYears,int teamsThatlsEncharged,int wonChampionShips){
		super(name,identificator,salary,experienceYears);
		this.teamsThatlsEncharged = teamsThatlsEncharged;
		this.wonChampionShips = wonChampionShips;
		
	}
	/**
	*calculateMarketPrice: print the calculation of the employee value
	*<b> pre: </b>
	*<b> pos: </b> 
	*@return out  is a double
	*/
	public double calculateMarketPrice(){
		double out = 0;
		out = getSalary()*10 + getExperienceYears()*100 + wonChampionShips*50;
		return out;
	}
	/**
	*calculateStars: print the calculation of the employee stars
	*<b> pre: </b>
	*<b> pos: </b> 
	*@return out  is a double
	*/
	public double calculateStars(){
		double out = 0;
		out = 5+wonChampionShips/10;
		return out;
	}
}