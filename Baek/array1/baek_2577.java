package array1;
import java.util.Scanner;
public class baek_2577 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		String str = Integer.toString(a * b * c);
		
		
		
		for(int i = 0; i < 10; i++) {
			int count = 0;
				for(int j = 0; j <str.length(); j++) {
					if(str.charAt(j) - '0' == i) {
						count ++;
					}
			}
			System.out.println(count);
		}
		
		sc.close();

	}

}
