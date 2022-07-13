import java.util.Scanner;

public class ex15_잔돈반환 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재금액 : ");
		int m = sc.nextInt();
		
		System.out.println("===== 잔돈 반환 =====");
		
		// ========== 그리디 알고리즘
		int[] arr = {10000,5000,1000,500,100};
		int result = 0; //잔돈 갯수
		
		for (int i : arr) { // arr 0 번부터 차례로 계산
			result = m/i; //잔돈갯수 = 현재금액 / arr[i]
			m -= i * result; // 현재금액 - 지불한잔돈  
			System.out.println(i + "원 : " + result + "개");
		}
		
	}//main end
}
