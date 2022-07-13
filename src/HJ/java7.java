package HJ;

import java.util.Scanner;

public class java7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("행 개수 : ");
		int a = sc.nextInt();
		for(int i=0;i<a;i++) {
			for(int j=a; j-i>0;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
