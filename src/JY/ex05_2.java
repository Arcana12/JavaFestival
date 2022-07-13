package JY;

import java.util.Scanner;

public class ex05_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("최대 공약수 & 최소 공배수 구하기");
		
		System.out.print("숫자 1 입력 : ");
		int n1 = sc.nextInt();
		System.out.print("숫자 2 입력 : ");
		int n2 = sc.nextInt();
		
		int k=1;
		
		for (int i =2; i <= (n1>n2 ? n2: n1); i++) { // i가 작은수와 비교되야함, 둘중에 작은수 찾기. 
			if((n1%i==0)&&(n2%i==0)) { //각자의 약수중 공통된것 
				k *=i; //최대공약수는 약수들의 곱
			}
		}
		
		//최대공배수 두 수를 약수로 나눈 값 * 최대공약수
		int n = (n1/k)*(n2/k)*k;
		
		System.out.println("최대공약수 : "+k);
		System.out.println("최소공배수 : "+n);
		
	}
}
