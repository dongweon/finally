package level1;

public class GCD_LCM {

	public int[] solution(int n, int m) {
		int[] answer = new int[2];
		
		int a = Math.max(n, m);
		int b = Math.min(n, m);
		
		while((a % b) != 0) {
			int temp = a % b;
			a = b;
			b = temp;
		}
		
		// (a % b) == 0 ¿œ ∂ß
		answer[0] = b;
		answer[1] = (n * m) / b;
		
		return answer;
	}

}
