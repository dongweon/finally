package level1;

import java.util.ArrayList;
import java.util.Collections;

public class divisible_array_of_numbers {

	public int[] solution(int[] arr, int divisor) {
		
		int[] answer = {};
		ArrayList<Integer> temp = new ArrayList<>();
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % divisor == 0) {
				temp.add(arr[i]);
			}
		}
		
		if(temp.size() != 0) {
			Collections.sort(temp);
			// 정수 목록을 합치는 작업
			answer = temp.stream().mapToInt(Integer::intValue).toArray();
		}
		else {
			answer = new int[] {-1};
		}
	
	
	return answer;
	
	
	}

}
