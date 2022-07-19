package merge;

import java.util.Scanner;

public class ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("최대 공약수&최소 공배수 구하기");
		System.out.print("숫자1입력>>");
		int num1 = sc.nextInt();
		System.out.print("숫자2입력>>");
		int num2 = sc.nextInt();
		
		int gcd = 1;
		for(int i=2;i<num2;i++) {
			//두 수가 나누어 떨어지는 최소값이 최대공약수가 됨
			if(num1%i==0 && num2%i==0) {
				gcd = i;
				break;
			}
		}
		System.out.println("최대공약수: "+gcd);
		//최소 공배수는 두 수의 곱을 최대공약수로 나누면 최소공배수가 나옴
		System.out.println("최소공약수: " +(num1*num2)/gcd);
	}
}
