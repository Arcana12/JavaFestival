package DY;
import java.util.Random;

public class ex03 {

	public static void main(String[] args) {
		Random rd = new Random();
        int[] array = new int[8];
        for (int i = 0; i<array.length;i++){
            array[i]=rd.nextInt(99)+1;
        }
        System.out.print("배열에 있는 모든 값 : ");
        int max = 0;
        int min = 100;
        for (int i : array){
            System.out.print(i+" ");
            if(i>max){
                max = i;
            }
            if(i<min){
                min = i;
            }
        }
        
        System.out.println();
        System.out.println("가장 큰 값 : "+max);
        System.out.println("가장 작은 값 : "+min);

	}

}
