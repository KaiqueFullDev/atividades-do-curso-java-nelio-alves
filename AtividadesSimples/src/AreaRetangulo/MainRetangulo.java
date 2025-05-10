package AreaRetangulo;

import java.util.Scanner;

public class MainRetangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MedidaRetangulo retangulo = new MedidaRetangulo();
		
		System.out.print("Enter are the measures of the sides: ");
		retangulo.ladoRetangulo1 = sc.nextDouble();
		retangulo.ladoRetangulo2 = sc.nextDouble();
		
		System.out.println("Area: " + retangulo.area());
		System.out.println("Perimetro: " + retangulo.perimetro());
		System.out.println("Diagonal: " + retangulo.diagonal());

		
		sc.close();
	}

}
