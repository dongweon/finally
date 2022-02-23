package codeup;
import java.util.Scanner;
public class codeup87 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int sum = 0;
		
		for(int i=0; i<input; i++) {
			sum += i;
			if (sum >= input) {
				System.out.println(sum);
			break;
			}
		}
		sc.close();

	}

}
