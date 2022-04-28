package level1;

import java.util.ArrayList;
import java.util.Collections;

public class desc {

	public long solution(long n) {
		
		ArrayList<Long> arr = new ArrayList<>();
		String answer = "";
		
		while(n != 0) {
			arr.add(n % 10);
			n /= 10;
		}
		
		// Collections.reverseOrder() : ������������ �ٲ���
		Collections.sort(arr,Collections.reverseOrder());
		
		// ArrayList�� ���ҵ��� ���ڿ��� �ٿ���
		for(long x : arr) {
			answer += String.valueOf(x);
		}
		
		return Long.parseLong(answer);
	}

}
