package YL;

public class ex08 {

	public static void main(String[] args) {
		int[] point = {92,32,52,9,81,2,68};
		int result = 0;
		int a = point[0] - point[1];
		int first = 0;
		int second = 0;
		for(int i=0; i<6; i++) {
			for(int j=0; j<7; j++) {
				if(i!=j) {
					if(point[i]<point[j]) {
						result = point[j] - point[i];
						if(a > result) {
							a = result;
							first = i;
							second = j;
						}
					}else {
						result = point[i] - point[j];
						if(a > result) {
							a = result;
							first = i;
							second = j;
						}
					}
				}
				
			}
		}
		System.out.println("result = "+first+" "+second);

	}

}
