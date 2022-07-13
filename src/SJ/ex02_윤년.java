package SJ;

import java.util.Scanner;

public class ex02_윤년 {

	public static void main(String[] args) {
		//윤년 구하기
		System.out.print("년도 입력 >> ");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if ((year%4==0 && year%100!=0)||(year%400==0)) {    // 4의 배수이면서 100의 배수가 아닌것    또는  400의 배수   
			System.out.println("윤년");
		}
		else {
			System.out.println("윤년 아님");
		}
	}

}
