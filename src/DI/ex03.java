package DI;

import java.util.Random;

public class ex03 {
	public static void main(String[] args) {
		Random r = new Random();
		//8칸 크기의 배열 선언
		int[] arr = new int[8];
		System.out.print("배열에 있는 모든 값 : ");
		//랜덤수로 초기화
		for(int i=0; i<arr.length;i++) {
			arr[i] = r.nextInt(98)+1;   //nextInt는 범위가0부터 ()안의 값까지 이기때문에 +1을 하여 1~99까지로 변경
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int max = arr[1];
		int min = arr[1];
		for(int i =0; i<arr.length-1;i++) {
			//최대값보다 arr[i]의 값이 크면 max에 값을 넣는다
			if(max<arr[i]) {
				max = arr[i];
			}
			//최소값보다 arr[i]의 값이 크면 min에 값을 넣는다
			if(min>arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("가장 큰 값 : "+max);
		System.out.println("가장 작은 값 : "+min);
	}
}
