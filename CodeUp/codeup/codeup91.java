package codeup;
import java.util.Scanner;
public class codeup91 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int m = sc.nextInt();
		int d = sc.nextInt();
		int n = sc.nextInt();
		int result = a;
				
		for(int i=1; i<n; i++) {
			result = (result*m) + d ;
		}
		System.out.println(result);
		
		sc.close();

	}

}
