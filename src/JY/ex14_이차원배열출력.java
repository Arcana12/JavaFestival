import java.util.Scanner;

public class ex14_이차원배열출력 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [][] arr= new int[5][5];
		int cnt = 1;
		
		for(int i=0; i<arr.length; i++) { //가로행
			for(int j=0; j<arr.length; j++) { //세로열
				System.out.print((arr[j][i]=cnt++)+"\t");
			}
			System.out.println();
		}
	}//main end
}
