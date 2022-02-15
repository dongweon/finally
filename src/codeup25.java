import java.util.Scanner;
public class codeup25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int numdigit = input.length();
		int multiplier = (int)Math.pow(10, numdigit-1);
							//Math.pow = °ÅµìÁ¦°ö
		
		for(int i = 0; i < numdigit; i++) {
			int digit = input.charAt(i) - '0';
			System.out.println("[" + multiplier*digit + "]");
			multiplier /= 10;
		}
		sc.close();
	}

}
