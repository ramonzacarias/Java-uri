package uri.beginner;

import java.util.Scanner;

public class Ex1005 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		double notaA, notaB, media;
		
		notaA = sc.nextDouble();
		notaB = sc.nextDouble();
		
		media = ((notaA*3.5)+(notaB*7.5))/11;
		
		System.out.printf("MEDIA = %.5f",media);
		System.out.println();
	}

}
