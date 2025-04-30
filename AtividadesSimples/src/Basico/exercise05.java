package Basico;
import java.util.Scanner;

//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.

public class exercise05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double lanche1 = 4.00;
		double lanche2 = 4.50;
		double lanche3 = 5.00;
		double lanche4 = 2.00;
		double lanche5 = 1.50;
		double lancheTotal = 0;
		char finalizarCompra = 'n';
		while(finalizarCompra == 'n') {
		System.out.println("1___cachorro-quente___4.00");
		System.out.println("2___X-Salada___4.50");
		System.out.println("3___X-Bacon___5.00");
		System.out.println("4___Torrada___2.00");
		System.out.println("5___Refrigerante___1.50");
		System.out.println("Adicionar qual produto?");
		
		int codigo = sc.nextInt();
		
		switch (codigo){
			case 1:
				lancheTotal += lanche1;
			break;
			case 2:
				lancheTotal += lanche2;
				break;
			case 3:
				lancheTotal += lanche3;
				break;
			case 4:
				lancheTotal += lanche4;
				break;
			case 5:
				lancheTotal += lanche5;
				break;
			default:
				System.out.println("Valor inválido");
		
		}
		
		System.out.println("Deseja finalizar a compra?(s/n)");
		sc.nextLine(); //consome uma linha, para evitar conflitos com o código
		finalizarCompra = sc.nextLine().charAt(0);
		}
		System.out.printf("O valor total foi de %.2f%n", lancheTotal);

		
		sc.close();
	}

}
