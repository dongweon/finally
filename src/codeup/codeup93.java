package codeup;
import java.util.Scanner;
public class codeup93 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int[] arr = new int[23];
		
		for(int i=0; i<input; i++ ) {
			int num = sc.nextInt();
			arr[num-1]++;
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		sc.close();
	}

}
