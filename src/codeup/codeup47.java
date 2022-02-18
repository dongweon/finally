package codeup;
import java.util.Scanner;
public class codeup47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		System.out.println(input << 1);
		//비트시프트 연산
		// << : 오른쪽에 0이 주어진 개수만큼 추가 -> 비트 계산
		// >> : 왼쪽에 0이 주어진 개수만큼 추가 -> 비트 계산
		sc.close();

	}

}
