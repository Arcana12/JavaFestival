package DI;

import java.util.Scanner;

public class ex15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재 금액 : ");
		int money = sc.nextInt();
		
		System.out.println("잔돈변환");
		System.out.println("10000원 : " + money/10000);
		//만원단위를 제외하고 나머지를 5000으로 나누었을때 몫이 5000원의 개수
		System.out.println("5000원 : "+(money%10000)/5000);
		//5000원이상을 제외하고 1000으로 나누었을때 몫이 1000원의 개수
		System.out.println("1000원 : "+(money%5000)/1000);
		System.out.println("500원 : "+(money%1000)/500);
		System.out.println("100원 : "+(money%500)/100);
		
	}
}
