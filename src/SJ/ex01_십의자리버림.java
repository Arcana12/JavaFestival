package SJ;

import java.util.Scanner;

public class ex01_십의자리버림 {

	public static void main(String[] args) {
		// 십의자리 버리는 코드
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int num = sc.nextInt();
		System.out.println("결과 : "+ num/100*100);  
	}

}
