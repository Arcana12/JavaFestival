package HJ;

import java.util.Scanner;

public class java14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요 : ");
		int N = sc.nextInt();
		int [][]array = new int[N][N];
		for(int i=0; i<N;i++) {
			for(int j=0; j<N;j++) {
				array[i][j]=(i)+(j*5+1);
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
