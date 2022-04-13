// 모든 문제 참고 https://st-lab.tistory.com

package backtracking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class baek_15649 {

	public static int[] arr1;
	public static boolean[] arr2;
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		arr1 = new int[M];
		arr2 = new boolean[N];
		dfs(N, M, 0);
		
		System.out.println(sb);

	}
	
	
	public static void dfs(int N, int M, int depth) {
		if(depth == M) {
			for(int val : arr1) {
				sb.append(val).append(' ');
			}
			sb.append('\n');
			return;
		}
		
		for(int i = 0; i < N; i++) {
			if(!arr2[i]) {
				arr2[i] = true;
				arr1[depth] = i + 1;
				dfs(N, M, depth + 1);
				arr2[i] = false;
			}
		}
	}

}
