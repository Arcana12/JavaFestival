package DI;

import java.util.Scanner;

public class ex17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("사려는 상품개수를 입력하세요 >> ");
		int num = sc.nextInt();
		
		int price = 0;
		
		if(num>10) {
			//11개 이상 구매시 10%할인
			price = (int)((num*10000)*0.9);
		}
		else {
			price = num*10000;
		}
		System.out.println("가격은 "+price+"원 입니다.");
	}
}
