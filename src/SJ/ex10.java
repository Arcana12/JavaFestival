package SJ;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		// 반올림
		Scanner sc= new Scanner(System.in);
		System.out.print("반올림 전 값 : ");
		int num = sc.nextInt();
		if(num%10>=5) {
			System.out.println("반올림 후 값 : "+ (num-num%10+10));
		}
		else {
			System.out.println("반올림 후 값 : "+ (num-num%10));
		}
	}

}
