package atividade8;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		String raio = JOptionPane.showInputDialog("Informe o raio do Círculo: ");
		
		
		Circulo circulo = new Circulo(Double.valueOf(raio));
		circulo.calcularArea();
		circulo.calcularPerimetro();
		
		//Valores Arredondados por causa do Math.round utilizado nos métodos
		JOptionPane.showMessageDialog(null, "A área do Círculo é: " + circulo.getArea(), "Resultado", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "O perímetro do Círculo é: " + circulo.getPerimetro(), "Resultado", JOptionPane.INFORMATION_MESSAGE);
		
		//System.out.printf("A área do Círculo é: %.2f", retangulo.getArea());
		//System.out.println();
		//System.out.printf("O Perímetro do Círculo é: %.2f", retangulo.getPerimetro());
		
	}
	
}
