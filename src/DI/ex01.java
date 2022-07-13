package DI;

import java.util.Scanner;

public class ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int input = sc.nextInt();
		System.out.println("결과 : "+(input-(input%100)));
	}
}
