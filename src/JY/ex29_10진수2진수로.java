package JY;

import java.util.Scanner;

public class ex29_10진수2진수로 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 >> ");
		int n = sc.nextInt();
		int[] arr = new int[10];
		
		int i =0;
		
		while (n>0) {
			arr[i]=n%2;//n%2의 몫을 담기
			i++; //배열추가
			n=n/2; //n계산
		}
		
		for(int k=i-1; k>=0; k-- ) { //배열의 역순출력
			System.out.print(arr[k]);
		}
	}//main end
}
