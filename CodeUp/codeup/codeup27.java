package codeup;
import java.util.Scanner;
public class codeup27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String[] arr = input.split("\\.");
		int y = Integer.valueOf(arr[0]);
		int m = Integer.valueOf(arr[1]);
		int d = Integer.valueOf(arr[2]);

		System.out.format("%02d-%02d-%04d", d, m, y);
		sc.close();
	}

}
