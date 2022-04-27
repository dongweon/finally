package level1;

public class ternary {

	public int solution(int n) {
		
		String str = "";
		
		while(n > 0) {
			str = (n % 3) + str;
			n /= 3;
		}
		
		str = new StringBuilder(str).reverse().toString();
		
		return Integer.parseInt(str, 3);
		// parseInt(String s) : ���ڿ�(s)�� ���ڰ����� ������ �ش簪�� 10������ Integer������ ��ȯ������
		// parseInt(String s, int radix) : ���ڿ�(s)�� ���ڰ����� ������ �ش簪�� ����(radix)�� Integer������ ��ȯ������

	}

}
