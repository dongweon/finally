package sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class baek_10989 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 중복되는 수가 있으므로 boolean 대신 int 사용!
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[100001];
		
		for(int i = 0; i < N; i++) {
			arr[Integer.parseInt(br.readLine())]++;
		}
		
		br.close();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < arr.length; i++) {
			while(arr[i] > 0) {		// i값의 개수가 0이 될 때까지 출력(빈도 수를 의미)
				sb.append(i).append('\n');
				arr[i]--;
			}
		}
		
		System.out.println(sb);

	}

}
