package DY;
import java.util.Scanner;

public class ex17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("사려는 상품갯수를 입력하세요 >> ");
		int a = sc.nextInt();
		int price = 10000;
		if (a>=11) {
			System.out.println("가격은 "+(int)(a*price*0.9)+"원 입니다.");
		}else {
			System.out.println("가격은 "+a*price+"원 입니다.");
		}
	}
}
