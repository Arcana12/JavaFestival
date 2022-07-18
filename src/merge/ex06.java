package merge;

import java.util.Scanner;

public class ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		int sum=0;
		int tmp = input;
		for(int i=0; i<8;i++) {
			//입력값의 1의자리를 sum에 넣어 더하기 위함
			sum += tmp%10;
			tmp = tmp/10;
		}
		System.out.println("합은 "+sum+"입니다.");
	}
}
