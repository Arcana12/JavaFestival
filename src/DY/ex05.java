package DY;
import java.util.Scanner;

public class ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("최대공약수&최소 공배수 구하기");
        System.out.print("숫자1 입력 >> ");
        int a = sc.nextInt();
        System.out.print("숫자2 입력 >> ");
        int b = sc.nextInt();
        
        int result1=0;
        int result2=0;
        
        for (int i = a; i>=1;i--){
            if(a%i==0&&b%i==0){
                result1 = i;
                break;
            }
        }
        for(int i=1; a*i<=a*b;i++){
            if(a*i%a==0 && a*i%b==0){
                result2 = a*i;
                break;
            }
        }
        System.out.println("최대공약수 : "+result1);
        System.out.println("최소공배수 : "+result2);
	}
}
