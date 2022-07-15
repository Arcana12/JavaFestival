package SJ;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		// 합격 여부
		Scanner sc = new Scanner(System.in);
		System.out.print("1. 소프트웨어 설계 >> ");
		int so = sc.nextInt();
		System.out.print("2. 소프트웨어 개발 >> ");
		int sw = sc.nextInt();
		System.out.print("3. 데이터베이스 구축 >> ");
		int da = sc.nextInt();
		System.out.print("4. 프로그래밍 언어 활용 >> ");
		int pg = sc.nextInt();
		System.out.print("5. 정보시스템 구축관리 >> ");
		int sy = sc.nextInt();
		if((so+sw+da+pg+sy>=60)&&(so>=8 && sw>=8 && da>=8 && pg>=8 && sy>=8)){
			System.out.println("합격입니다!");
		}
		else {
			System.out.println("탈락입니다...");
		}
	}

}
