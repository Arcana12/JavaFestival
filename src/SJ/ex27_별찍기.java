package SJ;

import java.util.Scanner;

public class ex27_별찍기 {

	public static void main(String[] args) {
		// 인덱스 값만큼 별찍기
		Scanner sc = new Scanner(System.in);
		int[] star = new int[5];
		for (int i = 1; i <= star.length; i++) {
			System.out.print(i + "번째 입력 : ");
			star[i - 1] = sc.nextInt();
		}
		for (int i = 0; i < 5; i++) {
			System.out.print(star[i] + " : ");
			for (int j = 0; j < star[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
