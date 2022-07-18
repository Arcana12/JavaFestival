package DI;

import java.util.Random;

public class ex28 {
	public static void main(String[] args) {
		Random r = new Random();
		//중복값 확인을 위한 인덱스넘버
		int index = 0;
		int[] arr = new int[6];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = r.nextInt(45)+1;
		
			//중복값 확인을 위한 while문
			while(index<i) {
				//중복값 발견시 새로운 랜덤값을 넣고
				//처음부터 다시 중복값 체크하기 위하여 index값 초기화
				if(arr[i]==arr[index]) {
					arr[i] = r.nextInt(45)+1;
					//새로 받은 값의 중복체크를 위하여 index초기화
					index = 0;
				}
				
				else {
					index++;
				}
			}
			//index 초기화
			index = 0;
		}
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println("행운의 숫자 : "+arr[i]);
		}
	}
}
