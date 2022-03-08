package array1;

import java.util.Scanner;
import java.util.Arrays;

public class baek_1546 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double arr[] = new double[sc.nextInt()];
		
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextDouble();
		}
		
		double sum = 0;
		Arrays.sort(arr);	//오름차순 정렬
		
		for(int i = 0; i < arr.length; i++) {
			sum += (arr[i] / arr[arr.length-1]*100);
		}
		System.out.println(sum /arr.length);
		
		sc.close();

	}

}
