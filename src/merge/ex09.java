package merge;


public class ex09 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 3;
		boolean result = isDivide(num1, num2);
		System.out.println("결과 확인 : "+result);
	}
	
	static boolean isDivide(int a,int b) {
		if(a%b ==0) {
			return true;
		}
		return false;
	}
}
