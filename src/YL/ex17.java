package YL;

import java.util.Scanner;

public class ex17 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("사려는 상품 갯수를 입력하세요 : ");
		int count = sc.nextInt();
		double discount = 1.0;
		
		if(count>=11) {
			discount -= 0.1; //discount = discount-0.1;
		}
		
		System.out.println("가격은"+(int)(count*10000*discount)+"원 입니다");

	}

}
