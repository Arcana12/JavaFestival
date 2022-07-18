package YL;

import java.util.Scanner;

public class ex29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력>> ");
		int number = sc.nextInt();
		int [] arr = new int[number];
		int i =0;
		int j =0;
		while (number != 1){
		arr[i] = number % 2;
		number /= 2;
		if(number == 1){
		arr[i + 1] =1;
		j = i + 1;
		}
		i++;
		}
		for(int k = j; k >= 0; k--){
		System.out.print(arr[k] + " ");
		}

	}

}
