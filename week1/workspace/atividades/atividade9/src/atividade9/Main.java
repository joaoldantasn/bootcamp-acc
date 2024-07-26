package atividade9;

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
		
		try {
			conta.depositar(70000);
			conta2.depositar(-100);
		}catch(DepositoInvalidoException err) {
			err.printStackTrace();
		}
		
		
		System.out.println(conta.exibirExtrato());
		System.out.println();
		System.out.println(conta2.exibirExtrato());
		System.out.println("---------------------------");
		
		try {
			conta.sacar(20000000);
			conta2.sacar(10000);
		} catch (EstouroSaqueException err) {
			err.printStackTrace();
		}
		
	
		
		System.out.println(conta.exibirExtrato());
		System.out.println();
		System.out.println(conta2.exibirExtrato());
		System.out.println("---------------------------");
		
		try {
			conta.transferir(conta2, 3000);
		} catch (DepositoInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(conta.exibirExtrato());
		System.out.println();
		System.out.println(conta2.exibirExtrato());
		System.out.println("---------------------------");
	}

}
