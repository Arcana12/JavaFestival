package DI;

import java.util.Scanner;

public class ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 입력 >> ");
		int input1 = sc.nextInt();
		System.out.print("두 번째 숫자 입력 >> ");
		int input2 = sc.nextInt();
		System.out.println(input1*(input2%10));
		System.out.println(input1*(input2%100/10));
		System.out.println(input1*(input2/100));
		System.out.println(input1*input2);
	}
}
