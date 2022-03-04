package array1;

//import java.util.Arrays;	=> array 쓰면 용량 커짐 !
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class baek_10818 {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Integer.parseInt(br.readLine());	//첫 줄은 안쓰이므로 입력만 받음
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int max = -1000001;
		int min = 1000001;
		
		
		// hasMoreTokens() : StringTokenizer에 토큰 남아있으면 true, 비어있으면 false 반환
		while(st.hasMoreTokens()) {		
			int num = Integer.parseInt(st.nextToken());
			if(num > max) {
				max = num;
			}
			if(num < min) {
				min = num;
			}
		}
		System.out.println(min + " " + max);
	}

}
