package HJ;

public class java25 {

	public static void main(String[] args) {
		int input = 8;
		for(int i=1; i<=input;i++) {
			System.out.print(fibo(i)+" ");
		} 
	}
	public static int fibo(int n) { //n은 i랑 답이 이어짐
		if(n==1 || n==2) { // 1이나 2는 어차피 1이니 or으로
			return 1;
		}else { //3번부터는 앞의 두수를 더해주면 답이 나오니
			return fibo(n-1)+fibo(n-2);
		}
	}
}