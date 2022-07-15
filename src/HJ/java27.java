package HJ;

import java.util.Scanner;

public class java27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int num=1;
		int[] array = new int[a];
		for(int i=0;i<a;i++) {
			System.out.print(num+"번째 입력 : ");
			num++;
			array[i]=sc.nextInt(); //배열 구해서 같이 넣어주기
		}
		for(int i=0;i<a;i++) {
			System.out.print(array[i]+" : "); //배열의 값이랑 해주기
			for(int j=0;j<array[i];j++) { //배열의 값으로 크기 해주고
				System.out.print("*"); //별자리만 넣어주면 알아서 크기 곱해줌
			}
			System.out.println();// 위 아래로
		}
	}

}
