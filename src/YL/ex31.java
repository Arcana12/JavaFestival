package YL;

public class ex31 {

	public static void main(String[] args) {
		int num1 = 50; 
		int num2 = 15;
		char op = '-';

		System.out.println(cal(num1, num2, op));
		}
		public static int cal(int a, int b, char op){
		int result = 0;
		switch(op) {
		case '+' :
		result = a+b;
		break;
		case '-':
		result = a-b;
		break;
		case '*':
		result = a*b;
		break;
		case '/':
		result = a/b;
		break;
		}
		return result;
		}

	}


