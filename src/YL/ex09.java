package YL;

public class ex09 {

	public static void main(String[] args) {
		int num1 = 10;
        int num2 = 2;
        boolean result = isDivide(num1, num2);
        
        System.out.println("결과 확인 : " + result);
	}
    public static boolean isDivide(int num1, int num2) {
		
		if((double)num1/num2 == (int)num1/num2) {
			return true;
		}
		else {
			return false;
		}
    }



	}


