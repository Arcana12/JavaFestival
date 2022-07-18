package JY;

import java.util.Scanner;

public class ex21_약수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("약수를 구할 수를 입력하시오 : ");
		int n = sc.nextInt();
		
		System.out.print(n+"의 약수는 : ");
		
		for (int i =1; i<=n; i++){
			if(n%i==0) {
				System.out.print(i+" ");
			}
		}
	}//main end
}
