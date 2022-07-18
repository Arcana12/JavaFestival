package DI;

import java.util.Scanner;

public class ex27 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//입력값을 저장하기 위한 배열
		int[] arr = new int[5];
		
		for(int i = 0; i<arr.length;i++) {
			System.out.print(i+1+"번째 입력 : ");
			//입력값을 arr[]에 저장
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i<arr.length;i++) {
			System.out.print(arr[i]+" : ");
			for(int j = 0;j<arr[i];j++) {
				System.out.print("*");
			}
			//arr[i]의 수만큼 *출력 후 개행을 위함
			System.out.println();
		}
		
	}
}
