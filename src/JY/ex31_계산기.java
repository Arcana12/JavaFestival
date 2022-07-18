package JY;


public class ex31_계산기 {
	public static void main(String[] args) {
		int num1 =50;
		int num2 =15;
		char op = '+';
		
		System.out.println(cal(num1,num2,op));
	}
	public static int cal(int a,int b, char c) {
		int r=0;
		
		if (c=='+') {
			r=a+b;
		}
		else if (c=='-') {
			r=a-b;
		}else if (c=='/') {
			r=a/b;
		}else if (c=='*') {
			r=a*b;
		}
		return r;
	}
}
