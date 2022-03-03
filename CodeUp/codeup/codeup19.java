package codeup;
import java.util.Scanner;

public class codeup19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		String[] arr = x.split("\\.");
		//문자 그대로 특수문자를 구분자로 사용하고 싶을 경우, \\붙어줌
		//parsing 조건 추가 가능
		// '|' 사용! 
		// split("-|@|\\.") => -, @, . 추가한다는 뜻 
		int year = Integer.valueOf(arr[0]);
		int month = Integer.valueOf(arr[1]);
		int day = Integer.valueOf(arr[2]);
		
		System.out.format("%04d.%02d.%02d", year, month, day);
		sc.close();

	}

}
