package level1;

public class find_Mr_Kim_in_Seoul {

	public String solution(String[] seoul) {
		
		String answer = "";
		
		for(int i = 0; i < seoul.length; i++) {
			String region = seoul[i];
			if(region.equals("Kim")) {
				answer = "김서방은 " + i + "에 있다";
			}
		}
		
		return answer;

	}

}
