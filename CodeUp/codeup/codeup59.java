package codeup;
import java.util.Scanner;
public class codeup59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		System.out.println(~input);
		//+2 = 0010	->	~(0010) = 1101
		//~n = -n-1
		sc.close();

	}

}
