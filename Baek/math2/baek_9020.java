package math2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class baek_9020 {
	
	public static boolean[] prime = new boolean[10001];

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		get_prime();
		
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0) {
			int input = Integer.parseInt(br.readLine());
			int first = input / 2;
			int second = input / 2;
			
			while(true) {
				if(prime[first] == false && prime[second] == false) {
					sb.append(first).append(' ').append(second).append('\n');
					break;
				}
				first--;
				second++;
			}
			
		}
		
		System.out.println(sb);
		
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
