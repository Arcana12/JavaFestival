package HJ;

import java.util.Scanner;

public class java30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력해줘 : ");
		int N = sc.nextInt();
		int[][] array= new int [N][N];// NN을 곱해주니
		for(int i=0;i<N;i++) {
			for(int j=0; j<N;j++) {
				if(i%2==0) { // 짝수이면 이렇게
					array[i][j]=(i*N+1)+(j);
					System.out.print(array[i][j]+"\t");
			}if(i%2==1) { // 홀수는 감소하니까 j가 올라갈수록 빼주고 i는 1과 3이니
				array[i][j]=N*(i+1)-j;
				System.out.print(array[i][j]+"\t");
			}
		}
			System.out.println();
	}

}
}
