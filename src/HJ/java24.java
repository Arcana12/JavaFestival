package HJ;

import java.util.Scanner;

public class java24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("소인수분해 할 수를 입력하세요. : ");
		int a = sc.nextInt();
		System.out.print(a+" = ");
		for(int i=2; i<=a;i++) {
			while(a%i==0) { //무한반복으로 나누어주기
				a/=i; // 몫만 구해주기
				if(a==1) { //몫이 1이 나온다면 결과가 다 끝났으니 나왔던 나머지 넣어주기
					System.out.print(i);
				}else { //몫이 1이 아니라면 계속 구해주기
					System.out.print(i+"*");
				}
			}
			
		}
	}

}
