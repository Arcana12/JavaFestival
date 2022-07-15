import java.util.Scanner;

public class ex24_소인수분해 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("소인수분해 할 수를 입력하세요 : ");
		 int n = sc.nextInt();
		 
		 System.out.print(n+" = ");
		 
		 for(int i=2; i<=n; i++) {
			 while (n%i==0) {
				 if(n==i) {
					 System.out.print(i);
					 n /=i;
				 }else {
					 System.out.print(i+"*");
					 n /=i;
				 }
			 }
		 }
	}//main end
}
