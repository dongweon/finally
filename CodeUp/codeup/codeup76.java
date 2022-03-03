package codeup;
import java.util.Scanner;
public class codeup76 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = 'a'; //97
		char input = sc.next().charAt(0);
		
		for(int i=a; i<=(int)input; i++) {
			System.out.print((char)i + " ");
		}
		sc.close();

	}

}
