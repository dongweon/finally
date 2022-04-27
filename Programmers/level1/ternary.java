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
		// parseInt(String s) : 문자열(s)을 인자값으로 받으면 해당값을 10진수의 Integer형으로 변환시켜줌
		// parseInt(String s, int radix) : 문자열(s)을 인자값으로 받으면 해당값을 진수(radix)의 Integer형으로 변환시켜줌

	}

}
