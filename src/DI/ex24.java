package DI;

import java.util.Scanner;

public class ex24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("소인수분해 할 수를 입력하세요. : ");
		int input = sc.nextInt();
		int n = 0;
		System.out.print(input+" = ");
		for(int i=2;i<=input;i++) {
			while(true) {
				if(input%i==0) {
					input = input/i;
					if(input == 1) {
						System.out.print(i);
					}else {
						System.out.print(i + "*");
					}
				}
				else {
					break;
				}
			}
			
		}
	}
}
