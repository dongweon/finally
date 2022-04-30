package level1;

public class sum_of_factors {

	public int solution(int n) {
		
		int answer = 0;
		
		for(int i = 0; i <= (int)Math.sqrt(n); i++) {
			if(n % i == 0) {
				answer += (n / i) == i ? i : (n / i) + i;
			}
		}
		
		return answer;
	}

}
