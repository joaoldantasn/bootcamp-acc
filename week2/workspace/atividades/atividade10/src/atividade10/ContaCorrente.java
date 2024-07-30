package atividade10;

import java.time.LocalDate;

public class ContaCorrente extends ContaBancaria{
	
	private static final double taxaOperacao = 0.015;
	
	public ContaCorrente(String numeroConta, double saldo) {
		super(numeroConta, saldo);
	}

	public static double getTaxaOperacao() {
		return taxaOperacao;
	}

	@Override
	public void sacar(double valor) throws EstouroSaqueException {
		double valorTotal = valor + (valor * taxaOperacao);
		if(valorTotal  > 0 && valorTotal  <= getSaldo()) {
			setSaldo(getSaldo() - valorTotal);
			extrato.add("Saque realizado: R$ " + valor + ", Data " + LocalDate.now());
		}else {
			throw new EstouroSaqueException("Saldo insuficiente para realização do saque.");
		}
	}

	@Override
	public void transferir(double valor, ContaBancaria destino) throws DepositoInvalidoException, EstouroSaqueException {
		double valorComTaxa = valor + (valor * taxaOperacao);
		if(valorComTaxa  > 0 && valorComTaxa  <= getSaldo()) {
			this.sacar(valor);
            destino.depositar(valor);
			extrato.add("Transferência realizada: R$ " + valor + " para a conta " + destino.getNumeroConta() + ", Data " + LocalDate.now());
			destino.extrato.add("Transferência recebida: R$ " + valor + " da conta " + getNumeroConta() + ", Data " + LocalDate.now());
		}else {
			System.out.println("Erro! Não foi possivel realizar essa operação");
		}
	}

	@Override
	public String exibirDetalhes() {
		StringBuilder extratoStr = new StringBuilder();
		extratoStr.append("* EXTRATO *").append("\n")
				.append("Número da conta: ").append(getNumeroConta()).append("\n")
		        .append("Saldo atual: ").append(getSaldo()).append("\n")
		        .append("Taxa de operação(%): ").append(getTaxaOperacao()*100).append("\n")
		        .append("Movimentações da conta:\n");

		for (String item : extrato) {
			extratoStr.append(item).append("\n");
		}

		return extratoStr.toString();
	}

}
