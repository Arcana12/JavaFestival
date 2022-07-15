package YL;

import java.util.Scanner;

public class ex20 {

	public static void main(String[] args) {
		String[] subject = { "java", "web ", "and"};

        
        int[] score = new int[3];

        
        int sum = 0;
        double avg = 0.0;

        
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < score.length; i++) {
            System.out.print(subject[i] +"점수: ");
            score[i] = sc.nextInt();
            sum += score[i];
        }

        
        avg = (double) sum / (double) score.length;

        for(int i = 0; i<subject.length; i++) {
            System.out.println(subject[i] +":"+ score[i]);
        }

        
        System.out.println("sum: " + sum);
        System.out.println("avg: " + avg);

	}

}
