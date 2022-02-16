package codeup;
import java.util.Scanner;

public class codeup11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char X = sc.next().charAt(0);
		//자바 scanner에는 문자 입력하는기능X
		//sc.next()로 문자열 받고 charAt(0)으로 가장 앞에 있는 문자열의 문자 가져옴
		//.next() : 개행문자, 공백 무시하고 문자 받음
		//.nextLine() : 한 줄로 받기 때문에 개행문자 포함
		System.out.println(X);
		sc.close();

	}

}
