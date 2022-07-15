package DY;
import java.util.Scanner;

public class ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("반올림 전 값 : ");
		int a = sc.nextInt();
		if (a%10>4) {
			a=a-(a%10)+10;
		}else if(a%10<5) {
			a= a-(a%10);
		}
		
		System.out.println("반올림 후 값 : "+a);
	}
}
