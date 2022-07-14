package DY;
import java.util.Scanner;

public class ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int a = sc.nextInt();
		int sum = 0;
		
		while(true) {
			sum+=a%10;
			a=a/10;
			if (a==0) {
				break;
			}
			
		}
		System.out.println("총합 : "+sum);
	}
}
