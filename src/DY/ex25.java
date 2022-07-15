package DY;

public class ex25 {
	public static void main(String[] args) {
		int input =8;
		
//		for(int i = 1; i <= input; i++) {
//			System.out.print(fibo(i) + " ");
//		}
		
		for(int i = 1; i <= input; i++) {
			System.out.print(factorial(i) + " ");
		}
		
	}
	public static int fibo(int input) {
		if(input == 1 || input == 2) {
			return 1;
		}
		
		return fibo(input - 1) + fibo(input - 2);
	}
	
	public static int factorial(int n) {
		if(n == 1) return 1;
		
		return n * factorial(n-1);
	}
}
