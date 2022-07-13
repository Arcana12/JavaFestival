package HJ;

import java.util.Random;

public class java3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = new int[8];
		Random rd = new Random();
		int number = rd.nextInt(99)+1;
		System.out.print("배열에 있는 모든 값 : " );
		for(int i=0; i<=7; i++) {
			array[i] = rd.nextInt(99)+1;
			System.out.print(array[i]+" ");
		}
		int max = array[0];
		int mini = array[0];
		
		for(int i=0;i<array.length;i++) {
			if(max<array[i]) {
				max=array[i];
			}
			if(mini>array[i]) {
				mini=array[i];
			}
		}
		System.out.println();
		System.out.println("가장 큰 값 : " + max);
		System.out.println("가장 작은 값 : " + mini);
	}
}
