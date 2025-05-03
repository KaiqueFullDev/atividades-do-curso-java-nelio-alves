package Basico;
import java.util.Scanner;

//Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo

public class exercise08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite as coordenadas (X, Y)");
		int x = 1, y = 1;
		while(x != 0 && y != 0) {
			x = sc.nextInt();
			y = sc.nextInt();
			System.out.printf("(%d, %d)%n", x, y);
			if(x > 0 && y < 0) {
				System.out.println("Primeiro Quadrante");
			}
			else if(x > 0 && y > 0) {
				System.out.println("Segundo Quadrante");
			}
			else if(x < 0 && y < 0) {
				System.out.println("Terceiro Quadrante");
			}
			else {
				System.out.println("Quarto Quadrante");
			}
		}
		
		sc.close();
	}

}
