package codeup;
import java.util.Scanner;
public class codeup35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int input16 = Integer.parseInt(input, 16);
		
		System.out.format("%o", input16);
		sc.close();

	}

}
