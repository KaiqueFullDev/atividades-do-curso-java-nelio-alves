package ContagemDeEstoque;

import java.util.Scanner;

public class MainEstoque {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ProdutoEstoque product = new ProdutoEstoque();
		
		System.out.print("Digict new product: ");
		product.name = sc.nextLine();
		sc.nextLine();
		System.out.print("Digit price the product: $");
		product.price = sc.nextDouble();
		System.out.print("Digict quantity the products: ");
		product.quantity = sc.nextInt();
		
		System.out.print(product);
		
		sc.close();
	}

}
