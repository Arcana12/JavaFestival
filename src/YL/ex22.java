package YL;

import java.util.Scanner;

public class ex22 {

	public static void main(String[] args) {
		System.out.println("----다이어트 프로그램----");
		Scanner sc = new Scanner(System.in);
				
				int num1 = 1;
				
				System.out.print("현재 몸무게를 입력하시오 : ");
				int num2 = sc.nextInt();
				System.out.print("목표 몸무게를 입력하시오 : ");
				int num3 = sc.nextInt();
				
				do {
					System.out.print(num1+"주차 감량 몸무게 : ");
					int num4 = sc.nextInt();
					num2 -= num4;
					num1++;
				}while(num2>num3);{
					System.out.println(num1+"주차 다이어트 성공!!");
				}
	}

}
