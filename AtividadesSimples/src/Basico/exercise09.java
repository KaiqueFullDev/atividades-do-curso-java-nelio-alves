package exerciseWhile;
import java.util.Scanner;

public class exercise3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int clientes = 0, gasolina = 0, diesel = 0, etanol = 0;
		int combustivel;
		while (clientes != 1 || clientes != 2 || clientes != 3) {
				combustivel = sc.nextInt();
				if (combustivel == 1) {
					gasolina = gasolina + 1;
					clientes = clientes + 1;
				}
			else if (combustivel == 2) {
				diesel = diesel + 1;
				clientes = clientes + 1;
				}
			else if (combustivel == 3) {
					etanol = etanol + 1;
					clientes = clientes + 1;
					}
			else {
				System.out.println("Código inválido");
				}
			}
		System.out.printf("Gasolina = %d%nDiesel = %d%nEtanol = %d%nForem atendidos %d clientes", gasolina, diesel, etanol, clientes);
		sc.close();
		}
	}
