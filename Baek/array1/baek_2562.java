package array1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class baek_2562 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 배열 사용
		int[] arr = new int[9];
		
		for(int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int max = 0;
		int index = 0;
		int count = 0;
		
		for(int value : arr) {
			count++;
			if(value > max) {
				max = value;
				index = count;
			}
		}
		
		System.out.println(max);
		System.out.println(index);
	}

}


		// 배열 사용 X
		// int max = 0;
		// int index = 0;
		
		// for(int i = 0; i < 9; i++) {
		//	 int value = Integer.parseInt(br.readLine());
		//	 if(value > max) {
		// 		value = max;
		//	 	index = i + 1;
		//	 }
		// }
		// System.out.println(max);
		// System.out.println(index);
