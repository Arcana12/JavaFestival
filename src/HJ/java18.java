package HJ;

import java.util.Scanner;

public class java18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("숫자를 입력하시오 : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int num=0;
		for(int i=1; i<=a;i++) {
			num+=i;
		}
		System.out.print("1부터 "+a+"까지의 합은 "+ num+"입니다.");
	}

}
