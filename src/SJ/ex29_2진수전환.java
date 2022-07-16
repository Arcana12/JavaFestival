package SJ;

import java.util.Scanner;

public class ex29_2진수전환 {

	public static void main(String[] args) {
		// 10진수 정수를 입력받아 2진수로 변환해서 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력>>");
		int input = sc.nextInt();
		int[] binery=new int[10];   //이진수 담을 배열
		int i =0;    //인덱스 몇까지 저장되는지 알기 위해서
		while(input>=1) {          //나누는 몫이 1이 될때 까지
			binery[i]=input%2;     //나머지를 배열에 저장
			i++;
			input/=2;
		}
		for(int s=i-1;s>=0;s--) {         // 십진수를 2로 나눈 나머지를 뒤에서부터 나열해야 2진수가 되므로
		System.out.print(binery[s]+" ");
		}
	}
}
