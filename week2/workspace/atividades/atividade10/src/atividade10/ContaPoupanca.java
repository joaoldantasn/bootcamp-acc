package atividade10;

import java.time.LocalDate;

public class ContaPoupanca extends ContaBancaria{
	
	private static final double taxaDeJuros = 0.003;

	public ContaPoupanca(String numeroConta, double saldo) {
		super(numeroConta, saldo);
		// TODO Auto-generated constructor stub
	}

	public static double getTaxadejuros() {
		return taxaDeJuros;
	}

	@Override
	public void sacar(double valor) throws EstouroSaqueException {
		if(valor > 0 && valor <= getSaldo()) {
			setSaldo(getSaldo() - valor);
			extrato.add("Saque realizado: R$ " + valor + ", Data " + LocalDate.now());
		}else {
			throw new EstouroSaqueException("Saldo insuficiente para realização do saque.");
		}
	}

	@Override
	public void transferir(double valor, ContaBancaria destino) throws DepositoInvalidoException, EstouroSaqueException {
		if(valor > 0 && valor <= getSaldo()) {
			this.sacar(valor);
            destino.depositar(valor);
			extrato.add("Transferência realizada: R$ " + valor + " para a conta " + destino.getNumeroConta() + ", Data " + LocalDate.now());
			destino.extrato.add("Transferência recebida: R$ " + valor + " da conta " + getNumeroConta() + ", Data " + LocalDate.now());
		}else {
			System.out.println("Erro! Não foi possivel realizar essa operação");
		}
	}
	
	public void aplicarJuros() throws DepositoInvalidoException {
	        double juros = getSaldo() * taxaDeJuros;
	        depositar(juros);
	    }
	@Override
	public String exibirDetalhes() {
		StringBuilder extratoStr = new StringBuilder();
		extratoStr.append("* EXTRATO *").append("\n")
				.append("Número da conta: ").append(getNumeroConta()).append("\n")
		        .append("Saldo atual: ").append(getSaldo()).append("\n")
		        .append("Taxa de juros(%): ").append(getTaxadejuros()*100).append("\n")
		        .append("Movimentações da conta:\n");

		for (String item : extrato) {
			extratoStr.append(item).append("\n");
		}

		return extratoStr.toString();
	}

	
	
}
