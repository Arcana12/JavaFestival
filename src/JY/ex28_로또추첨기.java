package JY;

import java.util.Random;
import java.util.Scanner;

public class ex28_로또추첨기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int[] lotto = new int[6];
		
		for(int i=0; i<lotto.length; i++) {
			
			lotto[i] = rd.nextInt(45)+1;
			//중복번호 제거
			for (int k=0; k<i; k++) { 
				if(lotto[i]==lotto[k]) { //i번째 뽑은 숫자가 i-1와 같을때
					i--; //i-1 다시뽑게하기
				}
			}
		}
		for (int n : lotto) {
			System.out.println("행운의 숫자 : "+n);
		}
		
		
	}//main end
}
