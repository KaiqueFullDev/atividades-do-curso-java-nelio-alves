package TestesDasAulas;

import java.util.Scanner;

public class TesteComPOO {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		Triangle a, b;
		a = new Triangle();
		b = new Triangle();
		
		System.out.println("Enter the measures of triangle A");
		
		a.lado1 = sc.nextDouble();
		a.lado2 = sc.nextDouble();
		a.lado3 = sc.nextDouble();
		
		double areaA = a.area();
		
		System.out.println("Enter for measures for triangle B");
		
		a.lado1 = sc.nextDouble();
		a.lado2 = sc.nextDouble();
		a.lado3 = sc.nextDouble();
		
		double areaB = b.area();
		
		sc.close();
		
	}

}