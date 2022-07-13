package SJ;

public class ex08 {

	public static void main(String[] args) {
		// 가장 짧은 점 출력
		int min = 100000;
		int[] point = { 92, 32, 52, 9, 81, 2, 68 };
		int[] result = new int[2];

		for (int i = 0; i < point.length - 1; i++) {   //앞에 숫자랑 그 뒤에 숫자들이랑 다 비교해서 두수의 차가 작은것 찾기
			for (int j = i+1; j < point.length; j++) {
				if (point[i] - point[j] >0) {    //두수의 차가 양수면 그대로 비교
					if(point[i] - point[j] <min) {     
					result[0] = i;
					result[1] = j;
					min=point[i] - point[j];
					}
				}else {
					if((point[i] - point[j])*-1 <min) {   //두수의 차가 음수이면 -1를 곱해줘서 양수로 만들고 비교
						result[0] = i;
						result[1] = j;
						min=(point[i] - point[j])*-1;
						}
				}
			}
		}
		System.out.printf("result = [%d, %d]",result[0],result[1]);
	}

}
