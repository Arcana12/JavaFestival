package DI;

import java.util.Scanner;

public class ex23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		int input = sc.nextInt();
		
		int factorial = 1;
		for(int i=1; i<=input;i++) {
			factorial *=i;
		}
		System.out.print("출력 : "+factorial);
		
		
	}
}
