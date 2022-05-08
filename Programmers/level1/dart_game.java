package level1;

public class dart_game {

	public int solution(String dartResult) {
		
		int answer = 0;
		String temp = "";
		int arr[] = new int[3];
		int index = 0;
		// 1S2D*3T = 37
		for(int i = 0; i < dartResult.length(); i++) {
			switch(dartResult.charAt(i)) {
				case '*' :
					arr[index - 1] *= 2;
					if(index > 1) {
						arr[index - 2] *= 2;
					}
					break;
				case '#' :
					arr[index - 1] *= -1;
					break;
				case 'S' :
					arr[index] = (int)Math.pow(Integer.parseInt(temp), 1);
					index++;
					temp = "";
					break;
				case 'D' :
					arr[index] = (int)Math.pow(Integer.parseInt(temp), 2);
					index++;
					temp = "";
					break;
				case 'T' :
					arr[index] = (int)Math.pow(Integer.parseInt(temp), 3);
					index++;
					temp = "";
					break;
				default :
					temp += String.valueOf(dartResult.charAt(i));
					break;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			answer += arr[i];
		}
		
		
		return answer;

	}

}
