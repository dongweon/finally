package String;
import java.util.Scanner;
public class baek_11720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		String num = sc.next();
		int sum = 0;
		
		for(int i = 0; i < input; i++) {
			sum += num.charAt(i) - '0';
		}
		
		System.out.println(sum);
		
		sc.close();

	}

}
