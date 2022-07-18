package SJ;

public class ex16 {

	public static void main(String[] args) {
		// 완전수
		int startValue = 2;
		int endValues = 1000;
		getperfectNumber(startValue, endValues);

	}

	public static void getperfectNumber(int n1, int n2) {
		System.out.printf("%d~%d까지의 완전수 : ", n1, n2);
		for (int j = n1; j <= n2; j++) { // 먼저 약수 구함
			for (int i = 1; i <= n1; i++) {

				if (j % i == 0) {
					int sum = 0;
					sum += i;
					if (sum - j == j) { // 완전수는 약수의 합에서 자기자신을 뺀 수가 자기자신이랑 같을 경우이기 떄문에
						System.out.print(j + " ");
					}
				}
			}
		}
	}
}
