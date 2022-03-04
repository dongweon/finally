package array1;

//import java.util.Arrays;	=> array ���� �뷮 Ŀ�� !
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class baek_10818 {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Integer.parseInt(br.readLine());	//ù ���� �Ⱦ��̹Ƿ� �Է¸� ����
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int max = -1000001;
		int min = 1000001;
		
		
		// hasMoreTokens() : StringTokenizer�� ��ū ���������� true, ��������� false ��ȯ
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
