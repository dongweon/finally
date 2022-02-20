package codeup;
import java.util.Scanner;
public class codeup66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] arr = input.split(" ");
		//String[] arr = sc.nextLine().split(" ");
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		int c = Integer.parseInt(arr[2]);
		
		if(a%2 == 0) 
			System.out.println("even");
		else 
			System.out.println("odd");
		if(b%2 == 0) 
			System.out.println("even");
		else 
			System.out.println("odd");
		if(c%2 == 0) 
			System.out.println("even");
		else 
			System.out.println("odd");
		
		//for (String s : input) {
		//	int num = Integer.paresInt(s);
		//	if (num%2 == 0) {
		//		System.out.println("even");
		//	} else {
		//		System.out.println("odd");}}
		sc.close();

	}

}
