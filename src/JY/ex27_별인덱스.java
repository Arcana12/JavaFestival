package JY;

import java.util.Scanner;

public class ex27_별인덱스 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr= new int[5];
		
		for(int i=0; i<arr.length; i++) { //arr 값입력
			System.out.print((i+1)+"번째 입력 : ");
			int n = sc.nextInt();
			arr[i]=n;
		}System.out.println();
		
		for (int i=0; i<arr.length; i++) { //출력
			System.out.print(arr[i]+" : ");
			for (int k=1; k<=arr[i]; k++) {
				System.out.print("*");
			}System.out.println();
		}
		
	}//main end
}
