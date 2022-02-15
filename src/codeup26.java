import java.util.Scanner;
public class codeup26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String[] inputArray = input.split(":");
		
		System.out.println(inputArray[1]);
		sc.close();

	}

}
