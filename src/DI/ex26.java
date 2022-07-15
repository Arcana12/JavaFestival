package DI;

import java.util.Scanner;

public class ex26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("n 입력 : ");
		int n = sc.nextInt();
		int seq = 0;
		for (int i = 1; i <= n; i++) {
			if (i == 1) {
				seq = 1;
				System.out.print(seq + " ");
			} else {
				seq += (i - 1);
				System.out.print(seq + " ");
			}
		}
	}
}
