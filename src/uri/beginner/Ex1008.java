package uri.beginner;

import java.util.Scanner;

public class Ex1008 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number, horasTrab;
		double valorHoras, salary;
		
		number = sc.nextInt();
		horasTrab = sc.nextInt();
		valorHoras = sc.nextDouble();
		
		salary = horasTrab*valorHoras;
		
		System.out.println("NUMBER = "+number);
		System.out.printf("SALARY = U$ %.2f",salary);
		System.out.println();
	}

}
