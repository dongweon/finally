package codeup;
import java.util.Scanner;
public class codeup24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		for(int i = 0; i < input.length(); i++) {
			System.out.println("\'" + input.charAt(i) + "\'");
		}
		sc.close();
	}

}
