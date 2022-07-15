package YL;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		System.out.println("년도 입력>>");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.print("윤년");
		} else {
			System.out.print("윤년 아님");
		}
	}


	}


