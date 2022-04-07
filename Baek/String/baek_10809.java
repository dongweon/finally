package string;
import java.util.Scanner;
public class baek_10809 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[26];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
		
		String S = sc.next();
		
		for(int i = 0; i < S.length(); i++) {
			char x = S.charAt(i);
			
			if(arr[x - 'a'] == -1) {
				arr[x - 'a'] = i;
			}
		}
		
		for(int val : arr) {
			System.out.print(val + " ");
		}
		sc.close();

	}

}
