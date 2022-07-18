package merge;

import java.util.Scanner;

public class ex18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하시오 : ");
		int input = sc.nextInt();
		
		int sum = 0;
		
		//1부터 입력받은 input값까지 반복
		for(int i=1;i<=input;i++) {
			sum+=i;
		}
		
		System.out.print("1부터 "+input+"까지의 합은 "+sum+"입니다.");
	}
}
