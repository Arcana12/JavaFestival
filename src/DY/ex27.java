package DY;

import java.util.Scanner;

public class ex27 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] array = new int[5];
		for(int i =0;i<array.length;i++) {
			System.out.print(i+1+"번째 입력 : ");
			array[i]=sc.nextInt();
		}
		for(int i = 0;i<array.length;i++) {
			System.out.print(array[i]+" : ");
			for(int j=array[i];j>0;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
