package YL;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.print("1.소프트웨어 설계 >> ");
        arr[0] = sc.nextInt();
        System.out.print("2.소프트웨어 개발 >> ");
        arr[1] = sc.nextInt();
        System.out.print("3.데이터 베이스 구축 >> ");
        arr[2] = sc.nextInt();
        System.out.print("4.프로그래밍 언어 활용 >> ");
        arr[3] = sc.nextInt();
        System.out.print("5.정보시스템 구축관리 >> ");
        arr[4] = sc.nextInt();
        String st = "합격입니다!";
        
        int sum=arr[0];
        for(int i=0; i<5; i++) {
            sum+=arr[i];
            if(arr[i] < 8) {
                st = "탈락 입니다...";
                break;
            }
            System.out.print("");
            if(sum < 60) {
                st = "탈락 입니다...";
            } else {
                st = "합격입니다!";
            }

        }

        System.out.println(st);

	}

}
