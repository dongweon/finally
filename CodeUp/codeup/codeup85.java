package codeup;
import java.util.Scanner;
public class codeup85 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int s = sc.nextInt();
		double total = h * b * c * s;
		double result = (total/(8*1024*1024)); // bit -> MB
		
		System.out.format("%.1f MB", result);
		
		
		sc.close();

	}

}
