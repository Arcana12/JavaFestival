package JY;

import java.util.Scanner;

public class ex04_세자리수곱셈계산기 {
	public static void main(String[] args) {
		//세자리수 곱하기 출력하기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 입력 >> ");
		int n1 = sc.nextInt();
		System.out.print("두 번째 숫자 입력 >> ");
		int n2 = sc.nextInt();
		
		int total = n1*n2;
		
		while(n2!=0) {
			System.out.println(n1*(n2%10));
			n2/=10;
		}
		System.out.println(total);
	}
}
