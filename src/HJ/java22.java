package HJ;

import java.util.Scanner;

public class java22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("----다이어트 프로그램----");
		Scanner sc = new Scanner(System.in);
		System.out.print("현재 몸무게를 입력하시오 : ");
		int a = sc.nextInt();
		System.out.print("목표 몸무게를 입력하시오 : ");
		int b = sc.nextInt();
		int num=1; //주차 감량 몸무게
		while(a>b) { //계속 입력 해야하니 while로 무한 반복
			System.out.print(num+"주차 감량 몸무게 입력 : ");
			num++; //2,3,4,...
			int c=sc.nextInt();  //몸무게 입력
			a-=c; //빼주기
		}
		System.out.println((num-1)+"주차 다이어트 성공 !!!"); //+=1때문에 4가 나오니 -1로
	}

}
