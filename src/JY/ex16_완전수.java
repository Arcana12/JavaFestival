
public class ex16_완전수 {
	public static void main(String[] args) {
		int startValue = 2;
		int endValue = 1000;
		
//		System.out.print(startValue+" ~ "+endValue+"까지의 완전수 : ");
		getPerfectNumber(startValue,endValue);
	}
	public static void getPerfectNumber(int a, int b) {
		
		int result;
		
		int sum=0;
		System.out.print(a+" ~ "+b+"까지의 완전수 : ");
		for (int i=a; i<=b; i++) { // a부터 b까지
			for(int j=1; j<=i; j++) {
				if(i%j==0) { // 약수구하기
					sum +=j;
				}
			}
			
			if (i==sum-i) {
				
				System.out.print(i+" ");
			}
			sum=0;
		}
		
	}
	
}
