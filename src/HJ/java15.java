package HJ;

import java.util.Scanner;

public class java15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in) ;
			System.out.print("현재금액 : ");
			int a = sc.nextInt();
			System.out.println("잔돈변환");
			System.out.print("10000원 : ");
			System.out.println(a/10000+"개");
			System.out.print("5000원 : ");
			System.out.println(a%10000/5000+"개");
			System.out.print("1000원 : ");
			System.out.println(a%10000%5000/1000+"개");
			System.out.print("500원 : ");
			System.out.println(a%10000%5000%1000/500+"개");
			System.out.print("100원 : ");
			System.out.println(a%10000%5000%1000%500/100+"개");
		
	}

}
