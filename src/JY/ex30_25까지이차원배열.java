import java.util.Scanner;

public class ex30_25까지이차원배열 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int a = sc.nextInt();
		int [][] arr= new int[a][a];
		int cnt = 1;
		
		for(int i=0; i<arr.length; i++) { //가로행
			for(int j=0; j<arr.length; j++) { //세로열
				System.out.print((arr[i][j]=cnt++)+"\t");
			}
			System.out.println();
		}
	}
}
