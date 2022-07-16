package SJ;

import java.util.Scanner;

public class ex22_다이어트 {

	public static void main(String[] args) {
		// 목표 도달몸무게 달성하면 프로그램 종료
		Scanner sc = new Scanner(System.in);
		System.out.println("----다이어트 프로그램----");
		System.out.print("현재 몸무게를 입력하시오 : ");
		int nowKg = sc.nextInt();
		System.out.print("목표 몸무게를 입력하시오 : ");
		int goalKg = sc.nextInt();
		int i = 1;
		while(goalKg<nowKg) {
			System.out.print(i+"주차 감량 몸무게 입력 : ");
			int diet = sc.nextInt();
			nowKg-=diet;
			i++;
		}
		System.out.println((i-1)+"주차 다이어트 성공!!!");
	}
}
