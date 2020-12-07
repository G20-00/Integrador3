package model;
public class TechnicalAssistants extends Coach {
	private String professionalPlayer;
	private Skill skills;
	/**
	 * Constructor
	 *initialize variables
	 *@param name is a String 
	 *@param identificator is a String 
	 *@param salary is a double
	 *@param experienceYears is a int
	 *@param professionalPlayer is a String 
	 *@param skill is a String 
	 */
	public TechnicalAssistants(String name, String identificator,double salary,int experienceYears,String professionalPlayer,String skill){
		super(name,identificator,salary,experienceYears);
		this.professionalPlayer = professionalPlayer;
		this.skills = Skill.valueOf(skill);
	}
}