package SJ;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		// 정수의 합
		System.out.print("정수 입력 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		while (num > 0) {     //끝에 한자리씩 빼서 더하기
			sum += num % 10;
			num /= 10;
		}
		System.out.println("합은" + sum + "입니다");
	}

}
