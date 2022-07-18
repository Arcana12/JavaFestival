package merge;

public class ex08 {
	public static void main(String[] args) {
		int[] point = { 93, 32, 52, 9, 81, 2, 68 };

		//짧은 거리의 점의 index를 저장하기 위함
		int index1 = 0;
		int index2 = 0;
		
		//두 점의 거리를 계산하기 위한 변수
		int reach = point[0];
		
		for (int i = 0; i < point.length - 1; i++) {
			for (int j = i + 1; j < point.length; j++) {
				int max = Math.max(point[i], point[j]);
				int min = Math.min(point[i], point[j]);
				//reach보다 짧을 경우 reach에 값을 저장
				if (max - min < reach) {
					index1 = i;
					index2 = j;
					reach = max - min;
				}
			}
		}
		System.out.println("result = ["+index1+", "+index2+"]");

	}
}
