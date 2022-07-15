package DY;

import java.util.Random;

public class ex28 {
	public static void main(String[] args) {
		Random rd = new Random();
		int[] arr = new int[6];
		int i = 0;
//		int cnt = 0;
//		while (cnt!=6) {
//			int a =rd.nextInt(45)+1;
//			
//			
//			for (int j =0;j<i;j++) {
//				if(arr[j]==a) {
//					break;
//				}else {
//					arr[i]=a;
//					
//				}
//			}
//			cnt++;
//			i++;
//			System.out.println("행운의 숫자 : "+a);
			
			
			// 윤기
		for(int k = 0; k < arr.length; k++) {
			arr[k] = rd.nextInt(45) + 1;
			for(int j = 0; j < k; j++) {
				if(arr[j] == arr[k]) {
					k --;
				}
			}
		}
			
		for(int k = 0; k < arr.length; k++) {
			System.out.println(arr[k]+" ");
		}
	}
}

