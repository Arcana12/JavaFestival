package merge;

public class ex16 {
	public static void main(String[] args) {
		
		int startValue = 2;
		int endValue = 1000;
		
		getPerfectNumber(startValue, endValue);
		
	}
	//완전수는 자신을 제외한 약수를 더했을때 자기 자신이 되는 수를 의미
	static void getPerfectNumber(int svalue, int evalue) {
		//완전수를 구하기 위한 변수
		
		System.out.print("2~1000까지의 완전수 : ");
		int pnum = 0;
		for(int i=svalue;i<=evalue;i++) {
			for(int j=1; j<=i; j++) {
				if(i%j==0) {
					pnum+=j;
				}
			}
			if(i==(pnum-i)) {
				System.out.print((pnum-i)+ " ");
			}
			pnum = 0;
		}
	}
}
