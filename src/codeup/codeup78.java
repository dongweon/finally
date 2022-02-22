package codeup;
import java.util.Scanner;
public class codeup78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int sum = 0;
		
		for(int i=0; i<=input; i++)
			if (i % 2 == 0) sum += i;
				System.out.println(sum);
		
		// int n = input/2;
		// int evensum = n * (n+1);
		// System.out.println(evensum);
				
		sc.close();

	}

}
