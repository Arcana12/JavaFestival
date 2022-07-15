package YL;

import java.util.Scanner;

public class ex14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 N 입력 >>");
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		int k = 1;
		for(int i = 0; i < arr.length; i++){
		for(int j =0; j<arr[0].length; j++){
		arr[i][j] = k;
		k++;
		}
		}
		for (int i =0; i < arr.length; i++){
		for(int j=0; j <arr[0].length; j++){
		System.out.print(arr[j][i]+ "  ");
		}
		System.out.println();
		}

	}

}
