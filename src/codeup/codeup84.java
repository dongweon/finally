package codeup;
import java.util.Scanner;
public class codeup84 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int red = sc.nextInt();
		int green = sc.nextInt();
		int blue = sc.nextInt();
		int count = 0;
		
		for(int i=0; i<red; i++)
			for(int j=0; j<green; j++)
				for(int k=0; k<blue; k++) {
					System.out.format("%d %d %d\n", i, j, k);
					count ++;
				}
		System.out.println(count);
		
		sc.close();

	}

}
