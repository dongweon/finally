package level1;

public class Caesar_cipher {

	public String solution(String s, int n) {
		
		String answer = "";
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == ' ') {
				answer += " ";
				continue;
			}
			if('A' <= s.charAt(i) && s.charAt(i) <= 'Z') {
				answer += (s.charAt(i) + n > 90) ? (char)((s.charAt(i) + n) - 26) : (char)(s.charAt(i) + n);
			}
			else {
				answer += (s.charAt(i) + n > 122) ? (char)((s.charAt(i) + n) - 26) : (char)(s.charAt(i) + n);
			}
		}
		
		return answer;

	}

}
