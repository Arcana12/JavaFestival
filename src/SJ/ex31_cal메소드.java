package SJ;

import java.util.Scanner;

public class ex31_cal메소드 {

	public static void main(String[] args) {
		// num1, num2,op(+-*/) cal메소드
		int num1 = 50;
		int num2 = 15;
		char op = '*';
		
		System.out.println(cal(num1,num2,op));	

	}
	public static int cal(int a, int b, char c) {
		int result=0;
		if(c=='+') {
			result = a+b;
		}else if(c=='-') {
			result = a-b;
		}else if(c=='*') {
			result = a*b;
		}else if(c=='/') {
			result = a/b;
		}		
		return result;
				
	}
}
