package DY;

import java.util.Scanner;

public class ex29 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력 >> ");
		int a = sc.nextInt();
		int i = 0;
		String s = "";
		while (a > 0) {
			i = a % 2;
			a = a / 2;
			s = i + " " + s;
		}

		System.out.println(s);
	}
}
