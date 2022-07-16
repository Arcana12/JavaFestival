package SJ;

public class ex25_피보나치 {

	public static void main(String[] args) {
		// 피보나치
		int input = 8;
		for (int i = 1; i <= input; i++) {
			System.out.print(fibo(i) + " ");
		}
	}

	public static int fibo(int i) {
		int[] num = new int[i];
		int v = 0;
		for (int s = 0; s <= i - 1; s++) {
			if (s <= 1) {
				num[s] = 1;
				v = num[s];
			} else {
				num[s] = num[s - 1] + num[s - 2];
				v = num[s];
			}
		}
		return v;
	}
}
