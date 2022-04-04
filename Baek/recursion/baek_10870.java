package recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class baek_10870 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(fibonacci(N));
		
	}
	
	
	public static int fibonacci(int N) {
		if(N == 0)
			return 0;
		if(N == 1)
			return 1;
		return fibonacci(N - 2) + fibonacci(N - 1);
	}
	
}

//		배열 사용
//		int N = Integer.parseInt(br.readLine());
//		int[] = fibonacci = new int[N + 1];
//		
//		for(int i = 0; i < fibonacci.length; i++) {
//			if(i == 0)
//				fibonacci[0] = 0;
//			else if(i == 1)
//				fibonacci[1] = 1;
//			else
//				fibonacci[i] = fibonacci[i - 2] + fibonacci[i - 1];
//		}
//		
//		System.out.println(fibonacci[N]);

