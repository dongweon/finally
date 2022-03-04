package if_for_while;
import java.util.Scanner;
public class baek_1110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int count = 0;
		int push = N;
		
		while(true) {
			N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
			count++;
			
			if(push == N) {
				break;
			}
		}
		System.out.println(count);
		
		sc.close();
	}

}




//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.IOException;
//
//public class Main {
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader)(System.in));
//		
//		int N = Integer.parseInt(br.readLine());
//		
//		int count = 0;
//		int push = N;
//		
//		do {
//			N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
//			count ++;
//		}
//		while (push != N);
//		
//		System.out.println(count);
//	}
//}
