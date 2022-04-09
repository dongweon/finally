package sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class baek_2750 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int num = Integer.parseInt(br.readLine());
		int[] arr = new int[num];
		
		for(int i = 0; i < num; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		// 정렬 메소드
		Arrays.sort(arr);
		
		for(int val : arr) {
			sb.append(val).append('\n');
		}
		
		System.out.println(sb);

	}

}
