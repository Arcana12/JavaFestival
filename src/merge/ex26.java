package merge;

import java.util.Scanner;

public class ex26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n 입력 : ");
		int  a = sc.nextInt();

		int b = 1;
		for(int i = 1 ;i<=a;i++) {
			System.out.print(b+" ");
			b+=i;
		}
	}
}
