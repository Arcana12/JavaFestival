package DY;
import java.util.Scanner;

public class ex23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int a = sc.nextInt();
		int result = 1;
		for(int i=1;i<=a;i++) {
			result *=i;
		}
		System.out.println("출력 : "+result);
	}
}
