package JY;
public class 몰루 {
	public static void main(String[] args) {
		
		int a=2;
		int b=30;
		
		int sum=0;
		
		for (int i=a; i<=b; i++) { // a부터 b까지
			for(int j=1; j<=i; j++) {
				if(i%j==0) { // 약수구하기
					sum +=j;
				}
			}
			
			if (i==sum-i) {
				System.out.println("완전수 : "+i);
			}
			sum=0;
		}
	}
}
