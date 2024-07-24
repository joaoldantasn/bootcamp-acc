package atividade7;

import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {
			
		String lado1 = JOptionPane.showInputDialog("Informe o lado1 do retangulo: ");
		String lado2 = JOptionPane.showInputDialog("Informe o lado2 do retangulo: ");
		
		
		Retangulo retangulo = new Retangulo(Double.valueOf(lado1),Double.valueOf(lado2));
		retangulo.calcularArea();
		retangulo.calcularPerimetro();
		
		JOptionPane.showMessageDialog(null, "A área do Retângulo é: " + retangulo.getArea(), "Resultado", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "O perímetro do Retângulo é: " + retangulo.getPerimetro(), "Resultado", JOptionPane.INFORMATION_MESSAGE);
		
		//System.out.printf("A área do Retângulo é: %.2f", retangulo.getArea());
		//System.out.println();
		//System.out.printf("O Perímetro do Retângulo é: %.2f", retangulo.getPerimetro());
		
	}
	
}
