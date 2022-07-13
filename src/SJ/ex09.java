package SJ;

public class ex09 {

	public static void main(String[] args) {
		//  정수가 나누어 지는지 판별
		int num1 = 10;
		int num2 =3;
		boolean result = isDivide(num1,num2);
		System.out.println("결과 확인 : "+result);
	}
	public static boolean isDivide(int n1, int n2){
		if(n1%n2==0) {
			return true;
		}
		else {
			return false;
		}
	}
}
