package DY;
import java.util.Scanner;

public class ex21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("구하고 싶은 약수를 입력하시오 : ");
		int a = sc.nextInt();
		
		System.out.print(a+"의 약수는 : ");
		for(int i =1;i<=a;i++) {
			if(a%i==0) {
				System.out.print(i+" ");
			}
		}
	}
}
