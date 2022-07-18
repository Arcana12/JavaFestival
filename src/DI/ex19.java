package DI;

public class ex19 {
	public static void main(String[] args) {
		
		int j=77;
		int k=1;
		
		//두 수를 곱한 값을 저장하기 위한 변수
		int sum = 0;
		for(int i=0; i<77;i++) {
			sum += j*k;
			j--;
			k++;
		}
		System.out.println(sum);
	}
}
