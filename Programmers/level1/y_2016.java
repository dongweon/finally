package level1;

public class y_2016 {

	public String solution(int a, int b) {
		
		// 2016 한정이라서 이렇게 풀 수 있음 !
		String answer = "";
		String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
		int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int allDate = 0;
			
		for(int i = 0; i < a - 1; i++) {
			allDate += month[i];
		}
				
		allDate += (b - 1);
		answer = day[allDate % 7];	
				
		return answer;
	}

}
