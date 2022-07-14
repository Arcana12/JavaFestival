package DI;

import java.util.Scanner;

public class ex22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("----다이어트 프로그램----");
		System.out.print("현재 몸무게를 입력하시오 : ");
		int now = sc.nextInt();
		
		System.out.print("목표 몸무게를 입력하시오 : ");
		
		int target = sc.nextInt();
		//주차 표시를 위한 변수
		int week = 1;
		while (true) {

			if (now > target) {
				System.out.print(week + "주차 감량 몸무게 입력 : ");
				int minus = sc.nextInt();
				now -= minus;
			}
			
			if(now<=target) {
				System.out.println(week + "주차 다이어트 성공 !!!");
				break;
			}
			//week 변수를 위로 이동시 감량 후 바로 week가 증가하기 때문에
			//모든 조건이 끝나는 위치에 week++;를 배치
			week++;
		}
	}
}
