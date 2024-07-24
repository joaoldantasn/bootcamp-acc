package atividade7;

public class Retangulo {
	
	private double lado1;
	private double lado2;
	private double area;
	private double perimetro;
	
	public Retangulo() {
		
	}

	public Retangulo(double lado1, double lado2) {
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
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
	
	public void calcularArea() {
		area = lado1 * lado2;
	}
	
	public void calcularPerimetro() {
		perimetro = 2 * lado1 + 2 * lado2;
	}
	
	
}
