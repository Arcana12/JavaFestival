package DI;

import java.util.Random;

public class ex03 {
	public static void main(String[] args) {
		Random r = new Random();
		
		int[] arr = new int[8];
		System.out.print("배열에 있는 모든 값 : ");
		for(int i=0; i<arr.length;i++) {
			arr[i] = r.nextInt(98)+1;
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int max = arr[1];
		int min = arr[1];
		for(int i =0; i<arr.length-1;i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
			if(min>arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("가장 큰 값 : "+max);
		System.out.println("가장 작은 값 : "+min);
	}
}
