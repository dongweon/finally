package codeup;
import java.util.Scanner;
public class codeup99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[10][10];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int x = 1;
		int y = 1;
		arr[x][y] = 9; 
		
		while(true) { 
			if(arr[x][y+1] != 1) { 
				y++;			
				if((x<10 && y<10) && arr[x][y] != 2)  
					arr[x][y] = 9; 
					else {
						arr[x][y] = 9;
						break;	
					}
			} else {	
				x++;	
				if((x<10 && y<10) && arr[x][y] != 2)
					arr[x][y] = 9;
				else {
					arr[x][y] = 9;
					break;
				}
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
