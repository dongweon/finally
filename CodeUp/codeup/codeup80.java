package codeup;
import java.util.Scanner;
public class codeup80 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int sum = 0;
		int i = 0;
		
		while (sum < input) {
			i++;
			sum += i;
		}
		System.out.println(i);
		sc.close();

	}

}
