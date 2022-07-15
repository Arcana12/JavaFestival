package SJ;

import java.util.Scanner;

public class ex23_팩토리얼 {

	public static void main(String[] args) {
		// 정수 입력받아 팩토리얼 값 구하기 N!
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int num = sc.nextInt();
		int hap = 1;
		for(int i=1;i<=num;i++) {
			hap*=i;
		}
		System.out.println("출력 : "+hap);
	}

}
