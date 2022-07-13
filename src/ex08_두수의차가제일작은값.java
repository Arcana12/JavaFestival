
public class ex08_두수의차가제일작은값 {
	public static void main(String[] args) {
		int[] point = {92,32,52,9,8,2,68};
	
		
//		for (int i=0; i<point.length; i++) {  //sort
//			for (int j=i+1; j<point.length; j++) {
//				if(point[i]>point[j]) {
//					int n;
//					n = point[i];
//					point[i]=point[j];
//					point[j]=n;
//				}
//			}
//		}
//		for(int a : point) {
//			System.out.print(a+" ");
//		}
//		System.out.println();
		
		int n=0;
		
		for(int i=point.length-1; i>=1; i--) { //arr의 뒤부터 호출
			for(int j=point.length-2; j>=0; j--) {
				if(0<point[i]-point[j]) {
					n = point[i]-point[j];
					System.out.println(point[i]+" - "+point[j]+" = "+n);
				}
			}
		}
		
		
		
		
	}
}
