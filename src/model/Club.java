public class Club{
	private String name;
	private String nit;
	private String creationDate;
	private Office[][] office;
	private DressingRoom[][] dressingRoom;
	
public Club(String name,String nit,String creationDate){
	this.name = name;
	this.nit = nit;
	this.creationDate = creationDate;
	office = new Office[6][6];
	dressingRoom = new DressingRoom[7][6];
}	
}