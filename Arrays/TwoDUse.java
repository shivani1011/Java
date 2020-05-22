import java.util.Scanner;

public class TwoDUse {
 
	public static void main(String args[]) {
	 
	// int arr2d[][] = new int[3][4];
	 //System.out.println(arr2d[0][1]);
	 Scanner s = new Scanner(System.in);
	 System.out.println("Enter the number of rows");
	 int row = s.nextInt();
	 System.out.println("Enter the number of columns");
	 int col = s.nextInt();
	 int arr2D[][]  = new int[row][col];
	 for(int i=0;i<row;i++) {
		 for(int j=0;j<col;j++) {
			 
			 arr2D[i][j]=s.nextInt();
			 
		 }
	 }
	 
 }
}
