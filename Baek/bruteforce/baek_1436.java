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
			// int���� num�� String���� ��ȯ�� ��, "666"�̶� ���ڿ��� �ִ��� �˻�
			// ������ True, ������ False ��ȯ
			if(String.valueOf(num).contains("666")) {
				count++;
			}
		}
		
		System.out.println(num);
		
	}
}
