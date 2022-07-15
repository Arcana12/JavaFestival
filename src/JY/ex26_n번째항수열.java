import java.util.Scanner;

public class ex26_n번째항수열 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("n 입력 : ");
		int n = sc.nextInt();
		
		int s = 1;
		for (int i =1; i<=n; i++) {
			System.out.print(s+" ");
			s = s+i;
		}
	}
}
