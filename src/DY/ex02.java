package DY;
import java.util.Scanner;

public class ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("년도 입력 : ");
        int a = sc.nextInt();
        if((a%4==0&&a%100!=0)||a%400==0){
            System.out.print("윤년");
            
        }else  System.out.print("윤년아님");
	}
}
