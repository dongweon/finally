package math1;
import java.util.Scanner;
public class baek_1193 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int count = 1;	///�밢�� ĭ ����
		int sum = 0;	//���� �밢�������� �밢�� ĭ ���� ��
		
		while(true) {
			if(X <= sum + count) {
				if(count % 2 == 1) {	//�밢�� ���� Ȧ���� ��
					System.out.print((count - (X - sum - 1)) + "/" + (X - sum));
					break;
				}
				else {	//�밢�� ���� ¦���� ��
					System.out.print((X - sum) + "/" + (count - (X - sum -1)));
					break;
				}
			}
			else {
				sum += count;
				count++;
			}
		}
		sc.close();
	}
}