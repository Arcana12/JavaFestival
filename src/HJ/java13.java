package HJ;

import java.util.Scanner;

public class java13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("구하고 싶은 약수를 입력하시오 : ");
		int num = sc.nextInt();
		for(int i=1;i<=num;i++) {
			System.out.print(i+" : ");
			for(int j=1; j<=num;j++) {
				if(i%j==0) {
					System.out.print(j+" ");
				}
			}
			System.out.println();
		}
	}

}
