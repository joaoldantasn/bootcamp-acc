package sef.module2.sample;

public class Shirt {
	public String description;
	public char colorCode;
	public double price;
	
	public Shirt() {
		// TODO Auto-generated constructor stub
		System.out.println("Shirt contructor chamado");
		description = "Botafogo";
		colorCode = 'U';
		price = 130.00;
	}
	
	public void Display() {
		System.out.println("Descri��o da camisa: " + description);
		System.out.println("Cor da camisa: " + colorCode);
		System.out.println("Pre�o da Camisa: "+ price);
		System.out.println("---------------------------------------------");
	}
}
