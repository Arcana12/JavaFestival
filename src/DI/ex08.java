package DI;

public class ex08 {
	public static void main(String[] args) {
		int[] point = { 93, 32, 52, 9, 81, 2, 68 };

		int index1 = 0;
		int index2 = 0;
		int tmp1 = point[0];
		int tmp2 = point[1];
		int reach = point[0];
		for (int i = 0; i < point.length - 1; i++) {
			for (int j = i + 1; j < point.length; j++) {
				if (point[i] < point[j]) {
					tmp2 = point[i];
					tmp1 = point[j];
				}
				else {
					tmp1 = point[i];
					tmp2 = point[j];
				}
				if (tmp1 - tmp2 < reach) {
					index1 = i;
					index2 = j;
					reach = tmp1 - tmp2;
				}

			}
		}
		System.out.println("result = ["+index1+", "+index2+"]");

	}
}
