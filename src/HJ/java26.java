package HJ;

import java.util.Scanner;

public class java26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("n 입력 : ");
		int n = sc.nextInt();
		int num=1; //처음시작하는 수
		for(int i=0; i<n;i++) { //0부터 시작해서 처음에 1 나오기
			num+=i; // 1+0,1+1,2+2,4+3...
			System.out.print(num+" ");
		}
	}
}
