package JY;


public class ex25_피보나치수열 {
	public static void main(String[] args) {
		int input = 8;
		
		for (int i =0; i<input; i++) {
			System.out.print(fibo(i)+" ");
		}
	}
	
	public static int fibo(int i) {
		int a =0;
		int b =1;
		int c;
		int v = 1;
		
		int n =1;
		while (n<=i ) {
			n++;//i가 될때까지
			
			c=a+b;
			v=c; //return값 저장
			//위치바꿔주기
			a=b;
			b=c;
		}
		
		return v;
	}
}
