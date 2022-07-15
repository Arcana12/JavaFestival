package DY;
import java.util.Scanner;

public class ex15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("현재금액 : ");
		int a = sc.nextInt();
		
		System.out.println("잔돈반환");
		System.out.println("10000원 : "+a/10000+"개" );
		System.out.println("5000원 : "+a%10000/5000+"개" );
		System.out.println("1000원 : "+a%10000%5000/1000+"개" );
		System.out.println("500원 : "+a%10000%5000%1000/500+"개");
		System.out.println("10000원 : "+a%10000%5000%1000%500/100+"개" );
	}
}	
