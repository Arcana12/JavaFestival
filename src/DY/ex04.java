package DY;
import java.util.Scanner;

public class ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 숫자 입력 >> ");
        int a = sc.nextInt();
        System.out.print("두 번째 숫자 입력 >> ");
        int b = sc.nextInt();
        System.out.println(a*(b%10));
        System.out.println(a*((b%100)/10));
        System.out.println(a*(b/100));
        System.out.println(a*b);

	}
}
