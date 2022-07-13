import java.util.Scanner;

public class ex10_1의자리반올림 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반올림 전 값 :");
		int i = sc.nextInt();
		
		if (i%10 >=5) {
			i +=10-(i%10);
		}else {
			i=i-(i%10);
		}
		System.out.print("반올림 후 값 :"+i);
	}
}
