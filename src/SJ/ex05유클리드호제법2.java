package SJ;

import java.util.Scanner;

public class ex05유클리드호제법2 {
public static void main(String[] args) {
	//호제법이란 두 수가 서로 상대방 수를 나누어서 결국 원하는 수를 얻는 알고리즘을 나타낸다. 
	//2개의 자연수 a, b에 대해서 a를 b로 나눈 나머지를 r이라 하면(단, a>b) 
	//a와 b의 최대공약수는 b와 r의 최대공약수와 같다. 
	//이 성질에 따라, b를 r로 나눈 나머지 r'를 구하고, 다시 r을 r'로 나눈 나머지를 구하는 과정을 반복하여 
	//나머지가 0이 되었을 때 *나누는 수*가 a와 b의 최대공약수이다.
	
	// 선생님이 위에 내용 이해 안되면 그냥 외우라고 하셨어요!
	Scanner sc = new Scanner(System.in);
	System.out.println("최대 공약수&최소 공배수 구하기");
	System.out.print("숫자1입력>> ");
	int n1 = sc.nextInt();
	System.out.print("숫자2입력>> ");
	int n2 = sc.nextInt();
	int a = n1;
	int b=n2;
	int tmp;  //나머지값 저장소
	if(n1>n2) {  //큰수에서 작은수를 나눠야 하기 때문에 큰수 찾기
		while(n2!=0) {  //n2가 나머지 값으로 계속 업데이트 되는 수인데 나머지가 0일때 까지 계속 나누는 거니까 n2가 0이 아닐때까지 계속 반복
			tmp = n1%n2;
			n1=n2;
			n2=tmp;
		}
		System.out.println("최대공약수: " + n1);
		System.out.println("최소공배수: " + (a*b)/n1);
	}
	else{   
		while (n1!= 0) {
			tmp = n2 % n1;
			n2 = n1;
			n1 =tmp;
		}
		System.out.println("최대공약수: " + n2);
		System.out.println("최소공배수: " + (a*b)/n2);
	}		
  }
}
