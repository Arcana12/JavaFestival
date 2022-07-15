package DI;

public class ex25 {
	public static void main(String[] args) {
		int input = 8;
		
		for(int i=1; i<=input; i++) {
			System.out.print(fibo(i)+" ");
		}
	}
	static int fibo(int i) {
		int[] arr = new int[i];
		
		for(int j =0; j<i;j++) {
			if(j<2) {
				arr[j] = 1;
			}
			else {
				arr[j] = arr[j-2]+arr[j-1];
			}
		}
		int result = arr[i-1];
		return result;
	}
}
