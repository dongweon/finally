package bruteforce;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class baek_2798 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
				
		int[] arr = new int[N];
		
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int result = search(arr, N, M);
		
		System.out.println(result);

	}
	
	
	public static int search(int[] arr, int N, int M) {
		int result = 0;
		
		// 3개 고르기 때문에 첫 번째 카드는 N-2까지만 순회
		for(int i = 0; i < N - 2; i++) {
			if(arr[i] > M)
				continue;
			
			for(int j = i + 1; j < N - 1; j++) {
				if(arr[i] + arr[j] > M)
					continue;
				
				for(int k = j + 1; k < N; k++) {
					int sum = arr[i] + arr[j] + arr[k];
					
					if(M == sum) {
						return sum;
					}
					if(result < sum && sum < M) {
						result = sum;
					}
				}
			}
		}
		
		return result;
		
	}

}
