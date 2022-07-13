

public class ex09_두정수의나눗셈 {
	public static void main(String[] args) {
		int a= 10;
		int b =3;
		boolean result = isDivide(a,b);
		System.out.println("결과 확인 : " + result);
	}
	
	public static boolean isDivide(int a, int b) {

		 return (a%b==0);
		}
	
	
	
	
}
