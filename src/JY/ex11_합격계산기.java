
import java.util.Scanner;

public class ex11_합격계산기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		int sum = 0;
		boolean t = true;
		
		// arr에 점수 저장
		System.out.print("1.소프트웨어 설계 : ");
		arr[0] = sc.nextInt();
		System.out.print("2.소프트웨어 개발 : ");
		arr[1] = sc.nextInt();
		System.out.print("3.데이터베이스 구축 : ");
		arr[2] = sc.nextInt();
		System.out.print("4.프로그래밍 언어 활용 : ");
		arr[3] = sc.nextInt();
		System.out.print("5.정보시스템 구축관리 : ");
		arr[4] = sc.nextInt();
		
		for (int i = 0; i<arr.length; i++) {
			if (arr[i]>=8) {
				t=true;
			}else {
				t=false;
				break; // 한개라도 7개이하이면 정지.
			}
			sum += arr[i]; // arr의 합
		}
		
		if (t==true && sum>=60) {
			System.out.println("합격입니다.");
		}else {
			System.out.println("불합격입니다.");
		}
			
		
		
		
	}
}
