package JY;

import java.util.Scanner;

public class ex23_팩토리얼 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("입력 : ");
		 int n = sc.nextInt();
		 
		 int p = 1;//save
		 for(int i=1; i<=n; i++) {
			 p *=i;
		 }
		 System.out.print("출력 : "+p);
		 
		 
	}//main end
}
