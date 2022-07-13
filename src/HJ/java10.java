package HJ;

import java.util.Scanner;

public class java10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("반올림 전 값 : ");
		int a = sc.nextInt();
		int b = a%10;
		if(b>=5) {
			System.out.print("반올림 후 값 : ");
			System.out.println((a/10)*10+10);
		}else {
			System.out.print("반올림 후 값 : ");
			System.out.println(a/10*10);
		}
	}

}
