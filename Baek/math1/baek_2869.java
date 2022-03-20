package math1;
import java.util.Scanner;
public class baek_2869 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int V = sc.nextInt();
		
		int day = (V - B) / (A - B);
		
		if((V - B) % (A - B) != 0) {
			day++;
		}
		
		System.out.print(day);
		
//		while(true) {
//			for(int i = 1; i < V; i++) {
//				if((A * i) - (B * (i - 1)) == V) {
//					System.out.print(i);
//				}
//			}
//		break;
//		}
		
		sc.close();
		
	}
}
