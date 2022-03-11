package function;
import java.util.Scanner;
public class baek_1065 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(arithmetic_sequence(sc.nextInt()));
		sc.close();
	}
	
	
	public static int arithmetic_sequence(int num) {
		int count = 0;	//�Ѽ� ī����
		
		if(num < 100) {
			return num;
		}
		else {
			count = 99;
			if(num == 1000) {
				count = 999;
			}
			for(int i = 100; i <= num; i++) {
				int hun = i / 100;	//���� �ڸ�
				int ten = (i / 10) % 10;	//���� �ڸ�
				int one = i % 10;
				
				if((hun - ten) == (ten - one)) {
					count++;
				}
			}
		}
			
			
		return count;
	}

}
