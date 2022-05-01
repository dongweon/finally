package level1;

public class find_prime_number {

	public int solution(int n) {
		
		// 에라토스테네스의 체 사용 !! *시간 초과 주의*
		int answer = 0;
		boolean check[] = new boolean[n + 1];
		
		for(int i = 2; i <= n; i++) {
			if(check[i] == true) {
				continue;
			}
			for(int j = i + i; j <= n; j += i) {
				check[j] = true;
			}
		}
		
		for(int i = 2; i <= n; i++) {
			if(!check[i]) {
				answer++;
			}
		}
		
		return answer;

	}

}
