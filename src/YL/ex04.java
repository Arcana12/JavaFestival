package YL;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 입력>>");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 입력>>");
		int num2 = sc.nextInt();
		int a = num1 * (num2%10); //일의 자릿수
		int b = num1 * (num2%100/10); // 십의 자릿수
		int c = num1 * (num2/100); // 백의 자릿수
		int d = num1*num2;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

	}

}
