package SJ;

import java.util.Scanner;

public class ex17_마트계산대 {

	public static void main(String[] args) {
		// 11개이상 10%할인
		Scanner sc = new Scanner(System.in);
		System.out.print("사려는 상품개수를 입력하세요 >> ");
		int num = sc.nextInt();
		if(num>=11) {
			System.out.println("가격은 "+(int)(num*10000*0.9)+"원 입니다.");
		}
		else {
			System.out.println("가격은 "+num*10000+"원 입니다.");
		}
	}

}
