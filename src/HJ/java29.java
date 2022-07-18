package HJ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class java29 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("숫자입력>>");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();//ArrayList는 클래스 Integer은 정수형, String은 문자열
		while(a!=0) {
			list.add(a%2);
			a/=2;
		}
		Collections.reverse(list); //리스트의 뒤집기라서
		for(int i=0;i<list.size();i++) { //list는 length가 안되니 size()로 길이를 구함
			System.out.print(list.get(i)+" "); //index를 구할수있음
		}
	}
}
