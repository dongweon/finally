package string;
import java.util.Scanner;
import java.util.StringTokenizer;
public class baek_1152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(input, " ");
		// ������ �������� ���� ��ū���� st�� ����
		
		System.out.println(st.countTokens());
		// countTokens() : ��ū�� ���� ��ȯ
		
		sc.close();

	}

}
