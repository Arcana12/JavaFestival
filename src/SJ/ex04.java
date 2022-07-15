package SJ;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		// 세자리수 곱
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 입력 >> ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 입력 >> ");
		int num2 = sc.nextInt();
		
		int il = num2%10;   // 두번째 숫자의 일의자리 
		int sip = (num2%100-il)/10;   // 두번째 숫자의 십의자리 
		int bak = num2/100;   // 두번째 숫자의 백의자리 
		
		System.out.println(num1*il);     
		System.out.println(num1*sip);    
		System.out.println(num1*bak);
		System.out.println(num1*il+(num1*sip)*10+(num1*bak)*100);
	}

}
