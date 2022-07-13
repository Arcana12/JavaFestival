
public class ex12_1부터100까지 {
	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i =1; i<=100; i++) {
			
			if(i%2==0) {
				System.out.print(-i+" ");
				sum += -i;
			}else {
				System.out.print(i+ " ");
				sum += i;
			}
		}//end for
		System.out.println();
		System.out.println("결과 : "+sum);
		
		
}}
