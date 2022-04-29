package level1;

public class create_weird_word {

	public String solution(String s) {
		
		String[] str = s.split(" ", -1); 
		String answer = "";
		
		for(int i = 0; i < str.length; i++) {
			for(int j = 0; j < str[i].length(); j++) {
				if(j % 2 == 0) {
					answer += String.valueOf(str[i].charAt(i)).toUpperCase();
				}
				else {
					answer += String.valueOf(str[i].charAt(j)).toLowerCase();
				}
				if(i != str.length - 1) {
					answer += " ";
				}
			}
		}
		
		return answer;

	}

}
