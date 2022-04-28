package level1;

import java.util.ArrayList;
import java.util.Collections;

public class reverse_array {

	public ArrayList<Integer> solution(long n) {
		
		ArrayList<Integer> answer = new ArrayList<>();
		
		while(n != 0) {
			answer.add((int)(n % 10));
			n /= 10;
		}
		
		return answer;
	}
}
