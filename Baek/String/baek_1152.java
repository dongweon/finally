package string;
import java.util.Scanner;
import java.util.StringTokenizer;
public class baek_1152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(input, " ");
		// 공백을 기준으로 나눈 토큰들을 st에 저장
		
		System.out.println(st.countTokens());
		// countTokens() : 토큰의 개수 반환
		
		sc.close();

	}

}
