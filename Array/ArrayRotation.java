import java.util.Scanner;
public class ArrayRotation {
	public static int[] rotatingarray(int arr[],int d) {
		for(int i=0;i<d;i++) {
			int temp=arr[0];
			for(int j=0;j<arr.length-1;j++) {
		     arr[j] = arr[j+1];
		     }
			arr[arr.length-1] = temp;
		}
		return arr;
	}
public static void main(String args[]) {
	Scanner s = new Scanner(System.in);
	int size = s.nextInt();
	int arr[] = new int[size];
	for(int i=0;i<size;i++) {
		arr[i] = s.nextInt();
	}
	int d=s.nextInt();
	int[] ans = rotatingarray(arr,d);
	for(int i=0;i<ans.length;i++) {
		System.out.print(ans[i]+" ");
	}
}
}
