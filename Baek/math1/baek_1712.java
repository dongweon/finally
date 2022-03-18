package math1;
import java.util.Scanner;
public class baek_1712 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();	// 고정 비용
		int B = sc.nextInt();	// 가변 비용
		int C = sc.nextInt();	// 노트북 가격
		
		if(C <= B) {
			System.out.print("-1");
		}
		else
			System.out.print((A / (C-B)) + 1);
		
		sc.close();

	}

}
