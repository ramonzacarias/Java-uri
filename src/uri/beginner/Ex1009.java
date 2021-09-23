package uri.beginner;

import java.util.Scanner;

public class Ex1009 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double salarioFixo, montante, salarioTotal;
		
		String nome = sc.next();
		salarioFixo = sc.nextDouble();
		montante = sc.nextDouble();
		
		salarioTotal = (montante*0.15)+salarioFixo;
		
		System.out.printf("TOTAL = R$ %.2f",salarioTotal);
		System.out.println();

	}

}
