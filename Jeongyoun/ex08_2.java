
public class ex08_2 {
	public static void main(String[] args) {
		
		int[] point = {92,32,52,9,81,2,68};
		
		int n=92;
		int a=0;
		int b=0;
		
		for(int i=0; i<point.length-1; i++) { //배열의 끝번~2번까지
			for(int j=i+1; j<point.length; j++) { //배열의 끝번-1 ~1번까지
				if(0<point[i]-point[j]) { //양수일경우
					if (n > point[i]-point[j]) {//가장 큰수보다 차값이 작을때
						n = point[i]-point[j]; // 차를 저장
						a=i;
						b=j; // 계속돌면 가장 작은 차가 저장이됨. 그때의 배열번호 저장
					} 
					
				}else { //음수일때
					if (n > (point[i]-point[j])*-1) { //음수에 -1을 곱해 양수로 만들어줌
						n = (point[i]-point[j])*-1;
						a=i;
						b=j;
					}
				}
				
			}
		}
		System.out.println("result = "+a+" , "+b);
		
		
	}
}
