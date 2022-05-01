package level1;

public class String_basic {

	public boolean solution(String s) {
		
		boolean answer = true;
		
		if(s.length() != 4 && s.length() != 6) 
			return false;
		
		for(int i = 0; i < s.length(); i++) {
			if((s.charAt(i) - '0' >= 0) && (s.charAt(i) - '0' <= 9))
				continue;
			else
				return false;
		}
		
		return answer;

	}

}
