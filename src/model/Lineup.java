package model;
public class LineUp{
	public final static int LINEUP_ROWS = 10;	
	public final static int LINEUP_COLUMNS = 7;
	private String date;
	private int[][] matrix;
	private Tatics tactis;
	/**
	 * Constructor
	 *initialize variables
	 *@param chain is a String 
	 *@param date is a String 
	 *@param tatic is a double
	 */
	public LineUp(String chain,String date,String tatic){
		this.date = date;
		matrix = stringToMatrix(chain);
		this.tactis= Tatics.valueOf(tatic);
		
	}
	//getters
	public String getDate(){
		return date;
	}
	/**
	*stringToMatrix: modify the matrix and assign the formation
	*<b> pre: </b>
	*<b> pos: </b>
	*@param chain is a String
	*@return out  is a int[][]
	*/
	public int[][] stringToMatrix(String chain){
		double divide = 0;
		boolean out = false ;
		int numArray = 0;
		int[][] ouput = new int[LINEUP_ROWS][LINEUP_COLUMNS];
		String[] formacion = chain.split("-");
		int[]num = new int[formacion.length];
		int suma = 0;
		
		for(int i = 0 ; i< num.length; i++){
			suma++;
			num[i]= Integer.parseInt(formacion[i]);
			}
			
			divide = (10.0/suma) ;
			divide = Math.ceil(divide);
			
		for(int i = ouput.length-1; i>=0;i-=divide){
			
			suma = 0;
			out = false;
			for(int j=ouput[0].length-1;j>=0 && out == false; j--){
				
				suma+=1;
				if(suma<=num[numArray]){
					if(num[numArray] == 5){
					ouput[i][3]= 1;
					ouput[i][0]=1;
					ouput[i][1]=1;
					ouput[i][5]=1;
					ouput[i][6]=1;
					}
					if(num[numArray] == 3){
					ouput[i][3]= 1;
					ouput[i][1]=1;
					ouput[i][5]=1;
					}
					if(num[numArray] == 4){
					ouput[i][1]= 1;
					ouput[i][2]=1;
					ouput[i][4]=1;
					ouput[i][5]=1;
					}
					if(num[numArray] == 2){
					ouput[i][2]= 1;
					ouput[i][4]=1;
					}
					if(num[numArray] == 1){
					ouput[i][3]= 1;
					}
					if(num[numArray] == 6){
					ouput[i][2]= 1;
					ouput[i][0]=1;
					ouput[i][1]=1;
					ouput[i][5]=1;
					ouput[i][6]=1;
					ouput[i][4]=1;
					}
					if(num[numArray] == 7){
						ouput[i][j] =1;
					}
					
				}else{
					out = true;
				}
			}
			numArray+=1;
		}	
			
		return ouput;
	}
	/**
	*showMatrix: print the formation matrix
	*<b> pre: </b>
	*<b> pos: </b> 
	*@return out  is a String
	*/
	public String showMatrix(){
		String out = "\n";
		for(int i= 0;i < matrix.length;i++){
			out += "\n";
				for(int j=0;j<matrix[0].length;j++){
					out+= matrix[i][j]+"\t";
				}
		}
		return out;
		
	}
	
	
}