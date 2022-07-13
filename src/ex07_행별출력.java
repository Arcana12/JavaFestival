import java.util.Scanner;

public class ex07_행별출력 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행 개수 : ");
		int i = sc.nextInt();
		
		for (int j=i; j>0; j-- ) { //줄수
			for (int k=j; k>0; k--) { //별카운트
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}
}
