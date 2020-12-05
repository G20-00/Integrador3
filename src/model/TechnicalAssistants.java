package model;
public class TechnicalAssistants extends Coach {
	private String professionalPlayer;
	private Skill skills;
	public TechnicalAssistants(String name, String identificator,double salary,int experienceYears,String professionalPlayer,String skill){
		super(name,identificator,salary,experienceYears);
		this.professionalPlayer = professionalPlayer;
		this.skills = Skill.valueOf(skill);
	}
}