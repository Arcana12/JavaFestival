package DI;

import java.util.Scanner;

public class ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("최대 공약수&최소 공배수 구하기");
		System.out.print("숫자1입력>>");
		int num1 = sc.nextInt();
		System.out.print("숫자2입력>>");
		int num2 = sc.nextInt();
		if(num2>num1) {
			int tmp = num1;
			num1 = num2;
			num2 = tmp;
		}
		int gcd = 0;
		for(int i=2;i<num2;i++) {
			if(num1%i==0 && num2%i==0) {
				gcd = i;
				break;
			}
		}
		
		System.out.println("최대공약수: "+gcd);
		System.out.println("최소공약수: " +(num1*num2)/gcd);
	}
}
