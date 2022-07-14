package DY;

import java.util.Scanner;

public class ex26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n 입력 : ");
		int  a = sc.nextInt();
		int num1= 1;
		int num2 = 0;
		int cnt =0;
		while(cnt!=a) {
			System.out.print(num1+" ");
			num2++;
			num1+=num2;
			cnt++;
		}
	}
}
