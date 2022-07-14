package DI;

import java.util.Scanner;

public class ex29 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력>>");
		int input = sc.nextInt();
		
		//결과값을 저장하기 위한 String변수 선언
		String answer = "";
		
		while (input>0) {
			answer = (input%2) +" "+ answer;
			input = input/2;
		}
		//10 = 1010
		//10%2 = 0				answer = "0 "
		//(10/2)%2 = 1			answer = "1 0 "
		//((10/2)/2)%2 = 0		answer = "0 1 0 "
		//(((10/2)/2)/2)%2 = 1	answer = "1 0 1 0 "
		
		System.out.println(answer);
		
		//Interger class과 String class를 사용하는 방법
//		String answer = Integer.toBinaryString(input);
//		char[] tmp = new char[answer.length()];
//		for (int i = 0; i < answer.length(); i++) {
//			tmp[i] = answer.charAt(i);
//		}
//		for(char s : tmp) {
//			System.out.print(s + " ");
//		}

	}
}
