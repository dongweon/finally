package String;
import java.util.Scanner;
public class baek_2941 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		int count = 0;
		
		for(int i = 0; i < input.length(); i++) {
			char word = input.charAt(i);
				
			if(word == 'c') {
				if(i < input.length() - 1) {
					if(input.charAt(i + 1) == '=') {
						i++;	
						//i+1까지가 하나의 문자이므로 다음 문자를 건너 뛰기 위해 1 증가
					}
					else if(input.charAt(i + 1) == '-') {
						i++;
					}
				}
			}
			
			else if(word == 'd') {
				if(i < input.length() - 1) {
					if(input.charAt(i + 1) == 'z') {
						if(i < input.length() - 2) {
							if(input.charAt(i + 2) == '=') {	// dz=
								i += 2;
							}
						}
					}
					else if(input.charAt(i + 1) == '-') {	//d-
						i++;
					}
				}
			}
			
			else if(word == 'l') {
				if(i < input.length() - 1) {
					if(input.charAt(i + 1) == 'j') {	//lj
						i++;
					}
				}
			}
			
			else if(word == 'n') {
				if(i < input.length() - 1) {
					if(input.charAt(i + 1) == 'j') {	//nj
						i++;
					}
				}
			}
			
			else if(word == 's') {
				if(i < input.length() - 1) {
					if(input.charAt(i + 1) == '=') {	//s=
						i++;
					}
				}
			}
			
			else if(word == 'z') {
				if(i < input.length() - 1) {
					if(input.charAt(i + 1) == '=') {	//z=
						i++;
					}
				}
			}
			
			count++;
			
		}
		
		System.out.println(count);
		
		sc.close();
	}

}
