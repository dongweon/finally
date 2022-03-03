package codeup;
import java.util.Scanner;
public class codeup95 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int[] arr = new int[input];
		int min = 24;
		
		for(int i=0; i<input; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.print(min);
		
		sc.close();

	}

}
