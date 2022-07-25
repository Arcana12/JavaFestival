package SJ;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		// 최대공약수 최소공배수
		Scanner sc = new Scanner(System.in);
		System.out.println("최대 공약수&최소 공배수 구하기");
		System.out.print("숫자1입력>> ");
		int n1 = sc.nextInt();
		System.out.print("숫자2입력>> ");
		int n2 = sc.nextInt();
		int da = 1;   //최대공약수는 나눠지는 수들의 곱 이므로 초기값을 1로 설정

		for (int i = 2; i <= (n1>n2 ? n2 : n1); i++) {   //삼항연산자를 이용해서 둘중 작은수 찾아 작은수 까지만 차례대로 나눔(약수 구하는 방법처럼)
			if ((n1 % i == 0) && (n2 % i == 0)) {  // 두 숫자 동시에 나눠지는 숫자 찾기
				da = i;  
			}
		}
		int so = (n1*n2) / da;  //최소공배수 = 두수를 곱한 값을 최대공약수로 나눈 값
		System.out.println("최대공약수: " + da);
		System.out.println("최소공배수: " + so);

	}
}
