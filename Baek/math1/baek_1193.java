package math1;
import java.util.Scanner;
public class baek_1193 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int count = 1;	///대각선 칸 개수
		int sum = 0;	//직전 대각선까지의 대각선 칸 개수 합
		
		while(true) {
			if(X <= sum + count) {
				if(count % 2 == 1) {	//대각선 개수 홀수일 때
					System.out.print((count - (X - sum - 1)) + "/" + (X - sum));
					break;
				}
				else {	//대각선 개수 짝수일 때
					System.out.print((X - sum) + "/" + (count - (X - sum -1)));
					break;
				}
			}
			else {
				sum += count;
				count++;
			}
		}
		sc.close();
	}
}