package codeup;
import java.util.Scanner;
public class codeup92 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int day = 1;
		
		
		while (true) {
			if ((day%a != 0) || (day%b != 0) || (day%c != 0) )
				day++;
			else
				break;
		}
		System.out.println(day);
		sc.close();

	}

}
