package DI;

import java.util.Scanner;

public class ex30 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 N을 입력해주세요 : ");
		int input = sc.nextInt();
		
		int[][] arr= new int[input][input];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				//index값은 0부터 시작하기 때문에 i에 1을 더해줌
				//i의 값이 arr길이의 배수+1씩 증가하기 떄문에(1+i*arr.length)
				System.out.print(1+i*arr.length+j+"\t");
			}
			System.out.println();
		}
	}
}
