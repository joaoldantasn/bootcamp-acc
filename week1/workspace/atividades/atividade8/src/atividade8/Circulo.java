package atividade8;

public class Circulo {

	private double raio;
	private double area;
	private double perimetro;
	
	public Circulo() {
		
	}

	public Circulo(double raio) {
		this.raio = raio;
	}
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

	//utilizei Math.round para arredondar
	public void calcularArea() {
		area = Math.round(Math.PI * raio * raio);
	}
	
	//utilizei Math.round para arredondar
	public void calcularPerimetro() {
		perimetro = Math.round(2 * Math.PI * raio);
	}
	
	
	
}
