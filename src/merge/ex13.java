package merge;

import java.util.Scanner;

public class ex13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("구하고 싶은 약수를 입력하시오 : ");
		int input = sc.nextInt();
		
		//1부터 입력값까지 반복
		for(int i=1;i<=input;i++) {
			System.out.print(i+" : ");
			//1부터 i까지의 값을 반복
			for(int j=1; j<=i; j++) {
				//자기 자신을 다른 수로 나누었을때 나머지가 0인값은 약수이다.
				if(i%j==0) {
					System.out.print(j+" ");
				}
			}
			System.out.println();
		}
	}
}
