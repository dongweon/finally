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
		//Integer.parseInt : 문자열로 사용된 숫자를 정수 등의 숫자로 변환
		
		System.out.println(a/b);
		
		sc.close();
	}

}
