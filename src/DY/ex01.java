package DY;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	     System.out.print("정수입력 : ");
	     int a = sc.nextInt();
	     System.out.print("결과 : "+(a-(a%100)));

	}

}
