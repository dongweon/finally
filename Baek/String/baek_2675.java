package String;
import java.util.Scanner;
public class baek_2675 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i = 0; i < T; i++) {
			int R = sc.nextInt();
			String S = sc.next(); 
			//nextLine() : 엔터값 입력받을 때까지 기준으로 한 줄 읽음
			//공백까지 다 읽어서 error!
			
			for(int j = 0; j < S.length(); j++) {
				for(int k = 0; k < R; k++) {
					System.out.print(S.charAt(j));
				}
			}
			System.out.println();
		}
		
		sc.close();

	}

}
