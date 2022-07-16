package SJ;

import java.util.Scanner;

public class ex15_2잔돈 {

	public static void main(String[] args) {
		// 거스름돈
		System.out.print("현재금액 : ");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		System.out.println("잔돈변환");
		int[] don = {10000,5000,1000,500,100};   //돈의 단위가 큰것부터 빼야하니까 
		int result=0; 
		
		for(int i : don) {       
			result = money/i;   //result에는 그 단위의 개수 저장 
			money-=result*i;    //나머지 돈에서 그 다음 단위의 계산을 위해 입력받은 돈에서 그 단위와 개수 곱한 값을 뺀다
			System.out.println(i+"원 : "+result+"개");
		}		
	}
}
