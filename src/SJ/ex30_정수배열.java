package SJ;

import java.util.Scanner;

public class ex30_정수배열 {

	public static void main(String[] args) {
		// 정수 n을 입력받아 n X n배열에 저장하고 출력
		Scanner sc =new Scanner(System.in);
		System.out.print("정수를 입력하세요 >> ");
		int n = sc.nextInt();
		int[][] array = new int[n][n];
		int num=1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				array[i][j]=num++;
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(array[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
