package model;
public class LineUp{
	public final static int LINEUP_ROWS = 10;	
	public final static int LINEUP_COLUMNS = 7;
	private String date;
	private int[][] matrix;
	public LineUp(String chain,String date){
		this.date = date;
		matrix = stringToMatrix(chain);
	}
	public int[][] stringToMatrix(String chain){
		int[][] output = new int[LINEUP_ROWS][LINEUP_COLUMNS];
		return output;
	}
	public String matrixToString(){
		return"todo";
	}
	public String toString(){
		return"todo";
	}
	
}