package math2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class baek_3053 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// ������ 0.0001�̶�� �����Ƿ� double ��� !
		double R = Double.parseDouble(br.readLine());	
		
		System.out.println(Math.PI * R * R);
		System.out.println(2 * R * R);
		
	}

}
