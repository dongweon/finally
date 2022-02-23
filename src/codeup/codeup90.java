package codeup;
import java.util.Scanner;
public class codeup90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int r = sc.nextInt();
		int n = sc.nextInt();
		long result = (long)(a * Math.pow(r, n-1)); 
				
		System.out.println(result);
		
		sc.close();

	}

}
