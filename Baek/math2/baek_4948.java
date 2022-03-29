package math2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class baek_4948 {
	
	public static boolean[] prime = new boolean[246913];	// 0 ~ 246912

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		get_prime();
	
		while(true) {
			int num = Integer.parseInt(br.readLine());
			int count = 0;
			
			if(num == 0)
				break;
			
			for(int i = num + 1; i <= 2 * num; i++) {
				if(!prime[i])
					count++;
			}
			
			System.out.println(count);
			
		}
	}
	
		
		
	public static void get_prime() {
		prime[0] = true;
		prime[1] = true;
		
		for(int i = 2; i <= Math.sqrt(prime.length); i++) {
			if(prime[i])
				continue;
			for(int j = i * i; j <= prime.length; j += i) {
				prime[j] = true;
			}
		}		
	}

	
}
