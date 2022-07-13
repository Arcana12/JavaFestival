
import java.util.Random;

public class ex03_랜덤배열큰수작은수 {
	public static void main(String[] args) {
		int[] arr = new int[8];
		Random rd = new Random();
		
		int max = 0;
		int min = 100;
		
		System.out.print("배열에 있는 모든 값 : ");
		for (int i=0; i<arr.length; i++) {
			arr[i] = rd.nextInt(99)+1;
			System.out.print(arr[i]+ " ");
			//큰값과 작은값 구하기위한 if
			if(arr[i]>max) { //저장된 max와 i값을 비교
				max=arr[i]; // max보다 클경우에만 저장
			}else if(arr[i]<min){
				min=arr[i];
			}
		}
		System.out.println();
		System.out.println("가장 큰 값 : "+max);
		System.out.println("가장 작은 값 : "+min);
		
	}
}
