package SJ;

import java.util.Scanner;

public class ex24_소인수 {

	public static void main(String[] args) {
		// 입력받은 수 소인수분해하기
		Scanner sc = new Scanner(System.in);
		System.out.print("소인수분해 할 수를 입력하세요. : ");
		int num = sc.nextInt();
		System.out.print(num + " = ");
		for (int i = 2; i <= num; i++) {
			while (num % i == 0) {          //예를들어 i가2이면 2로 계속 나누어질때까지 반복 
				if (num == i) {             // 마지막 나누는 숫자 뒤에는 "*" 를 안넣기 위해서
					System.out.print(i);
					break;
				} else {
					num /= i;         //
					System.out.print(i + "*");
				}
			}
		}
	}

}
