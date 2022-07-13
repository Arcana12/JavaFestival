package DI;

import java.util.Scanner;

public class ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("반올림 점 값 : ");
		int input = sc.nextInt();
		int result=0;
		//올림
		if(input%10>5) {
			result = input-input%10+10;
		}else {  //버림
			result = input-input%10;
		}
		System.out.print("반올림 후 값 : "+result);
	}
}
