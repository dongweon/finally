package String;
import java.util.Scanner;
public class baek_1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		int[] arr = new int[26];
		
		for(int i = 0; i < input.length(); i++) {
			if(('A' <= input.charAt(i)) && (input.charAt(i) <= 'Z')) {	// 대문자 범위
				arr[input.charAt(i) - 'A']++;
			}
			else {	// 소문자 범위
				arr[input.charAt(i) - 'a']++;
			}
		}
		
		int max = -1;
		char both = '?';
		
		for(int i = 0; i < 26; i++) {
			if(arr[i] > max) {
				max = arr[i];
				both = (char)(i + 65);	// 대문자로 출력
			}
			else if(arr[i] == max) {
				both = '?';
			}
		}
		
		System.out.print(both);		
		
		
		sc.close();

	}

}
