package if_for_while;
import java.util.Scanner;
public class baek_10951 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// hasNextInt()�� ��� �Է°� ������ ��� true ��ȯ,
		// ���� �ƴ� ��� �� �̻� �Է� ���� �ʰ� false ��ȯ �� �ݺ��� ����
		while(sc.hasNextInt()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a+b);
		}
		
		sc.close();

	}

}
