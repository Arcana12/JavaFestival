package HJ;

public class java16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int startValue=2;
		int endValue=1000;
		getPerfectNumber(startValue, endValue);
	}
	public static void getPerfectNumber(int a, int b) { //a와 b는 줄여서 씀
		System.out.printf("%s~%s까지의 완전수 : ",a,b); //문자열 포멧팅 이용한 출력작성
		for(int i=a;i<=b;i++) { //2부터 1000까지
			int sum=0; 
			for(int j=1;j<i;j++) {//1부터 자신의 1칸전까지 완전수
				if(i%j==0) { //나누어 줄때 0이되는 것중에 자기자신 빼고 다 더해줌
					sum+=j;
				}
			}
			if(sum==i) { //i의 전체와 sum의 합계가 같아지면 정답임
				System.out.print(i+" ");
			}
		}
		
		
	}

}
