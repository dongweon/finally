package codeup;
import java.util.Scanner;
public class codeup82 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt(16);
		// nextInt() ���� ���ڸ� ���� �ش� ������ ���� ����
		
		for(int i = 1; i < 16; i++) {
			System.out.format("%X*%X = %X\n", input, i, input*i);
		}
		
		sc.close();
	}

}
