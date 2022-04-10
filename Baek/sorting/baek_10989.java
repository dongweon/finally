package sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class baek_10989 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// �ߺ��Ǵ� ���� �����Ƿ� boolean ��� int ���!
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[100001];
		
		for(int i = 0; i < N; i++) {
			arr[Integer.parseInt(br.readLine())]++;
		}
		
		br.close();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < arr.length; i++) {
			while(arr[i] > 0) {		// i���� ������ 0�� �� ������ ���(�� ���� �ǹ�)
				sb.append(i).append('\n');
				arr[i]--;
			}
		}
		
		System.out.println(sb);

	}

}
