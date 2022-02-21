package codeup;
import java.util.Scanner;
public class codeup67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		if (input < 0) 
			System.out.println("minus");
			else
				System.out.println("plus");
		if (input % 2 ==0)
			System.out.println("even");
		else
			System.out.println("odd");
		
		sc.close();

	}

}
