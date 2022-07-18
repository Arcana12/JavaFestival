package YL;

public class ex25 {

	public static void main(String[] args) {
		int input = 8;
		for (int i = 1; i <= input; i++) {
			System.out.println(fibo(i) + " ");
		}
	}

	public static int fibo(int i) {
		int num1 = 0;
		int num2 = 1;
		int sum = 1;
		for (int j = 1; j < i; j++) {
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
		}
		return sum;
	}
}
