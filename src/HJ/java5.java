package HJ;
import java.util.Scanner;
public class java5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("최대 공약수&최소 공배수 구하기");
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자1입력>> ");
		int a=sc.nextInt();
		System.out.print("숫자2입력>> ");
		int b=sc.nextInt();
		int mini=a<b?a:b;
		int gcd=0;
		for(int i=1; i<=mini;i++) {
			if(a%i==0 && b%i==0) {
				gcd=i;
			}
		}
		System.out.println("최대공약수 : "+gcd);
		System.out.println("최소공배수 : "+(a*b/gcd));
		
	}

}
