package Basico;
import java.util.Scanner;

//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

public class exercise02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número");
		int number = sc.nextInt();
		if (number % 2 == 0) {
		System.out.printf("O número %d é par", number);
		}
		else {
			System.out.printf("O número %d é impar", number);
		}
		sc.close();
	}

}