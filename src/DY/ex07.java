package DY;
import java.util.Scanner;

public class ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("행 개수 : ");
		int a =sc.nextInt();
		
		for(int i = 0; i<a;i++) {
			for (int j=a-i;j>0;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
			
	}
}
