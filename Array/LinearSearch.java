import java.util.Scanner;

public class LinearSearch {

	public static int linearSearch(int input[],int num) {
		int index=0; 
	    for(int i=0;i<input.length;i++) { // 0 1 2 3
	    	if(input[i]==num) { //0!=3 1!=3 2!=0 3==0
	    		index=i; // 3
	    		break;
	    	}
	    	else {
	    		index=-1;
	    	}
	    }
	    return index;
	}
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int num=s.nextInt(); // 3
		int size=s.nextInt(); //7
		int input[]=new int[size]; 
		for(int i=0;i<size;i++) { 
			input[i]=s.nextInt(); // 2 13 4 1 3 6 28			
		}
		int resultOfLinearSearch=linearSearch(input,num);
		System.out.println(resultOfLinearSearch);
		
		
	}
}
