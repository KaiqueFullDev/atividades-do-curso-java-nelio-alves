package ContagemDeEstoque;

public class ProdutoEstoque {

	public String name;
	public double price;
	public int quantity;
	
	public int addProduct(int quantity){

		return this.quantity += quantity;
		
	}
	
	public double valorProducTotal() {
		
		return price * quantity;
		
	}
	
	public String toString() {
		
		return "Product: " + name + "\nPrice: " + price + "\nQuantity in stock: " + quantity;
		
	}

}
