package math2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class baek_2581 {

	// 에라토스테네스의 체 사용 !!
	public static boolean prime[];
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
		prime = new boolean[b + 1];	// 0 ~ b
		get_prime();				// 함수 생성
		
		int sum = 0;
		int min = Integer.MAX_VALUE;
		
		for(int i = a; i <= b; i++) {
			if(prime[i] == false) {		// false : 소수
				sum += i;
				if(min == Integer.MAX_VALUE) {
					min = i;
				}
			}
		}
		
		if(sum == 0) {
			System.out.println(-1);
		}
		else {
			System.out.println(sum);
			System.out.println(min);
		}

	}
	
	
	public static void get_prime() {
		prime[0] = true;
		prime[1] = true;
		
		for(int i = 2; i <= Math.sqrt(prime.length); i++) {
			if(prime[i])
				continue;
			for(int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
	}

}
