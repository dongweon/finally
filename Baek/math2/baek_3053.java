package math2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class baek_3053 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 오차가 0.0001이라고 했으므로 double 사용 !
		double R = Double.parseDouble(br.readLine());	
		
		System.out.println(Math.PI * R * R);
		System.out.println(2 * R * R);
		
	}

}
