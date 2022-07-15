package HJ;

import java.util.Scanner;

public class java20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]array = new int[3];
		Scanner sc = new Scanner(System.in);
		System.out.print("java 점수 : ");
		array[0]=sc.nextInt();
		System.out.print("web 점수 : ");
		array[1]=sc.nextInt();
		System.out.print("and 점수 : ");
		array[2]=sc.nextInt();
		int sum=array[0]+array[1]+array[2];
		int avg=0;
		System.out.println("java  : "+array[0]);
		System.out.println("web  : "+array[1]);
		System.out.println("and  : "+array[2]);
		System.out.println("sum : "+sum);
		System.out.println("avg : "+sum/array.length);
		}

}
