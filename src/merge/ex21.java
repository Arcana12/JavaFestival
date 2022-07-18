package merge;

import java.util.Scanner;

public class ex21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("구하고 싶은 약수를 입력하시오 : ");
		int input = sc.nextInt();
		
		System.out.print(input+"의 약수는 : ");
		for (int j = 1; j <= input; j++) {
			// 자기 자신을 다른 수로 나누었을때 나머지가 0인값은 약수이다.
			if (input % j == 0) {
				System.out.print(j + " ");
			}
		}
	}
}
