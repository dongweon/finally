package codeup;
import java.util.Scanner;
public class codeup42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] arr = input.split(" ");
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		//Integer.parseInt : ���ڿ��� ���� ���ڸ� ���� ���� ���ڷ� ��ȯ
		
		System.out.println(a/b);
		
		sc.close();
	}

}
