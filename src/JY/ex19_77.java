package JY;
public class ex19_77 {
	public static void main(String[] args) {
		int n= 77;
		int sum = 0;
		for (int i=1; i<=n; i++) {
			sum += i*(n-i+1);
		}
		System.out.println(sum);
	
	}
}
