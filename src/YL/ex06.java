package YL;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 :");
		int num = sc.nextInt();
		int sum = 0;
		int result = num;

		while (result > 0) {
			sum += result % 10;
			result = result / 10;
			}

		System.out.println("합은 " + sum + "입니다.");

	}

}
