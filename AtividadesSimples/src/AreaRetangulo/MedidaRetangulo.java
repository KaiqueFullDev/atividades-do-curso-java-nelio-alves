package AreaRetangulo;

public class MedidaRetangulo {

	public double ladoRetangulo1;
	public double ladoRetangulo2;
	
	public double area() {
		
		return ladoRetangulo1 * ladoRetangulo2;
		
	}
	
	public double diagonal() {
		
		return Math.sqrt(Math.pow(ladoRetangulo1, 2) + Math.pow(ladoRetangulo2, 2));
		
	}

	public double perimetro() {
	
		return (ladoRetangulo1 + ladoRetangulo2) * 2;
	
	}
	
}
