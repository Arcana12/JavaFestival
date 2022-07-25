package SJ;

import java.util.Random;
import java.util.Scanner;

public class study {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("정수를 입력하세요 >> ");
		int n = sc.nextInt();
		int[][] array = new int[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i%2==0) {
				array[i][j]=n*i+j+1;
				}else {
					array[i][j]=n*(i+1)-j;
				}
			}
			}
			for (int i =0;i<array.length;i++) {
				for(int j =0;j<array[i].length;j++) {
					System.out.print(array[i][j]+"\t");
				}
				
				System.out.println();
		}
	}

}
