package atividade5;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		Date data = new Date();
		
		Cliente cliente = new Cliente("João Lucas", "12345678", "Dantas");
		Cliente cliente2 = new Cliente("Mohamed", "11111111", "Salah");
		
		ContaCorrente conta = new ContaCorrente(1122, 1500.00, new Date(), cliente);
		ContaCorrente conta2 = new ContaCorrente(2211, 15000.00, new Date(), cliente2);
		
		System.out.println(conta.exibirExtrato());
		System.out.println();
		System.out.println(conta2.exibirExtrato());
		System.out.println("---------------------------");
		
		conta.depositar(70000);
		conta2.depositar(100);
		
		System.out.println(conta.exibirExtrato());
		System.out.println();
		System.out.println(conta2.exibirExtrato());
		System.out.println("---------------------------");
		
		conta.sacar(20000);
		conta2.sacar(10000);
		
		System.out.println(conta.exibirExtrato());
		System.out.println();
		System.out.println(conta2.exibirExtrato());
		System.out.println("---------------------------");
		
		conta.transferir(conta2, 3000);
		
		System.out.println(conta.exibirExtrato());
		System.out.println();
		System.out.println(conta2.exibirExtrato());
		System.out.println("---------------------------");
	}

}
