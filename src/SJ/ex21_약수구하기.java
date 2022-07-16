package SJ;

import java.util.Scanner;

public class ex21_약수구하기 {

	public static void main(String[] args) {
		// 입력받은 수의 약수
		Scanner sc = new Scanner(System.in);
		System.out.print("구하고 싶은 약수를 입력하시오 : ");
		int num = sc.nextInt();
		System.out.print(num+"의 약수는 : ");
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.print(i+" ");
			}
		}		
	}
}
