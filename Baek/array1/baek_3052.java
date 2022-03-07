package array1;
import java.util.Scanner;
import java.util.HashSet;
public class baek_3052 {

	public static void main(String[] args) {
		
		// HashSet 사용
		// 중복되는 원소를 넣을 경우 하나만 저장(중복 원소 허용X)
		// 순서 개념X => Collection.sort() 메소드 사용불가능!
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> h = new HashSet<Integer>();
		
		for(int i = 0; i < 10; i++) {
			h.add(sc.nextInt() % 42);
		}
		
		System.out.println(h.size());
		
		sc.close();

	}

}
