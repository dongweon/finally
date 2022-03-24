package math2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class baek_1978 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		br.readLine();
		int count = 0;
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		//hasMoreTokens() : StringTokenizer 자체에 토큰이 남아있는지 여부를 true, false로 변환
		//					굳이 N 쓸 필요 없음. 입력만 받고 따로 변수를 두지 않는다!!
		while(st.hasMoreTokens()) {
			boolean isPrime = true;		// 소수인 경우 = true, 아닌 경우 = false
			int num = Integer.parseInt(st.nextToken());
			
			if(num == 1) {
				continue;
			}
			
			for(int i = 2; i <= Math.sqrt(num); i++) {
				if(num % i == 0) {
					isPrime = false;
					break;
				}
			}
			
			if(isPrime) {
				count++;
			}
		}
		
		System.out.println(count);
		
	}

}
