package level1;

public class x_n {

	public long[] solution(long x, int n) {
		long[] answer = new long[n];
		
		for(int i = 1; i <= n; i ++) {
			answer[i - 1] = x * n;
		}
		
		return answer;

	}

}
