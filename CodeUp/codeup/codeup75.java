package codeup;
import java.util.Scanner;
public class codeup75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		for(int i=1; i<=input; i++)
			System.out.println(input-i);
		
		//while (input>0)
		//	System.out.println(--input)
		sc.close();

	}

}
