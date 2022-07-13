
import java.util.Scanner;

public class ex05_최대공약수최소공배수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("최대 공약수 & 최소 공배수 구하기");
		
		System.out.print("숫자 1 입력 : ");
		int n1 = sc.nextInt();
		System.out.print("숫자 2 입력 : ");
		int n2 = sc.nextInt();
		
		int[] arr1 = null;
		int[] arr2 = null;
		int set = 1;
		int s = 1;
		
		int max = 0;
		int min = 0;
		
		System.out.print("n1의 약수 : ");
		for (int i=1; i<=n1; i++) {
			if (n1%i==0) {
				
				arr1 = new int[set];
				arr1[set-1] = i;
				System.out.print(arr1[set-1]+" ");
				set = set+1;
			}
		}System.out.println(set);
		System.out.println();
		System.out.print("n2의 약수 : ");
		for (int i=1; i<=n2; i++) {
			if (n2%i==0) {
				arr2 = new int[s];
				arr2[s-1] = i;
				System.out.print(arr2[s-1]+" ");
				s = s+1;
			}
		}System.out.println(s);
		
//		for (int i =0; i<set; i++) {
//			for (int j=0; j<s; j++) {
//				if(arr1[i]==arr2[j]) {
//					max=arr2[j];
//				}
//			}
//		}System.out.println("최대"+max);
//		
		
	
		
		
		
	}
}
