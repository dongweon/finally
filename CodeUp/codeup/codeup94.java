package codeup;
import java.util.Scanner;
public class codeup94 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int[] arr = new int[input];
		
		for(int i=0; i<input; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=input-1; i>=0; i--) {
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}

}
