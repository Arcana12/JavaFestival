package HJ;

public class java12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		for(int i=1; i<=100;i++) {
			if(i%2!=0) {
				System.out.print(i+" ");
				num+=i;
			}else {
				System.out.print((i*-1)+" ");
				num+=(-i);
			}
		}
		System.out.println();
		System.out.println("결과 : "+ num);
	}
}
