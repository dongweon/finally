package codeup;
import java.util.Scanner;
public class codeup81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for(int i=0; i<a; i++) {
			for(int j=0; j<b; j++) {
				System.out.format("%d %d\n", i+1, j+1);
			}
		}
		sc.close();

	}

}
