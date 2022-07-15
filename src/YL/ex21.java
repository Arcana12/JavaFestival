package YL;

import java.util.Scanner;

public class ex21 {

	public static void main(String[] args) {
		Scanner strin = new Scanner(System.in);
		System.out.print("구하고 싶은 약수를 입력하시오 : ");
		int x = strin.nextInt();
		System.out.print(x + "의 약수는: ");
		for (int i = 1; i <= x; i++){
		if (x%i == 0)
		System.out.print(i+ " ");
		}


	}

}
