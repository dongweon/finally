package function;
public class baek_4673 {
	public static void main(String[] args) {
		
		boolean check[] = new boolean[10001];
		
		for(int i = 1; i < 10001; i++) {
			int n = d(i);
			if(n < 10001) {	// 10000이 넘는 수는 필요X
				check[n] = true;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1; i < 10001; i++) {
			if(check[i] != true) {
				sb.append(i).append('\n');
			}
		}
		System.out.println(sb);

}
	
	public static int d(int number) {	// 함수
		int sum = number;
		
		while(number != 0) {
			sum = sum + (number % 10);
			number = number / 10;
		}
		
		return sum;
	}
}
