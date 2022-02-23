package codeup;
import java.util.Scanner;
public class codeup82 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt(16);
		// nextInt() 안의 인자를 통해 해당 진수로 저장 가능
		
		for(int i = 1; i < 16; i++) {
			System.out.format("%X*%X = %X\n", input, i, input*i);
		}
		
		sc.close();
	}

}
