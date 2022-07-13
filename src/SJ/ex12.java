package SJ;

public class ex12 {

	public static void main(String[] args) {
		// 합 계산
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.print(i * -1+" ");
				sum -= i;  
			} else {
				System.out.print(i+" ");
				sum += i;
			}
		}
		System.out.println();
		System.out.println("결과 : "+sum);
	}

}
