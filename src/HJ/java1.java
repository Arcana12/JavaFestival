package HJ;

import java.util.Scanner;

public class java1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("정수입력 : ");
		int a = sc.nextInt();
		System.out.println("결과 : "+(a-(a%100)));
	}

}
