package HJ;

import java.util.Scanner;

public class java9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 3;
		boolean result = isDivide(num1,num2);
		System.out.println("결과확인 : " + result);
	}
	public static boolean isDivide(int a,int b) {
		return a%b==0;
		}
	}

