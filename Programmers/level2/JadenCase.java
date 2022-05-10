package level2;

public class JadenCase {

	public String solution(String s) {
		
		String answer = "";
		String[] str = s.toLowerCase().split("");
		
		boolean first = true;
		
		for(int i = 0; i < str.length; i++) {
			answer += first ? str[i].toUpperCase() : str[i];
			first = str[i].equals(" ") ? true : false;
		}
		
		return answer;

	}

}
