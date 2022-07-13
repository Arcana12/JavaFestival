import java.util.Scanner;

public class ex06_8자리정수의합 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int i = sc.nextInt();
		int sum = 0;
		while(i>0) {
			sum += i%10;
			i= i/10;
		}
		System.out.println("합은 "+sum+"입니다.");
	}
}
