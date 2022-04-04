package recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class baek_10872 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int sum = factorial(N);
		
		System.out.println(sum);
	
	}
	
	
	public static int factorial(int N) {
		if(N <= 1)		// 재귀 종료 조건
			return 1;
		return N * factorial(N - 1);
	}

}

//		반복문 사용	
//		int sum = 1;
//		
//		while(N != 0) {
//			sum = sum * N;
//			N--;
//		}
