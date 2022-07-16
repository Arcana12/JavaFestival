package SJ;

public class ex19_77곱하기 {

	public static void main(String[] args) {
		// (77*1)+(77*2)+(77*3)+...+(1*77) 값
		int sum = 0;
		for (int i = 1; i <= 77; i++) {
			sum += ((77 - i + 1) * i);
		}
		System.out.println(sum);
	}
}
