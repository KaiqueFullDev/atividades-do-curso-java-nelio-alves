package Basico;
import java.util.Scanner;

//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

public class exercise01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número");
		int number = sc.nextInt();
		if (number > 0) {
		System.out.printf("O número %d é positivo", number);
		}
		else {
			System.out.printf("O número %d é negativo", number);
		}
		sc.close();
	}

}
