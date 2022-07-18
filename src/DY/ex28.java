package DY;

import java.util.Random;

public class ex28 {
	public static void main(String[] args) {
		Random rd = new Random();
		int[] arr = new int[6];
	
		for(int k = 0; k < arr.length; k++) {
			arr[k] = rd.nextInt(45) + 1;
			for(int j = 0; j < k; j++) {
				if(arr[j] == arr[k]) {
					k --;
				}
			}
		}
			
		for(int k = 0; k < arr.length; k++) {
			System.out.println("행운의숫자 : "+arr[k]);
		}
	}
}

