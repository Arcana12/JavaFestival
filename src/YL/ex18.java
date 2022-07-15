package YL;

import java.util.Scanner;

public class ex18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하시오 : ");
		int n = sc.nextInt();

		int sum = 0;

		for(int i = 1; i <n; i++)
		sum += i;
		System.out.print("1부터"+n+"까지의 합은"+sum+"입니다.");


	}

}
