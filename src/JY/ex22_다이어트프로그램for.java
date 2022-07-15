import java.util.Scanner;

public class ex22_다이어트프로그램for {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===== 다이어트 프로그램 =====");
		System.out.print("현재 몸무게를 입력하시오 : ");
		int n = sc.nextInt();
		System.out.print("목표 몸무게를 입력하시오 : ");
		int g = sc.nextInt();
		
		
		for (int i=1; n>=g; i++) {
			System.out.print(i+"주차 감량 몸무게 입력 : ");
			int w = sc.nextInt();
			n -=w;
			if (n<=g) {
				System.out.println(i+"주차 다이어트 성공!");
			}
		}
		
		
		
	}//main end
}
