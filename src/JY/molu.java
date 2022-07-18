import java.util.Scanner;

public class molu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력>>");
		int input = sc.nextInt();
		
		String answer = Integer.toBinaryString(input);
		//int로 받은 input을 이진수로 변환해 string answer로 저장
		char[] tmp = new char[answer.length()];
		//배열 tmp는 answer의 길이
		for (int i = 0; i < answer.length(); i++) {
			tmp[i] = answer.charAt(i);
		}
		for(char s : tmp) {
			System.out.print(s + " ");
		}
		
		
	}
}
