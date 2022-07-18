package JY;

import java.util.Scanner;

public class ex22_while {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.print("현재 몸무게 : ");
	 int now = sc.nextInt();
	 System.out.print("목표 몸무게 : ");
	 int trg = sc.nextInt();

	 int i = 0; //주차

	 while (now>trg) { //현재 몸무게가 목표 몸무게보다 큰경
	 	i++;
	 	System.out.print(i + "주차 감량한 몸무게 : ");
	 	int minus = sc.nextInt(); //감량한 무게
	 	now = now-minus; //현재무게-감량한무게
	 }
	 System.out.println("축하합니다! "+i+"주차 " + now + "kg 달성!");
}
}
