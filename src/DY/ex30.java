package DY;

import java.util.Scanner;

public class ex30 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int a = sc.nextInt();
		
		int[][] arr = new int[a][a];
		
		for (int i =0;i<arr.length;i++) {
			for(int j =0;j<arr[i].length;j++) {
				if(i%2==0) {
					arr[i][j]=a*i+j+1;
				}else {
					arr[i][j]=a*(i+1)-j;
				}
			}
		}
		for (int i =0;i<arr.length;i++) {
			for(int j =0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
			
		
		}
		
		
	}

