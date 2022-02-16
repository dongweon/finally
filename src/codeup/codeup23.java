package codeup;
import java.util.Scanner;
public class codeup23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] inputArray = input.split("\\.");
		System.out.println(inputArray[0] + "\n" + inputArray[1]);
		sc.close();

	}

}
