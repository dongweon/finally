package level1;

public class y_2016 {

	public String solution(int a, int b) {
		
		// 2016 �����̶� �̷��� Ǯ �� ���� !
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
