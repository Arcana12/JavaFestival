package DI;

public class ex08 {
	public static void main(String[] args) {
		int[] point = { 93, 32, 52, 9, 81, 2, 68 };

		//짧은 거리의 점의 index를 저장하기 위함
		int index1 = 0;
		int index2 = 0;
		
		//두 점의 거리를 계산하기 위한 변수
		int tmp1 = point[0];
		int tmp2 = point[1];
		int reach = point[0];
		
		for (int i = 0; i < point.length - 1; i++) {
			for (int j = i + 1; j < point.length; j++) {
				
				if (point[i] < point[j]) {
					tmp2 = point[i];
					tmp1 = point[j];
				}
				else {
					tmp1 = point[i];
					tmp2 = point[j];
				}
				//reach보다 짧을 경우 reach에 값을 저장
				if (tmp1 - tmp2 < reach) {
					index1 = i;
					index2 = j;
					reach = tmp1 - tmp2;
				}

			}
		}
		System.out.println("result = ["+index1+", "+index2+"]");

	}
}
