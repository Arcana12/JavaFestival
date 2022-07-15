package DI;

import java.util.Scanner;

public class ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("년도 입력 >> ");
		int input = sc.nextInt();
		//윤년 계산 4의배수(input%4==0)이면서 100의배수가 아닐때(&& input%100!=0)는 윤년
		//또는 400의 배수일 때 윤년이다.  || input%400 == 0
		if(input%4==0 && input%100!=0 || input%400 == 0) {
			System.out.println("윤년");
		}
		else {
			System.out.println("윤년 아님");
		}
	}
}
