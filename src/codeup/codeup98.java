package codeup;
import java.util.Scanner;
public class codeup98 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[sc.nextInt()][sc.nextInt()];
		int n = sc.nextInt(); //���� ����
		
		for(int i=0; i<n ;i++) {
			int l = sc.nextInt(); //���� ����
			int d = sc.nextInt(); //����(0:����, 1:����)
			int x = sc.nextInt();
			int y = sc.nextInt();
			if(d == 0) {
				for(int j=0; j<l; j++) {
					arr[x-1][y-1+j] = 1;
				}
			} else {
				for(int j=0; j<l; j++) {
					arr[x-1+j][y-1] = 1;
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
