package DY;

public class ex31 {
	public static void main(String[] args) {
		int num1 = 50;
		int num2 = 15;
		char op='-';
		
		
		System.out.println(cal(num1,num2,op));
	}
	public static int cal(int num1,int num2,char op) {
		int rs = 0;
		if (op=='-') {
			rs= num1-num2;
		}else if (op=='+'){
			rs= num1+num2;
		}else if (op=='/') {
			rs= num1/num2;
		}else if (op=='*') {
			rs= num1*num2;
		}
		return rs;
		
	}
}
