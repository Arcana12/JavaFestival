package HJ;

import java.util.Scanner;

public class java17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("사려는 상품개수를 입력하세요 >> ");
		int a = 10000;
		double b = 0.1;
		int c = sc.nextInt();
		System.out.print("가격은 ");
		if(c>=11) {
			System.out.println(((c*10000)-(int)(c*b*10000))+"원 입니다.");
		}else {
			System.out.println((c*10000)+"원 입니다.");
		}
	}

}
