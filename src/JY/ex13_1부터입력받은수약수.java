package JY;
import java.util.Scanner;

public class ex13_1부터입력받은수약수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("구하고 싶은 약수를 입력하시오 : ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) { // 1부터 입력받은 수까지 
			System.out.print(i+" : ");
			for (int j=1; j<=i; j++) { //약수를 구하기위해 1부터 i까지
				if (i%j==0) { // 나머지가 0일때
					System.out.print(j+" ");
				}
			}System.out.println();
		}
		
		
		
		
	}//main end
}
