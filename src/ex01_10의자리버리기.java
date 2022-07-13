import java.util.Scanner;

public class ex01_10의자리버리기 {
	public static void main(String[] args) {
		//정수를 입력받아 십의자리 이하를 버리는 코드를 작성하시오
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		if (num>=100) {
			num = (num/100)*100;
			System.out.println("결과 : "+ num);
		}
	}
}
