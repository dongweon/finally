package if_for_while;
import java.util.Scanner;
public class baek_10951 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// hasNextInt()의 경우 입력값 정수인 경우 true 반환,
		// 정수 아닐 경우 더 이상 입력 받지 않고 false 반환 후 반복문 종료
		while(sc.hasNextInt()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a+b);
		}
		
		sc.close();

	}

}
