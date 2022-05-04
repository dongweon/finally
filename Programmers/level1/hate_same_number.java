package level1;

import java.util.ArrayList;

public class hate_same_number {

	public int[] solution(int []arr) {
		
		ArrayList<Integer> temp = new ArrayList<>();
		int num = -1;
		
		for(int i = 0; i < arr.length; i++) {
			if(num != arr[i]) {
				num = arr[i];
				temp.add(arr[i]);
			}
		}
		
		int[] answer = new int[temp.size()];
		
		for(int i = 0; i < temp.size(); i++) {
			answer[i] = temp.get(i);
		}
		
		
		return answer;
	}

}
