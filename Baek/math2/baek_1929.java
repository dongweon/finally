package math2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class baek_1929 {
	
	public static boolean prime[];

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		prime = new boolean[b + 1];
		get_prime();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = a; i <= b; i++) {
			if(!prime[i])
				sb.append(i).append('\n');
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
