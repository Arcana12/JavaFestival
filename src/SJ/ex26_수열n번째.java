package SJ;

import java.util.Scanner;

public class ex26_수열n번째 {

	public static void main(String[] args) {
		// 1,2,4,7,11...n번째항까지 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("n 입력 : ");
		int n = sc.nextInt();
		int num = 1;  // 처음 시작하는 수
		for (int i = 1; i <= n; i++) {
			System.out.print(num + " ");
			num += i;  //1, 2, 3...을 더한값만큼 커지므로
		}
	}

}
