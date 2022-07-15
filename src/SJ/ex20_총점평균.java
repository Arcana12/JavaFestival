package SJ;

import java.util.Scanner;

public class ex20_총점평균 {

	public static void main(String[] args) {
		// 1차원 배열 이용하여 점수 입력받고 총점 평균 저장하고 출력
		int[] score = new int[3];
		String[] subject = {"java","web","and"};     //프린트 할때 점수 배열과 같이 짝 맞춰서 프린트 하기 위해 지정
		Scanner sc = new Scanner(System.in);
		System.out.print("java 점수 : ");
		score[0] = sc.nextInt();
		System.out.print("web 점수 : ");
		score[1] = sc.nextInt();
		System.out.print("and 점수 : ");
		score[2] = sc.nextInt();

		int sum = 0;
		for(int i=0;i<score.length;i++) {
			System.out.println(subject[i]+" : "+score[i]);
			sum+=score[i];
		}
		int avg = sum/score.length;
		System.out.println("sum : "+ sum);
		System.out.println("avg : "+ avg);
	}

}
