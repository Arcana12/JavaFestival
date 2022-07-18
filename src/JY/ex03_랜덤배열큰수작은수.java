package JY;

import java.util.Random;

public class ex03_랜덤배열큰수작은수 {
	public static void main(String[] args) {
		Random ran = new Random();
		int[] arr = new int[8];
		System.out.print("배열에 있는 모든 값: ");
		
		for (int i = 0; i < arr.length; i++) { //arr에 random값 넣기
			int Rn = ran.nextInt(98)+1;
			arr[i] = Rn;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) { //random값이 들어간 배열출력
			System.out.print(arr[i] + " ");
		}
		int max = arr[0];
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			} else if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println();
		System.out.println("가장 큰 값:" + max);
		System.out.println("가장 작은 값:" + min);
	}
}
