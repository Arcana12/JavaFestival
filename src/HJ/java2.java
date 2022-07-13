package HJ;

import java.util.Scanner;

public class java2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("년도 입력 >>");
		int a = sc.nextInt();
		if(a%4==0 && a%100!=0) {
			System.out.println("윤년");
		}else if(a%400==0){
			System.out.println("윤년");
		}else {
			System.out.println("윤년 아님");
		}
	}

}
