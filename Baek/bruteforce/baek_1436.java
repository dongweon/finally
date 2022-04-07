package bruteforce;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class baek_1436 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int num = 666;
		int count = 1;
		
		while(count != N) {
			num++;
			// int형인 num을 String으로 변환한 뒤, "666"이란 문자열이 있는지 검사
			// 있으면 True, 없으면 False 반환
			if(String.valueOf(num).contains("666")) {
				count++;
			}
		}
		
		System.out.println(num);
		
	}
}
