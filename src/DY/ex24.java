package DY;
import java.util.Scanner;

public class ex24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("소인수분해 할 수를 입력하세요. : ");
		int a = sc.nextInt();
		
		System.out.print(a+" = ");
//		while (a!=1) {
//			for(int i =2;i<=a;i++) {
//				if(a==i) {
//					System.out.println(i);
//					a=a/i;
//				}	
//				else if(a%i==0) {
//					System.out.print(i+"*");
//					a=a/i;
//					break;
//				}
//			}
//		}
		
		while(a != 1) {
			for(int i = 2; i <= a; i++) {
				if(a % i == 0) {
					System.out.print(i);
					if(a != i) {
						System.out.print(" * ");
					}
					a = a / i;
					break;
				}
			}
		}
	}
}

