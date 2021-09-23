package uri.beginner;

import java.util.Scanner;

public class Ex1002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double pi = 3.14159;
		
		double raio = sc.nextDouble();
		double resultado = pi*Math.pow(raio, 2);
		System.out.printf("A=%.4f",resultado);
		System.out.println();
	}

}
