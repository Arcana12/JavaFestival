package YL;

public class ex16 {

	public static void main(String[] args) {
			int startValue =2;
			int endValue = 1000;

			getPerfectNumber(startValue, endValue);		
				}
			public static void getPerfectNumber(int startValue, int endValue) {
					int i = 1;
					int sum = 0;
					String perfect = "";
					for (i = startValue; i < endValue; i++) {
						sum=0;
						for (int j = 1; j <= i; j++) {
							if(i%j==0) {
								sum+=j;
			}
						}
						if(2*i == sum) {
							perfect += i+ " ";
						}
					}
					System.out.println(startValue + "~" + endValue+"까지의 완전수 : " + perfect);


	}

}
