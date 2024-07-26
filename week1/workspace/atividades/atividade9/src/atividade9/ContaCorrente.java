package atividade9;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContaCorrente {
	
	private int numero;
	private double saldo;
	private Date data;
	private Cliente cliente;
	List<String> extrato = new ArrayList<>();

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

	public void depositar(double valorDepositado) throws DepositoInvalidoException {
		if(valorDepositado > 0) {
			saldo += valorDepositado;
			extrato.add("Depósito realizado: R$ " + valorDepositado + ", Data " + LocalDate.now());
		}else {
			throw new DepositoInvalidoException("Não é possivel realizar um depósito com esse valor.");
		}
	}
	
	public void sacar(double valorSacado) throws EstouroSaqueException {
		if(valorSacado > 0 && valorSacado <= saldo) {
			saldo -= valorSacado;
			extrato.add("Saque realizado: R$ " + valorSacado + ", Data " + LocalDate.now());
		}else {
			throw new EstouroSaqueException("Saldo insuficiente para realização do saque.");
		}
	}
	
	public String exibirExtrato() {
		StringBuilder extratoStr = new StringBuilder();
		extratoStr.append("* EXTRATO *").append("\n")
				.append("Número da conta: ").append(numero).append("\n")
		        .append("Nome: ").append(cliente.nomeCompleto()).append("\n")
		        .append("Cpf: ").append(cliente.getCpf()).append("\n")
		        .append("Saldo atual: ").append(saldo).append("\n")
		        .append("Movimentações da conta:\n");

		for (String item : extrato) {
			extratoStr.append(item).append("\n");
		}

		return extratoStr.toString();
	}
	
	public void transferir(ContaCorrente destino, double valor) throws DepositoInvalidoException {
		if(valor > 0 && valor <= saldo) {
			saldo -= valor;
			destino.depositar(valor);
			extrato.add("Transferência realizada: R$ " + valor + " para a conta " + destino.getNumero() + ", Data " + LocalDate.now());
			destino.extrato.add("Transferência recebida: R$ " + valor + " da conta " + numero + ", Data " + LocalDate.now());
		}else {
			System.out.println("Erro! Não foi possivel realizar essa operação");
		}
	}

}
