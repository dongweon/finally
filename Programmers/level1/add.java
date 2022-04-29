package level1;

public class add {

	public int solution(int n) {
		
		int answer = 0;
		int sum = 0;
		
		while(n != 0) {
			answer = (n % 10);
			n /= 10;
			sum += answer;
		}
		
		
		return sum;

	}

}
