package Basico;
import java.util.Scanner;

//Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em ordem crescente ou decrescente.

public class exercise03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro valor:");
		int number1 = sc.nextInt();
		System.out.println("Digite o segundo valor:");
		int number2 = sc.nextInt();
		if (number1 % number2 == 0) {
			System.out.println("São múltiplos");
		}
		else if (number2 % number1 == 0) {
			System.out.println("São múltiplos");
		}
		else {
			System.out.println("Não são multiplos");
		}

		sc.close();
	}

}
