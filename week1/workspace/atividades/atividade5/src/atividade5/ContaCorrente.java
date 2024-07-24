package atividade5;

import java.util.Date;

public class ContaCorrente {
	
	private int numero;
	private double saldo;
	private Date data;
	private Cliente cliente;

	public ContaCorrente() {
		
	}

	public ContaCorrente(int numero, double saldo, Date data, Cliente cliente) {
		this.numero = numero;
		this.saldo = saldo;
		this.data = data;
		this.cliente = cliente;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void depositar(double valorDepositado) {
		if(valorDepositado > 0) {
			saldo += valorDepositado;
		}else {
			System.out.println("Erro! valor inválido");
		}
	}
	
	public void sacar(double valorSacado) {
		if(valorSacado > 0 && valorSacado <= saldo) {
			saldo -= valorSacado;
		}else {
			System.out.println("Erro! impossivel realizar essa operação");
		}
	}
	
	public String exibirExtrato() {
		return "Número da conta: " +
				numero + "\n" +
				"Nome: " +
				cliente.nomeCompleto() + "\n" +
				"Cpf: " +
				cliente.getCpf() + "\n" +
				"Saldo atual: " +
				saldo
		;
	}
	
	public void transferir(ContaCorrente destino, double valor) {
		if(valor > 0 && valor <= saldo) {
			saldo -= valor;
			destino.depositar(valor);
		}else {
			System.out.println("Erro! Não foi possivel realizar essa operação");
		}
	}

}
