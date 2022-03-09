package array1;
import java.util.Scanner;
public class baek_4344 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			int student = sc.nextInt();
			int[] arr = new int[student];
			double sum = 0;
			
			for(int j = 0; j < student; j++) {
				int score = sc.nextInt();
				arr[j] = score;
				sum += score;
			}
			
			double mean = (sum / student);
			double count = 0;	// 평균 넘는 학생 수
			
			for(int j = 0; j < student; j++) {
				if(arr[j] > mean) {
					count++;
				}
			}
			
		System.out.format("%.3f%%\n", (count / student) * 100);
		}
		
		sc.close();

	}

}
