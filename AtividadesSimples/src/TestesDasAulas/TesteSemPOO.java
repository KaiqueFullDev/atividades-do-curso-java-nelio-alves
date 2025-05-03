package TestesDasAulas;

import java.util.Scanner;

//Área de dois triângulos, indicando o maior deles, sem utilizar orientação a objetos

public class TesteSemPOO {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double area1, area2, area3, area4, area5, area6, areaX = 0, areaY = 0, lado123, lado456;
		boolean triangulo1Valido = false, triangulo2Valido = false;
		
		System.out.println("Insira os lados do triângulo 1");
		area1 = sc.nextDouble();
		area2 = sc.nextDouble();
		area3 = sc.nextDouble();

		System.out.println("Insira os lados do triângulo 2");
		area4 = sc.nextDouble();
		area5 = sc.nextDouble();
		area6 = sc.nextDouble();

		if (area1 + area2 > area3 && area2 + area3 > area1 && area1 + area3 > area2) {
			
			lado123 = (area1 + area2 + area3) / 2;
			areaX = Math.sqrt(lado123 * (lado123 - area1) * (lado123 - area2) * (lado123 - area3));
			triangulo1Valido = true;
		
		}
		else {
			System.out.println("Triângulo 1 inválido");
		}
		
		if (area4 + area5 > area6 && area4 + area6 > area5 && area5 + area6 > area4) {
			
			lado456 = (area4 + area5 + area6) / 2;
			areaY = Math.sqrt(lado456 * (lado456 - area4) * (lado456 - area5) * (lado456 - area6));
			triangulo2Valido = true;

			
		}
		else {
			
			System.out.println("Triângulo 2 inválido");
			
		}
		
		if (triangulo1Valido && triangulo2Valido) {
		System.out.printf("A área do triângulo 1 é %.2f%nA área do triângulo 2 é %.2f%n", areaX, areaY);
		
		if (areaX > areaY) {
			
			System.out.println("O triângulo 1 é maior!");
		
		} 
		
		else {
			
			System.out.println("O triÂngulo 2 é maior");
		}
		} else {
			
			System.out.println("Não é possível comparar as áreas!");
			
		}
		sc.close();
	}

}
