package DY;
public class ex08 {
	public static void main(String[] args) {
		int [] point = {92,32,52,9,81,2,68};
		int a = 0;
		int b = 100;
		int[] result = {0, 1};
		for (int i =0; i <point.length - 1;i++) {
			for(int j=i+1;j<point.length;j++) {
				a=point[i]-point[j];
				if (a<0) a = -a;
				if (a<b) {
					b= a;
					result[0] = i;
					result[1] = j;
				}
				
			}
		}
		System.out.println("result = ["+result[0]+", "+result[1]+"]");
	}
}
