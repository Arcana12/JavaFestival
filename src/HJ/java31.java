package HJ;

public class java31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=50;
		int num2 = 15;
		char op = '-';
		System.out.println(cal(num1,num2,op));
	}
	public static int cal(int num1, int num2, char op) { //cal에 int 안잡아주면 소수점으로 길어지니
		if(op=='+') {
			return num1+num2; //결과값은 return으로 
		}else if(op=='-'){
			return num1-num2;	
		}else if(op=='*'){
			return num1*num2;
		}else if(op=='/'){
			return num1/num2;
		}else { // 모르는것은 0을지정
			return 0;
		}
	}

}
