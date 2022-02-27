package codeup;
import java.util.Scanner;
public class codeup97 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[19][19];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}	
		
		int input = sc.nextInt();
		for(int i=0; i<input; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			for(int j=0; j<arr.length; j++) {
				if(arr[x-1][j] == 0) {
					arr[x-1][j] = 1;
				} else
					arr[x-1][j] = 0;
				if(arr[j][y-1] == 0) {
					arr[j][y-1] = 1;	
				} else
					arr[j][y-1] = 0;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
			
		sc.close();
	}

}
