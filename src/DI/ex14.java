package DI;

import java.util.Scanner;

public class ex14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 N을 입력해주세요 : ");
		int input = sc.nextInt();
		
		int[][] arr= new int[input][input];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				//index값은 0부터 시작하기 때문에 i+1부터 시작
				//j값이 arr.length씩 증가되기 때문에 j*arr.length
				System.out.print((i+1)+(j*arr.length)+"\t");
			}
			System.out.println();
		}
	}
}

