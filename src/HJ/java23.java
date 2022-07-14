package HJ;

import java.util.Scanner;

public class java23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.print("입력 : ");
		System.out.println(a);
		int num=1;
		System.out.print("출력 : ");
		for(int i=1;i<=a;i++) {
			num*=i;
		}
		System.out.println(num);
	}

}
