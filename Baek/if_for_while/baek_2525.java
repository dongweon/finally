package if_for_while;
import java.util.Scanner;
public class baek_2525 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		int time = sc.nextInt();
		
		hour += time / 60;
		minute += time % 60;
		
		if(minute >= 60) {
			hour += 1;
			minute -= 60;
		}
		
		if(hour >= 24)
			hour -= 24;
		
		System.out.println(hour + " " + minute);

		
		sc.close();

	}

}
