package uri.beginner;

import java.util.Scanner;

public class Ex1010 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numeroPeca, qtdPeca;
		double valorPorPeca, totalPeca, total = 0;
	
		for (int i = 0; i < 2; i++) {
			
			numeroPeca = sc.nextInt();
			qtdPeca = sc.nextInt();
			valorPorPeca = sc.nextDouble();
			
			totalPeca = qtdPeca*valorPorPeca;
			
			total += totalPeca;
		}
		
		System.out.printf("VALOR A PAGAR: R$ %.2f",total);
		System.out.println();
	}

}
