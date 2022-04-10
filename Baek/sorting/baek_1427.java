package sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class baek_1427 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[10];
		String str = br.readLine();
		
		for(int i = 0; i < str.length(); i++) {
			arr[str.charAt(i) - '0']++;
		}
		
		for(int i = 9; i >= 0; i--) {
			while (arr[i]-- > 0) {
				System.out.println(i);
			}
		}
	}
}
