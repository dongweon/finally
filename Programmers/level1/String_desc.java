package level1;

import java.util.Arrays;
import java.util.Collections;

public class String_desc {

	public String solution(String s) {
		
		String answer[] = s.split("");
		String str = "";
		
		Arrays.sort(answer,Collections.reverseOrder());
		
		for(int i = 0; i < answer.length; i++) {
			str += answer[i];
		}
		
		return str;

	}

}
