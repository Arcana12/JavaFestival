package SJ;

import java.util.Scanner;

public class ex18_정수총합 {

	public static void main(String[] args) {
		System.out.print("숫자를 입력하시오 : ");
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int num = sc.nextInt();
		for(int i=1;i<=num;i++) {   //1부터 입력받은 숫자까지 차례대로 더해줌
			sum+=i;
		}
		System.out.printf("1부터 %d까지의 합은 %d입니다.",num,sum);
	}

}
