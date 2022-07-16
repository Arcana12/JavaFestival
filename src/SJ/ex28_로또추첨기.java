package SJ;

import java.util.Random;

public class ex28_로또추첨기 {

	public static void main(String[] args) {
		// 중복없이 랜덤 숫자 6개 45까지
		Random rd = new Random();
		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {     //6개 랜덤값
			lotto[i] = rd.nextInt(44) + 1;       //1부터 45까지 범위로 잡기위해   
			for (int j = 0; j < i; j++) {    //만들어진 램덤값 전의 수들을 하나씩 대조해서 같은거 찾고   
				if (lotto[i] == lotto[j]) { 
					i--;                      //같은게 있다면 그 숫자를 다시 뽑기위해 전 단계로 돌아감
				}
			}
		}
		for (int i = 0; i < lotto.length; i++) {
			System.out.println("행운의숫자 : " + lotto[i]);
		}
	}
}
