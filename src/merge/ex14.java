package merge;

import java.util.Scanner;

public class ex14 {

	public static void main(String[] args) {
		// 정수 배열
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 >> ");
		int n = sc.nextInt();
		int[][] arrN = new int[n][n];
		int a = 1;
		for(int j=0;j<n;j++) {
			for(int i=0;i<n;i++) {
				arrN[i][j]=a++;    //세로로 숫자가 하나씩 커지는 형태니까 세로방향으로 값을 +1씩 넣어줌
			}
		}
		for(int j=0;j<n;j++) {  //2차배열 프린트
			for(int i=0;i<n;i++) {
				System.out.print("\t"+arrN[j][i]+"\t");
			}System.out.println();
		}
		
	}

}
