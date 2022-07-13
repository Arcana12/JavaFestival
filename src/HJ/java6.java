package HJ;

import java.util.Scanner;

public class java6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int input=sc.nextInt();
		int num=0;
		int tmp=input;
		for(int i=0; i<8;i++) {
			System.out.println(num);
			num+=tmp%10;
			tmp=tmp/10;
		
		}
		System.out.println("합은"+num+"입니다.");
	}

}
