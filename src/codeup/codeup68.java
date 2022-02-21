package codeup;
import java.util.Scanner;
public class codeup68 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		if (input >= 90)
			System.out.println("A");
		else if (input >= 70)
			System.out.println("B");
		else if (input >= 40)
			System.out.println("C");
		else
			System.out.println("D");
		sc.close();

	}

}
