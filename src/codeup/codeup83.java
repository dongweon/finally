package codeup;
import java.util.Scanner;
public class codeup83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		for (int i=1; i<=input; i++) {
			if (i%3 == 0)
				System.out.print("X ");
			else
				System.out.print(i + " ");
		}
		sc.close();
	}

}
