package DI;

public class ex16 {
	public static void main(String[] args) {
		
		int startValue = 2;
		int endValue = 1000;
		
		getPerfectNumber(startValue, endValue);
		
	}
	
	
	//완전수는 자신을 제외한 약수를 더했을때 자기 자신이 되는 수를 의미
	static void getPerfectNumber(int svalue, int evalue) {
		//완전수를 구하기 위한 변수
		
		System.out.println("2~1000까지의 완전수 : ");
		int pnum = 0;
		//startValue부터 endValue까지 반복
		for(int i=svalue;i<=evalue;i++) {
			//정수 i의 완전수를 구하기 위함
			for(int j=1; j<=i; j++) {
				if(i%j==0) {
					pnum+=j;
				}
			}
			//i는 i를 제외한 i의 약수를 더했을때 i가 되는 수(완전수)일 때 출력
			if(i==(pnum-i)) {
				System.out.print((pnum-i)+ " ");
			}
			
			//for문을 마치고 증가된 i의 완전수를 구하기 위해 pnum을 초기화
			//초기화 하지 않으면 pnum의 값이 계속 증가
			pnum = 0;
		}
	}
}
