import java.util.Scanner;

public class ex20_배열총점평균 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[3];
		int sum = 0;
		
		System.out.print("Java 점수 : ");
		arr[0] = sc.nextInt();
		System.out.print("Web 점수 : ");
		arr[1] = sc.nextInt();
		System.out.print("And 점수 : ");
		arr[2] = sc.nextInt();
		
		for (int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("Java : "+arr[0]);
		System.out.println("Web : "+arr[1]);
		System.out.println("and : "+arr[2]);
		System.out.println("Sum : "+sum);
		System.out.println("Avg : "+sum/arr.length);
		
		
	}//main end
}
