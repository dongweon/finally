package math1;
import java.util.Scanner;
public class baek_2292 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		int count = 1;	// �ּ� ��Ʈ
		int range = 2;	// �� ���� �ּڰ�
		
		if(input == 1) {
			System.out.print(1);
		}
		
		else {
			while(range <= input) {
				range = range + (6 * count);
				count++;
			}
			System.out.print(count);
		}

	}

}
