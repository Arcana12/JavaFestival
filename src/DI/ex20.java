package DI;

import java.util.Scanner;

public class ex20 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//길이가 3인 배열 생성
		int[] score = new int[3];
		System.out.print("java 점수 : ");
		score[0] = sc.nextInt();
		System.out.print("web 점수 : ");
		score[1] = sc.nextInt();
		System.out.print("and 점수 : ");
		score[2] = sc.nextInt();
		
		
		int sum = 0;
		//합을 구하기 위한 for-each문
		//for-each문은 해당 배열의 인덱스0부터 끝까지 반복하며 순서대로 왼쪽 변수 i에 대입
		for(int i : score) {
			sum+=i;
		}
		
		System.out.println("java : "+score[0]);
		System.out.println("web : "+score[1]);
		System.out.println("and : "+score[2]);
		System.out.println("sum : "+sum);
		System.out.println("avg : "+sum/score.length);
		
	}
}
