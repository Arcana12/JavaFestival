package DI;

import java.util.Scanner;

public class ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("행 개수 : ");
		int input = sc.nextInt();
		for (int i=input; i>0; i--) {
			for (int j=0; j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
