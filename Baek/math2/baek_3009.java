package math2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class baek_3009 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int[] num_1 = { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()) };
		st = new StringTokenizer(br.readLine());
		int[] num_2 = { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()) };
		st = new StringTokenizer(br.readLine());
		int[] num_3 = { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()) };
		
		int x;
		int y;
		
//		String[] num_1 = br.readLine().split(" ");
//		String[] num_2 = br.readLine().split(" ");
//		String[] num_3 = br.readLine().split(" ");
//		
//		String x;
//		String y;
		
		if(num_1[0] == num_2[0]) {
			x = num_3[0];
		}
		else if(num_1[0] == num_3[0]) {
			x = num_2[0];
		}
		else {
			x = num_1[0];
		}
		
		if(num_1[1] == num_2[1]) {
			y = num_3[1];
		}
		else if(num_1[1] == num_3[1]) {
			y = num_2[1];
		}
		else {
			y = num_1[1];
		}
		
		System.out.println(x + " " + y);

	}

}
