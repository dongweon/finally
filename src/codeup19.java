import java.util.Scanner;

public class codeup19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		String[] arr = x.split("\\.");
		//���� �״�� Ư�����ڸ� �����ڷ� ����ϰ� ���� ���, \\�پ���
		//parsing ���� �߰� ����
		// '|' ���! 
		// split("-|@|\\.") => -, @, . �߰��Ѵٴ� �� 
		int year = Integer.valueOf(arr[0]);
		int month = Integer.valueOf(arr[1]);
		int day = Integer.valueOf(arr[2]);
		
		System.out.format("%04d.%02d.%02d", year, month, day);
		sc.close();

	}

}
