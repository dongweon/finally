package math1;
import java.util.Scanner;
public class baek_1712 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();	// ���� ���
		int B = sc.nextInt();	// ���� ���
		int C = sc.nextInt();	// ��Ʈ�� ����
		
		if(C <= B) {
			System.out.print("-1");
		}
		else
			System.out.print((A / (C-B)) + 1);
		
		sc.close();

	}

}
