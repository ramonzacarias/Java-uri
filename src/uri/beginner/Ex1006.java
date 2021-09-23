package uri.beginner;

import java.util.Scanner;

public class Ex1006 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double notaA, notaB, notaC, media;
		
		notaA = sc.nextDouble();
		notaB = sc.nextDouble();
		notaC = sc.nextDouble();
		
		media = ((notaA*2)+(notaB*3)+(notaC*5))/10;
		
		System.out.printf("MEDIA = %.1f",media);
		System.out.println();
		

	}

}
