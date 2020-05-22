import java.util.*;
public class Col_WiseSum {
  
	public static int[][] takeInput(){
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows = s.nextInt();
		System.out.println("Enter the number of cols");
		int cols=s.nextInt();
		int[][] input = new int[rows][cols];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.println("Enter element at " + i +" Enter element at "+j);
				input[i][j] = s.nextInt();
			}
		}
		return input;
	}
	
	public static void print(int input[][]) {
		int rows =input.length;
		int cols =input[0].length;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(input[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void ColWiseSum(int[][] input) {
		int rows =input.length;
		int cols =input[0].length;
		int sum = 0;
		for(int j=0;j<cols;j++) {
			sum=0;
			for(int i=0;i<rows;i++) {
				sum+=input[i][j];
			}
			System.out.print("Sum of col is "+ sum + " ");
			
		}
		System.out.println();
		
	}
	public static void main(String args[]) {
	int input[][]  = takeInput();
	
	print(input);
	
	 ColWiseSum(input);
//	System.out.println(colsum + " ");
  }
}
