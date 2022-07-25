package SJ;

import java.util.Random;

public class ex03 {

	public static void main(String[] args) {
		// 큰수 작은수 출력
		int[] array = new int[8];   // 8칸 크기 배열 선언
		Random rd = new Random();    
		for (int i = 0; i < array.length; i++) {
			array[i] = rd.nextInt(99) + 1;   // 1~99 사이의 랜덤수로 초기화
		}
		System.out.print("배열에 있는 모든 값 : ");
		for (int a : array) {
			System.out.print(a + " ");
		}
		System.out.println();
		int max = 0;
		int min = 100;    //최소값 비교를 위해 임의로 100이라고 지정
		for (int a : array) {    //a에 배열 원소 하나씩 넣어서 비교
			if (a > max) {      
				max = a;    
			}
			if (a < min) {
				min = a;
			}
		}
		System.out.println("가장 큰 값 : " + max);
		System.out.println("가장 작은 값 : " + min);
	}

}
