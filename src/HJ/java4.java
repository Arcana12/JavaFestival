package HJ;

import java.util.Scanner;

public class java4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자 입력>>");
		int a = sc.nextInt();
		System.out.print("두번째 숫자 입력>>");
		int b = sc.nextInt();
		
		int result1 = a*(b%100%10);
		int result2 = a*(b%100/10);
		int result3 = a*(b/100);
		int result4 = a*b;
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
	}

}
