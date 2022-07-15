package DY;
import java.util.Scanner;

public class ex20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] score = new int[3];
		System.out.print("java 점수 : ");
		score[0]=sc.nextInt();
		System.out.print("web 점수 : ");
		score[1]=sc.nextInt();
		System.out.print("and 점수 : ");
		score[2]=sc.nextInt();
		
		System.out.println("java : "+score[0]);
		System.out.println("web : "+score[1]);
		System.out.println("and : "+score[2]);
		int sum = 0;
		for (int i:score) {
			sum+=i;
		}
		System.out.println("sum : "+sum);
		System.out.println("avg : "+sum/score.length);
		
	}
}
