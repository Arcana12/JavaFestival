package DI;

import java.util.Scanner;

public class ex30 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 N을 입력해주세요 : ");
		int input = sc.nextInt();
		int count = 1;
		int[][] arr = new int[input][input];

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = count;
					count++;
				}
			}
			else {
				for (int j = arr[i].length-1; j >= 0; j--) {
					arr[i][j] = count;
					count++;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
