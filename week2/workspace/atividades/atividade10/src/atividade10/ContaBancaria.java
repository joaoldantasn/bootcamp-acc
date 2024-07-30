package atividade10;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class ContaBancaria {
	
	private String numeroConta;
	private double saldo;
	List<String> extrato = new ArrayList<>();
	
	public ContaBancaria(String numeroConta, double saldo) {
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}
	
	
	
	public String getNumeroConta() {
		return numeroConta;
	}



	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}



	public double getSaldo() {
		return saldo;
	}



	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public List<String> getExtrato() {
		return extrato;
	}



	public void setExtrato(List<String> extrato) {
		this.extrato = extrato;
	}



	public void depositar(double valorDepositado) throws DepositoInvalidoException {
		if(valorDepositado > 0) {
			saldo += valorDepositado;
			extrato.add("Depósito realizado: R$ " + valorDepositado + ", Data " + LocalDate.now());
		}else {
			throw new DepositoInvalidoException("Não é possivel realizar um depósito com esse valor.");
		}
	}
	public abstract void sacar(double valor) throws EstouroSaqueException;
	public abstract void transferir(double valor, ContaBancaria conta) throws DepositoInvalidoException, EstouroSaqueException;
	public abstract String exibirDetalhes();
	
}
