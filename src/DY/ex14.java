package DY;
import java.util.Scanner;

public class ex14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int a = sc.nextInt();
		int[][] array = new int[a][a];
		
		for (int i =0;i<array.length;i++) {
			for (int j =0;j<array[i].length;j++) {
				array[j][i]=5*i+j+1; 
			}
		}
		
		for (int i =0;i<array.length;i++) {
			for (int j =0;j<array[i].length;j++) {
				System.out.print(array[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
