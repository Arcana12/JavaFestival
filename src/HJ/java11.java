package HJ;
import java.util.Scanner;
public class java11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("1.소프트웨어 설계 >>");
		int a = sc.nextInt();
		System.out.println("2.소프트웨어 개발 >>");
		int b = sc.nextInt();
		System.out.println("3.데이터베이스 구축 >>");
		int c = sc.nextInt();
		System.out.println("4.프로그래밍 언어 활용 >>");
		int d = sc.nextInt();
		System.out.println("5.정보시스템 구축관리 >>");
		int e = sc.nextInt();
		int num = (a+b+c+d+e);
		if(num>=60 && a>=8 && b>=8 && c>=8 && d>=8 && e>=8) {
			System.out.println("합격입니다!");
		}else {
			System.out.println("탈랍입니다...");
		}
	}

}
