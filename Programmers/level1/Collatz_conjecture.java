package level1;

public class Collatz_conjecture {
	// 시간 초과! -> 범위 좁히기
	/*public int solution(int num) {
		
		int answer = 0;		
		
		while(num != 1) {
			if(num == 500) {
				answer = -1;
			}
			if((num % 2) == 1) {
				num = (num * 3) + 1;
				answer++;
			}
			else {
				num /= 2;
				answer++;
			}	
		}
		
		return answer;

	}*/
	
	public int solution(long num) {
		
		int answer = 0;
		
		while((num != 1) && answer <= 500) {
			num = (num % 2) == 0 ? (num /= 2) : (num * 3) + 1;
			answer ++;
		}
		
		return (answer != 501) ? answer : -1;
	}
}
