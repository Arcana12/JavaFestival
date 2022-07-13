import java.util.Scanner;

public class ex17_마트계산대 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("사려는 상품의 개수를 입력하세요 >> ");
		int n = sc.nextInt();

		// 선물세트 가격 : 만원
		// 11개 이상 구매시 10% 할인, 10개까지 기본가
		// 10개단위로 구매시 5% 추가 할인	
		
		double d = 1.0; //할인율
		
		if (n>=11) { //11개 이상일때 10퍼 할인
			d -= 0.1; //90퍼센트가격
		}
		if (n%10==0) { //10개 단위일때 5퍼할인
			d -= 0.05; //95퍼 가격
		}
		
		System.out.println("가격은 "+(int)((n*10000)*d)+"원 입니다.");
		
	}
}
