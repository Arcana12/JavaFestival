package DI;

import java.util.Scanner;

public class ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("년도 입력 >> ");
		int input = sc.nextInt();
		if(input%4==0 && input%100!=0 || input%400 == 0) {
			System.out.println("윤년");
		}
		else {
			System.out.println("윤년 아님");
		}
	}
}
